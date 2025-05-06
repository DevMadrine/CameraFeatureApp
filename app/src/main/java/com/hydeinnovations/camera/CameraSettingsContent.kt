package com.hydeinnovations.camera

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
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
import androidx.compose.ui.unit.sp


@Composable
fun CameraSettingsContent(modifier: Modifier = Modifier) {
    var showCameraSettings by remember { mutableStateOf(false) }
    var zoomLevel by remember { mutableStateOf(50f) }
Box(
    modifier.clip(shape = RoundedCornerShape(12.dp))
         .fillMaxWidth()
         .fillMaxHeight()

         .clickable { showCameraSettings = false }
)
{

    Column(
        modifier = Modifier
            .padding(top=100.dp, start = 40.dp, end = 40.dp, bottom = 150.dp),
        verticalArrangement = Arrangement.SpaceBetween

    )
    {
        Image(
            modifier = modifier.align(alignment = Alignment.End),
            painter = painterResource(R.drawable.baseline_cancel_24),
            contentScale = ContentScale.Crop,
            contentDescription = "",
            colorFilter = ColorFilter.tint(Color.White)

        )

        Spacer(
            modifier = modifier
                .fillMaxHeight(0.1f)
                .fillMaxWidth()
        )

        Box(
            modifier = modifier
                .height(510.dp)
                .width(348.dp)
                .clip(shape = RoundedCornerShape(20.dp))

        )
        {
            Column(modifier = modifier
                .fillMaxSize()

            ){

                Box(modifier = modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.Black.copy(alpha = 0.5f))
                    .clip(shape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))

                ){
                    Column(
                        modifier = modifier
                            .padding(10.dp)
                    ) {
                        Text(
                            text = "Lens Data",
                            color = Color.White,
                            fontSize = 12.sp


                        )

                        Text(
                            text = "Samsung Galaxy z Fold 5 26mm",
                            color = Color.White,
                            fontSize = 12.sp
                        )
                    }
                }

                Spacer(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(8.dp)
                )

                Box(modifier = modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.Black.copy(alpha = 0.5f))
                    .clip(shape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))

                )

                {
                    Column (modifier = modifier.padding(start = 8.dp)){
                        Text(
                            text = "Zoom",
                            color = Color.White,
                            fontSize = 12.sp
                        )

                        Slider(
                            value = zoomLevel,
                            onValueChange = { zoomLevel = it },
                            valueRange = 0f..100f,
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(start = 24.dp, top = 8.dp, bottom = 8.dp, end = 24.dp),
                            colors = SliderDefaults.colors(
                                thumbColor = Color.White,
                                activeTrackColor = Color(0xFFD32F2F), // Red
                                inactiveTrackColor = Color.LightGray,
                                activeTickColor = Color.Transparent,
                                inactiveTickColor = Color.Transparent
                            )
                        )
                    }

                }


                Spacer(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(8.dp)
                )

                Row(modifier = modifier.fillMaxWidth()){

                    Box(modifier = modifier
                        .fillMaxWidth(.48f)
                        .height(129.dp)
                        .background(Color.Black.copy(alpha = 1f))


                    )
                    {
                        Column(modifier=modifier.fillMaxHeight().padding(top=8.dp, bottom = 40.dp), verticalArrangement = Arrangement.SpaceBetween) {
                            Text(
                                modifier = modifier.padding(start = 10.dp),
                                text = "Lens",
                                color = Color.White,
                                fontSize = 12.sp
                            )

                            Row (
                                modifier = modifier.fillMaxWidth().padding(start = 6.dp, end = 6.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                Image(
                                    painter = painterResource(id=R.drawable.ic_arrow_left),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    colorFilter = ColorFilter.tint(Color.White)
                                )


                                Text(

                                    text = "Wide",
                                    color = Color.White,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 18.sp
                                )


                                Image(
                                    painter = painterResource(id=R.drawable.ic_arrow_right),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    colorFilter = ColorFilter.tint(Color.White)
                                )

                            }
                        }
                    }

                    Spacer(modifier
                        .width(8.dp)
                    )

                    Box(modifier = modifier
                        .fillMaxWidth(/*170.dp*/)
                        .height(129.dp)
                        .background(Color.Black.copy(alpha = 1f))
                    )

                    {
                        Column(modifier=modifier.fillMaxHeight().padding(top=8.dp, bottom = 40.dp), verticalArrangement = Arrangement.SpaceBetween) {
                            Text(
                                modifier = modifier.padding(start = 10.dp),
                                text = "Microphone",
                                color = Color.White,
                                fontSize = 12.sp
                            )

                            Row (
                                modifier = modifier.fillMaxWidth().padding(start = 6.dp, end = 6.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                Image(
                                    painter = painterResource(id=R.drawable.ic_arrow_left),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    colorFilter = ColorFilter.tint(Color.White)
                                )


                                Text(

                                    text = "Phone mic",
                                    color = Color.White,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 18.sp
                                )


                                Image(
                                    painter = painterResource(id=R.drawable.ic_arrow_right),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    colorFilter = ColorFilter.tint(Color.White)
                                )

                            }
                        }
                    }

                }

                Spacer(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(8.dp)
                )

                Row(modifier = modifier.fillMaxWidth()){

                    Box(modifier = modifier
                        .fillMaxWidth(.48f)
                        .height(129.dp)
                        .background(Color.Black.copy(alpha = 1f))

                    ){
                        Column() {
                            Text(
                                modifier = modifier.padding(10.dp),
                                text = "Position",
                                color = Color.White,
                                fontSize = 12.sp
                            )

                            Image(
                                modifier = modifier
                                    .padding(start = 45.dp)
                                    .width(60.dp)
                                    .height(60.dp),
                                painter = painterResource(id = R.drawable.ic_camera_switch),
                                colorFilter = ColorFilter.tint(Color.White),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                    }

                    Spacer(modifier
                        .width(8.dp)
                    )

                    Box(modifier = modifier
                        .fillMaxWidth(/*170.dp*/)
                        .height(129.dp)


                    ){
                       Column(modifier = modifier.fillMaxSize()) {
                           Row(modifier = modifier.fillMaxWidth().fillMaxHeight(.48f)){

                               Box(modifier.fillMaxWidth(.48f).fillMaxHeight()
                                   .background(Color.Black.copy(alpha = 1f))
                               )

                               {
                                   Column(
                                       modifier = modifier.padding(top = 6.dp, bottom = 8.dp, start = 24.dp, end = 24.dp),
                                       horizontalAlignment = Alignment.CenterHorizontally,
                                       verticalArrangement = Arrangement.Center
                                   ) {
                                       Text(
                                           text = "Flash",
                                           color = Color.White,
                                           fontSize = 10.sp

                                       )

                                       Image(
                                           painter = painterResource(id = R.drawable.ic_flash),
                                           contentDescription = "",
                                           contentScale = ContentScale.Crop,
                                           colorFilter = ColorFilter.tint(Color.White)
                                       )
                                   }
                               }



                               Spacer(modifier = modifier.width(9.dp))
                               Box(modifier.fillMaxWidth().fillMaxHeight()
                                   .background(Color.Black.copy(alpha = 1f))
                               )
                               {
                                   Column(
                                       modifier = modifier.padding(top = 6.dp, bottom = 8.dp, start = 24.dp, end = 24.dp),
                                       horizontalAlignment = Alignment.CenterHorizontally,
                                       verticalArrangement = Arrangement.Center
                                   ) {
                                       Text(
                                           text = "Flash",
                                           color = Color.White,
                                           fontSize = 10.sp

                                       )

                                       Image(
                                           painter = painterResource(id = R.drawable.ic_mic),
                                           contentDescription = "",
                                           contentScale = ContentScale.Crop,
                                           colorFilter = ColorFilter.tint(Color.White)
                                       )
                                   }
                               }

                           }

                           Spacer(modifier = modifier.height(8.dp))

                           Row(modifier = modifier.fillMaxWidth().fillMaxHeight()){

                               Box(modifier.fillMaxWidth(.48f).fillMaxHeight()
                                   .background(Color.Black.copy(alpha = 1f))
                               )
                               {
                                   Column(
                                       modifier = modifier.padding(top = 6.dp, bottom = 8.dp, start = 24.dp, end = 24.dp),
                                       horizontalAlignment = Alignment.CenterHorizontally,
                                       verticalArrangement = Arrangement.Center
                                   ) {
                                       Text(
                                           text = "A/F",
                                           color = Color.White,
                                           fontSize = 10.sp

                                       )

                                       Image(
                                           painter = painterResource(id = R.drawable.ic_focus),
                                           contentDescription = "",
                                           contentScale = ContentScale.Crop,
                                           colorFilter = ColorFilter.tint(Color.White)
                                       )
                                   }
                               }


                               Spacer(modifier = modifier.width(9.dp))
                               Box(modifier.fillMaxWidth().fillMaxHeight()
                                   .background(Color.Black.copy(alpha = 1f))
                               )

                               {
                                   Column(
                                       modifier = modifier.padding(top = 6.dp, bottom = 8.dp, start = 24.dp, end = 24.dp),
                                       horizontalAlignment = Alignment.CenterHorizontally,
                                       verticalArrangement = Arrangement.Center
                                   ) {
                                       Text(
                                           text = "Grid",
                                           color = Color.White,
                                           fontSize = 10.sp

                                       )

                                       Image(
                                           painter = painterResource(id = R.drawable.ic_grid),
                                           contentDescription = "",
                                           contentScale = ContentScale.Crop,
                                           colorFilter = ColorFilter.tint(Color.White)
                                       )
                                   }
                               }

                           }
                       }
                    }

                }




                Spacer(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(8.dp)
                )

                Box(modifier = modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(Color.Black.copy(alpha = 1f))

                ){
                    Column (
                        modifier = modifier

                    ){
                        Text(
                            modifier = modifier.padding(start = 10.dp),
                            text = "Theme",
                            color = Color.White,
                            fontSize = 12.sp
                        )

                        var state by remember { mutableStateOf(true) }

                        Box(  modifier = Modifier
                            .width(280.dp)
                            .height(45.dp)
                            .padding(start = 20.dp)
                            .background(color = Color.Red, shape = RoundedCornerShape(25.dp))) {

                            Row(
                                modifier = Modifier.padding(start=30.dp, end = 30.dp, top = 10.dp, bottom = 10.dp),
                                horizontalArrangement = Arrangement.spacedBy(20.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                AudioVideoButton(
                                    name = "Light Mode",
                                    modifier = modifier,
                                    onClick = {
                                        if (state) {
                                            state = false
                                        } else {
                                            state = true
                                        }
                                    },

                                    selected = state

                                )

                                AudioVideoButton(
                                    name = "Dark Mode",
                                    modifier = modifier,
                                    onClick = {
                                        if (state) {
                                            state = false
                                        } else {
                                            state = true
                                        }
                                    },

                                    selected = !state

                                )


                            }
                        }

                    }
                }

            }

        }
    }

}

}