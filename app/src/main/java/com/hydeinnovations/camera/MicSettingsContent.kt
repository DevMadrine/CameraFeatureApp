package com.hydeinnovations.camera


import android.widget.RadioGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


enum class InputMode { Audio, Video }


@Composable
fun MicSettingsContent(
    modifier: Modifier = Modifier,
) {
    var inputMode by remember { mutableStateOf(InputMode.Audio) }
    var showMicSettings by remember { mutableStateOf(false) }


    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(12.dp))
            .background(Color.Red.copy(alpha = 0.5f))
            .clickable { showMicSettings = false }

    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(
                modifier = Modifier
                    .height(5.dp)
                    .width(100.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(14.dp)),
            )

            Text(
                modifier = Modifier.padding(top = 15.dp),
                text = "INPUT CONFIG",
                fontWeight = FontWeight.Medium,
                color = Color.White
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .wrapContentHeight()
                    .padding(top = 15.dp, bottom = 15.dp)
                    .background(
                        color = Color.Blue, shape = RoundedCornerShape(12.dp)

                    ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp)

                ) {

                    Box(
                        modifier = Modifier
                            .width(210.dp)
                            .height(50.dp)
                            .background(color = Color.Red, shape = RoundedCornerShape(25.dp))
                    ) {
//                        var state by remember { mutableStateOf(true) }
                        Row(
                            modifier = Modifier.padding(10.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AudioVideoButton(
                                name = "Audio In",
//                                onClick = {
//                                    if (state) {
//                                        state = false
//                                    } else {
//                                        state = true
//                                    }
//                                },
                                onClick = { inputMode = InputMode.Audio },
//                                selected = state,
                                selected = inputMode == InputMode.Audio,
                            )
                            AudioVideoButton(
                                name = "Video In",
//                                onClick = {
//                                    if (state) {
//                                        state = false
//                                    } else {
//                                        state = true
//                                    }
//                                },
                                onClick = { inputMode = InputMode.Video },
//                                selected = !state,
                                selected = inputMode == InputMode.Video
                            )
                        }
                    }
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth(0.9f)
//                            .fillMaxHeight(0.45f)
//                            .background(color = Color.White, shape = RoundedCornerShape(25.dp))
//
//
//                    )
////                    {
////                        Row (
////                            modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 10.dp, bottom = 10.dp),
////                            horizontalArrangement = Arrangement.SpaceAround,
////                            verticalAlignment = Alignment.CenterVertically
////                        ){
////                            Text(
////                                text = "Phone microphone"
////                            )
////                            Spacer(modifier = Modifier.fillMaxWidth(0.8f))
////                            Image(
////                                painter = painterResource(id = R.drawable.ic_radio_button_checked),
////                                contentDescription = "",
////                                modifier = Modifier.size(24.dp),
////                                contentScale = ContentScale.Crop,
////                                colorFilter = ColorFilter.tint(Color.Red)
////
////                            )
////
////                        }
////                    }


                    when (inputMode) {
                        InputMode.Audio -> AudioContent()
                        InputMode.Video -> VideoContent()
                    }


                }
            }
        }
    }


}

@Composable
fun AudioVideoButton(
    name: String,
    modifier: Modifier = Modifier,
    onClick: (Boolean) -> Unit,
    selected: Boolean,

    ) {
    Button(
        onClick = {
            onClick(selected)
        },
        shape = RoundedCornerShape(50.dp),
        modifier = modifier
            .width(100.dp)
            .height(40.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (selected) Color.White else Color.Transparent,
            contentColor = if (selected) Color.Black else Color.White
        ),
        contentPadding = PaddingValues(start = 8.dp, end = 8.dp)
    ) {
        Text(
            text = name
        )
    }
}


@Composable
fun BoxItems(text: String, icon: Int) {

    Box(
        modifier = Modifier
            .width(400.dp)
            .height(40.dp)
            .background(color = Color.White, shape = RoundedCornerShape(25.dp))
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text)
            Image(
                painter = painterResource(id = icon),
                contentDescription = "Selected",
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color.Red)
            )
        }

    }

}


@Composable
private fun AudioContent() {
    BoxItems(
        text = "Phone Microphone",
        icon = R.drawable.ic_radio_button_checked
    )
}

@Composable
private fun VideoContent() {
    Column(Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        BoxItems(
            text = "Front Camera",
            icon = R.drawable.ic_radio_button_checked
        )

        BoxItems(
            text = "Back Camera",
            icon = R.drawable.ic_radio_button_checked
        )

        BoxItems(
            text = "Back Telephoto Camera",
            icon = R.drawable.ic_radio_button_checked
        )

        BoxItems(
            text = "Back Dual Camera",
            icon = R.drawable.ic_radio_button_checked
        )
    }
}


