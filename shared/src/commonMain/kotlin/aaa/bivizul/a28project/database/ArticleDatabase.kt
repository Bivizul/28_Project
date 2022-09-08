package aaa.bivizul.a28project.database

internal interface ArticleDatabase {

    fun getAll(): List<ArticleEntity>

    fun getById(id: Long): ArticleEntity
}
