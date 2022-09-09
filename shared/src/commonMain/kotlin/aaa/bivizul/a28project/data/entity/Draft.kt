package aaa.bivizul.a28project.data.entity

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class Draft(
    @SerialName("draftmm") val draftmm: String,
    @SerialName("draftsim") val draftsim: String,
    @SerialName("draftid") val draftid: String,
    @SerialName("draftl") val draftl: String,
    @SerialName("draftt") val draftt: String,
)