package com.kamiruku.calculator


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AtlasInfo(
    @SerialName("CN")
    val cN: CN = CN(),
    @SerialName("JP")
    val jP: JP = JP(),
    @SerialName("KR")
    val kR: KR = KR(),
    @SerialName("NA")
    val nA: NA = NA(),
    @SerialName("TW")
    val tW: TW = TW()
) {
    @Serializable
    data class CN(
        @SerialName("hash")
        val hash: String = "",
        @SerialName("timestamp")
        val timestamp: Int = 0
    )

    @Serializable
    data class JP(
        @SerialName("hash")
        val hash: String = "",
        @SerialName("timestamp")
        val timestamp: Int = 0
    )

    @Serializable
    data class KR(
        @SerialName("hash")
        val hash: String = "",
        @SerialName("timestamp")
        val timestamp: Int = 0
    )

    @Serializable
    data class NA(
        @SerialName("hash")
        val hash: String = "",
        @SerialName("timestamp")
        val timestamp: Int = 0
    )

    @Serializable
    data class TW(
        @SerialName("hash")
        val hash: String = "",
        @SerialName("timestamp")
        val timestamp: Int = 0
    )
}