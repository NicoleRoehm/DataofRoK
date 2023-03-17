package com.example.dataofRoK

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogInViewModel:ViewModel (){

    private var _iD = MutableLiveData<List<Int>>()
    val id : LiveData <List<Int>>
    get() = _iD

    fun writeID(){

    }


}