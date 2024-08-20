package com.example.moviebooking

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    private var _isReady = MutableStateFlow(false)
    var isReady = _isReady.asStateFlow()

    init {
        viewModelScope.launch {
            delay(500L)
            _isReady.value = true
        }
    }
}