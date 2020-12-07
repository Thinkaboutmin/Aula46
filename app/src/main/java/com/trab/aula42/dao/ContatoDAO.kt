package com.trab.aula42.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.trab.aula42.model.Contato

@Dao
interface ContatoDAO {
    @Insert
    suspend fun insert(contato: Contato)

    @Query("SELECT * FROM Contato")
    suspend fun all(): List<Contato>
}