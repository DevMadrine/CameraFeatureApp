package com.hydeinnovations.camera


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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MicSettingsContent(
    modifier: Modifier = Modifier,
//    onOptionSelected: (Boolean) -> Unit
) {
    var showMicSettings by remember { mutableStateOf(false) }


    Box(
        modifier = modifier
            .background(Color.Red.copy(alpha = 0.5f))
            .clickable { showMicSettings = false }
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxHeight(0.025f)
                    .fillMaxWidth(0.4f)
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
                    .fillMaxSize(0.9f)
                    .padding(top = 15.dp)
                    .background(
                        color = Color.Blue, shape = RoundedCornerShape(12.dp)

                    ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.6f)
                            .fillMaxHeight(0.3f)
                            .background(color = Color.Red, shape = RoundedCornerShape(25.dp))
                    ) {
                        var state by remember { mutableStateOf(true) }
                        Row(
                            modifier = Modifier.padding(8.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AudioVideoButton(
                                name = "Audio In",
                                onClick = {
                                    if (state) {
                                        state = false
                                    } else {
                                        state = true
                                    }
                                },
                                selected = state,
                            )
                            AudioVideoButton(
                                name = "Video In",
                                onClick = {
                                    if (state) {
                                        state = false
                                    } else {
                                        state = true
                                    }
                                },
                                selected = !state,
                            )
                        }
                    }

                    FieldComponent(
                        icon = R.drawable.ic_radio_button_checked,
                        contentDescription = "",
                        modifier = modifier
                            .fillMaxSize(0.95f)
                            .fillMaxHeight(0.3f)
                            .background(color = Color.White, shape = RoundedCornerShape(50.dp)),

                        text = "Phone's microphone",
                        contentScale = ContentScale.Crop
                    )

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
fun FieldComponent(
    text: String,
    icon: Int,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,

) {
    Button(
        modifier = modifier
            .size(45.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.Red)
        ,
       onClick = {}
    ) {
       Row(){
           Text(
               text = text

           )

           Image(
               painter = painterResource(id = icon),
               contentDescription = contentDescription,
               modifier = Modifier.size(24.dp),
               contentScale = contentScale,
               colorFilter = ColorFilter.tint(Color.Red)

           )
       }
    }
}


//@Preview()
//@Composable
//fun AudioVideoButtonPreview() {
//    var state by remember { mutableStateOf(true) }
//    Row {
//        AudioVideoButton(
//            name = "Audio In",
//            onClick = { selected ->
//                if (!selected) {
//                    state = !state
//                }
//            },
//            selected = state,
//        )
//        AudioVideoButton(
//            name = "Video In",
//            onClick = { selected ->
//                if (!selected) {
//                    state = !state
//                }
//            },
//            selected = !state,
//        )
//    }
//}



