package com.example.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val data = MutableLiveData<String>()

    init {
        startTimer()
    }

    fun startTimer() {
        object : CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                data.value = (millisUntilFinished/1000).toString()
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }
        }.start()
    }
}