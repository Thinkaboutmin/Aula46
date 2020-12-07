package com.trab.aula42.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.trab.aula42.dao.ContatoDAO
import com.trab.aula42.model.Contato

@Database(
        entities = [Contato::class],
        version = 1
)
abstract class DatabaseService : RoomDatabase() {
    abstract fun contatoDAO(): ContatoDAO

    companion object {
        @Volatile
        private var instance: DatabaseService? = null
        private val LOCK = Any()
        operator fun invoke(context: Context) = instance
                ?: synchronized(LOCK) {
                    instance ?: buildDatabase(context).also { instance = it }
                }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context, DatabaseService::class.java, "wallet.db").build()
    }
}