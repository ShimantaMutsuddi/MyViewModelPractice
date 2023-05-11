package com.chutyrooms.myviewmodelpractice

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue:Int): ViewModel() {
    var count : Int=initialValue

    fun increment() {
        count++
    }
    fun decrement(){
        count--
    }
}