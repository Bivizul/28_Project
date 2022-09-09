package aaa.bivizul.a28project.data.entity

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class Inward(
    @SerialName("id") val id: Int,
    @SerialName("subtitle") val subtitle: String,
    @SerialName("text") val text: String
)