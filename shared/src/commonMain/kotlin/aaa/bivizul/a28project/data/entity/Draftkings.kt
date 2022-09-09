package aaa.bivizul.a28project.data.entity

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class Draftkings(
    @SerialName("draftkings") val draftkings: ArrayList<DrafkingsItem>
)
