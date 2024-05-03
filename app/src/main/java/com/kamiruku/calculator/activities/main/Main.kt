package com.kamiruku.calculator.activities.main

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceManager
import com.kamiruku.calculator.AtlasInfo
import com.kamiruku.calculator.SettingValues
import com.kamiruku.calculator.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL

class Main : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        var region = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        SettingValues.setAllValues(prefs)
        region = SettingValues.region

        lifecycleScope.launch(Dispatchers.IO) {
            downloadAtlasData()
        }
    }

    private fun downloadAtlasData() {
        val currentTimestamp = getCurrentTimeStamp()
        val storedTimestamp = getStoredTimeStamp()

        Log.d("CURRENT_TIME_STAMP", currentTimestamp.toString())
        Log.d("STORED_TIME_STAMP", storedTimestamp.toString())

        if (storedTimestamp == currentTimestamp) return

        val path = filesDir
        val atlasDirectory = File(path, "atlasDocuments")
        atlasDirectory.mkdirs()
        val niceFile = File(atlasDirectory, "nice_servant_$region.json")

        val dupeFile = File(atlasDirectory, "nice_servant_$region-1.json")
        dupeFile.delete()

        val url = when (region) {
            "NA" -> URL("https://api.atlasacademy.io/export/NA/nice_servant.json")
            "JP" -> URL("https://api.atlasacademy.io/export/JP/nice_servant_lang_en.json")
            else -> URL("https://api.atlasacademy.io/export/NA/nice_servant.json")
        }

        val connection = url.openConnection() as HttpURLConnection
        connection.setRequestProperty("Accept-Encoding", "gzip")
        connection.connect()

        url.openStream().use { input ->
            FileOutputStream(dupeFile).use { output ->
                input.copyTo(output)
            }
        }

        niceFile.delete()
        dupeFile.copyTo(niceFile)
        dupeFile.delete()
        SettingValues.updateSPTimeStamp(currentTimestamp)

        Log.d("STORED_TIME_STAMP", SettingValues.timestampNA.toString())
    }

    private fun getCurrentTimeStamp(): Int {
        val jsonString = URL("https://api.atlasacademy.io/info").readText()
        val info = Json.decodeFromString<AtlasInfo>(jsonString)

        return when (region) {
            "NA" -> info.nA.timestamp
            "JP" -> info.jP.timestamp
            "CN" -> info.cN.timestamp
            "KR" -> info.kR.timestamp
            "TW" -> info.tW.timestamp
            else -> info.nA.timestamp
        }
    }

    private fun getStoredTimeStamp(): Int {
        return when (region) {
            "NA" -> SettingValues.timestampNA
            "JP" -> SettingValues.timestampJP
            "CN" -> SettingValues.timestampCN
            "KR" -> SettingValues.timestampKR
            "TW" -> SettingValues.timestampTW
            else -> SettingValues.timestampNA
        }
    }
}