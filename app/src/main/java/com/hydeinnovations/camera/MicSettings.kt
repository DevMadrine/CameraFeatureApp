package com.hydeinnovations.camera

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MicSettings:ViewModel() {
    var isDialogShown by mutableStateOf(false)
        private set

    fun onMicClick(){
        isDialogShown = true
    }

    fun onDismiss(){
        isDialogShown = false
    }
}