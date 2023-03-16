package com.example.dataofRoK

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogInViewModel:ViewModel (){

    private var _iD = MutableLiveData<Int>()
    val id : LiveData <Int>
    get() = _iD

    fun writeID(){


    }
}