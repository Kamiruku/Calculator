package com.kamiruku.calculator

import android.content.SharedPreferences

class SettingValues {
    companion object {
        private const val PREF_GAME_REGION: String = "region"
        var region: String = "NA"
        private const val PREF_TIMESTAMP_NA: String = "timestampNA"
        var timestampNA = 0
        private const val PREF_TIMESTAMP_JP: String = "timestampJP"
        var timestampJP = 0
        private const val PREF_TIMESTAMP_CN: String = "timestampCN"
        var timestampCN = 0
        private const val PREF_TIMESTAMP_KR: String = "timestampKR"
        var timestampKR = 0
        private const val PREF_TIMESTAMP_TW: String = "timestampTW"
        var timestampTW = 0

        var prefs: SharedPreferences? = null

        fun setAllValues(settings: SharedPreferences) {
            prefs = settings
            region = prefs?.getString(PREF_GAME_REGION, "NA") ?: "NA"
            when (region) {
                "NA" -> timestampNA = prefs?.getInt(PREF_TIMESTAMP_NA, 0) ?: 0
                "JP" -> timestampJP = prefs?.getInt(PREF_TIMESTAMP_JP, 0) ?: 0
                "CN" -> timestampCN = prefs?.getInt(PREF_TIMESTAMP_CN, 0) ?: 0
                "KR" -> timestampKR = prefs?.getInt(PREF_TIMESTAMP_KR, 0) ?: 0
                "TW" -> timestampTW = prefs?.getInt(PREF_TIMESTAMP_TW, 0) ?: 0
            }
        }

        fun updateSPTimeStamp(timestamp: Int) {
            val editor = prefs?.edit()

            when (region) {
                "NA" -> editor?.putInt(PREF_TIMESTAMP_NA, timestamp)
                "JP" -> editor?.putInt(PREF_TIMESTAMP_JP, timestamp)
                "CN" -> editor?.putInt(PREF_TIMESTAMP_CN, timestamp)
                "KR" -> editor?.putInt(PREF_TIMESTAMP_KR, timestamp)
                "TW" -> editor?.putInt(PREF_TIMESTAMP_TW, timestamp)
            }

            editor?.commit()
            updateStoredTimeStamp()
        }

        private fun updateStoredTimeStamp() {
            when (region) {
                "NA" -> timestampNA = prefs?.getInt(PREF_TIMESTAMP_NA, 0) ?: 0
                "JP" -> timestampJP = prefs?.getInt(PREF_TIMESTAMP_JP, 0) ?: 0
                "CN" -> timestampCN = prefs?.getInt(PREF_TIMESTAMP_CN, 0) ?: 0
                "KR" -> timestampKR = prefs?.getInt(PREF_TIMESTAMP_KR, 0) ?: 0
                "TW" -> timestampTW = prefs?.getInt(PREF_TIMESTAMP_TW, 0) ?: 0
            }
        }
    }
}