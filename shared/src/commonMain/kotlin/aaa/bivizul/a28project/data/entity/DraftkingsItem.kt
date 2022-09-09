package aaa.bivizul.a28project.data.entity

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class DraftkingsItem(
    @SerialName("id") val id: Int,
    @SerialName("title") val title: String,
    @SerialName("description") val description: String,
    @SerialName("inwards") val inwards: List<Inward>,
)