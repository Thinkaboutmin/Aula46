package com.trab.aula42.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.trab.aula42.database.DatabaseService
import com.trab.aula42.model.Contato

class MainViewModel(val database: DatabaseService) : ViewModel() {
    val contatos = MutableLiveData<List<Contato>>()

    fun addContato() {

    }
}