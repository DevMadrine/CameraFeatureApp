package com.hydeinnovations.camera

import androidx.camera.view.LifecycleCameraController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun CameraScreen(controller: LifecycleCameraController) {
    var showMicSettings by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        CameraPreview(controller, Modifier.fillMaxSize())
        CameraNav(
            modifier = Modifier
                .align(Alignment.BottomCenter)
            ,
            onNavEvent = { event ->
                when (event) {
                    NavEvent.MicSettings -> showMicSettings = true
                    NavEvent.CameraSettings -> TODO()
                }
            }
        )

        if (showMicSettings) {

            MicSettingsContent(
                modifier = Modifier
                    .fillMaxHeight(0.4f)
                    .fillMaxWidth(0.95f)
                    .clip(RoundedCornerShape(12.dp))
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 80.dp)
            )
        }
    }
}











//}


