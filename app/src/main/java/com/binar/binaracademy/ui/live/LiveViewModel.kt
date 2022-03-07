package com.binar.binaracademy.ui.live

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Live Fragment"
    }
    val text: LiveData<String> = _text
}