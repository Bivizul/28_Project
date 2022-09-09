package aaa.bivizul.a28project.data.network

import aaa.bivizul.a28project.data.draftutil.Draftcon.URLDRAFT
import aaa.bivizul.a28project.data.draftutil.Draftcon.URLDRAFTKINGS
import aaa.bivizul.a28project.data.entity.Draft
import aaa.bivizul.a28project.data.entity.Draftkings
import aaa.bivizul.a28project.data.entity.Draftres
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.http.ContentType.Application.Json
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class DraftApi {

    val client = HttpClient(CIO) {
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.INFO
        }
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun getDraftkings(): Draftkings {
        val url = URLDRAFTKINGS
        val response = client.get(url)
        println("DraftApi getDraftkings : ${response.status}")
        val body = response.body<Draftkings>()
        return body
    }

    suspend fun getDraftres(draft: Draft): Draftres {
        val url = URLDRAFT
        val response = client.post(url) {
            contentType(Json)
            setBody(draft)
        }
        println("DraftApi getDraftres : ${response.status}")
        val body = response.body<Draftres>()
        return body
    }

}