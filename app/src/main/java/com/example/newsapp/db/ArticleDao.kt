package com.example.newsapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.newsapp.models.Article
import retrofit2.http.DELETE

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun getUpsert(article: Article):Long

    @Query("SELECT * FROM articles")
    fun getArtilces():LiveData<List<Article>>

    @DELETE
    suspend fun deleteArtilce(article: Article)
}