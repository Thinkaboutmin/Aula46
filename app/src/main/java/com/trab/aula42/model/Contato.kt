package com.trab.aula42.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contato(
        @PrimaryKey(autoGenerate = true)
        val id: Int?,
        val nome: String,
        val numero: String
)