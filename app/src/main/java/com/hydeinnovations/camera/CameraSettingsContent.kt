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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CameraSettingsContent(modifier: Modifier = Modifier) {
    var showCameraSettings by remember { mutableStateOf(false) }
Box(
    modifier.clip(shape = RoundedCornerShape(12.dp))
        .fillMaxWidth()
        .fillMaxHeight()
    .background(Color.Red.copy(alpha = 0.5f))
    .clickable { showCameraSettings = false }

){

    Column(
        modifier = Modifier
            .padding(top=100.dp, start = 40.dp, end = 40.dp, bottom = 150.dp),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Image(
            painter = painterResource(R.drawable.baseline_cancel_24),
            contentScale = ContentScale.Crop,
            contentDescription = ""
        )

        Spacer(
            modifier = modifier
                .fillMaxHeight(0.1f)
                .fillMaxWidth()
        )

        Box(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Black.copy(alpha = 0.5f))

        ){
            Column(
                modifier = Modifier.fillMaxSize()
            ) {

                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.12f)
                        .clip(shape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
                        .background(Color.Blue)
                )

                Spacer(
                    modifier = modifier
                        .fillMaxHeight(0.02f)
                        .fillMaxWidth()
                )

                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.12f)
                        .background(Color.Blue)
                )

                Spacer(
                    modifier = modifier
                        .fillMaxHeight(0.02f)
                        .fillMaxWidth()
                )

               Box(modifier = modifier
                   .fillMaxWidth()
                   .fillMaxHeight(0.68f)
                   .background(Color.Blue)
               ){

                   Column() {
                       Row {
                           Box(
                               modifier = modifier
                                   .fillMaxWidth()
                                   .fillMaxHeight(0.48f)
                                   .background(Color.Green)
                           )

                           Spacer(modifier.fillMaxWidth(0.12f).fillMaxHeight())

                           Box(
                               modifier = modifier
                                   .fillMaxWidth()
                                   .fillMaxHeight(0.48f)
                                   .background(Color.Green)
                           )
                       }

                       Spacer(modifier.fillMaxWidth().fillMaxHeight(0.12f))

                       Row {
                           Box(
                               modifier = modifier
                                   .fillMaxWidth()
                                   .fillMaxHeight(0.48f)
                                   .background(Color.Green)
                           )

                           Spacer(modifier.fillMaxWidth(0.12f).fillMaxHeight())

                           Box(
                               modifier = modifier
                                   .fillMaxWidth()
                                   .fillMaxHeight(0.48f)
                                   .background(Color.Green)
                           )
                       }
                   }

               }

                Spacer(
                    modifier = modifier
                        .fillMaxHeight(0.02f)
                        .fillMaxWidth()
                )

                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.45f)
                        .background(Color.Blue)
                )




//                Row(modifier
//                    .fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(8.dp)
//
//                ){
//
//                    Box(
//                        modifier = modifier
//                            .width(200.dp)
//                            .height(180.dp)
//                            .background(Color.Blue)
//                    )
//
//
//                    Box(
//                        modifier = modifier
//                            .width(200.dp)
//                            .height(180.dp)
//                            .background(Color.Blue)
//                    )
//
//                }
//
//                Spacer(
//                    modifier = modifier
//                        .fillMaxHeight(0.02f)
//                        .fillMaxWidth()
//                )



//                Row(modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight(0.32f),
//                    horizontalArrangement = Arrangement.spacedBy(8.dp)
//
//                ){
//
//                    Box(
//                        modifier = modifier
//                            .width(200.dp)
//                            .height(180.dp)
//                            .background(Color.Blue)
//                    )
//
//                    Box(
//                        modifier = modifier
//                            .width(200.dp)
//                            .height(180.dp)
//                            .background(Color.Blue)
//                    )
//
//                    {
//                        Column(modifier = modifier.fillMaxSize()) {
//                            Row(modifier = modifier.fillMaxWidth())
//                            {
//
//                                Box(
//                                    modifier = modifier
//                                        .width(95.dp)
//                                        .height(85.dp)
//                                        .background(Color.Red)
//                                )
//
//                                Spacer(modifier.width(10.dp))
//
//                                Box(
//                                    modifier = modifier
//                                        .width(95.dp)
//                                        .height(85.dp)
//                                        .background(Color.Red)
//                                )
//
//                            }
//
//                            Spacer(modifier = modifier.fillMaxWidth().height(10.dp))
//
//
//                            Row(modifier = modifier.fillMaxWidth())
//                            {
//
//                                Box(
//                                    modifier = modifier
//                                        .width(95.dp)
//                                        .height(85.dp)
//                                        .background(Color.Red)
//                                )
//
//                                Spacer(modifier.width(10.dp))
//
//                                Box(
//                                    modifier = modifier
//                                        .width(95.dp)
//                                        .height(85.dp)
//                                        .background(Color.Red)
//                                )
//
//                            }
//
//
//
//
//
//                        }
//
//
//
//
//
//
//                    }
//
//                }

//                Spacer(
//                    modifier = modifier
//                        .fillMaxHeight(0.02f)
//                        .fillMaxWidth()
//                )
//
//                Box(
//                    modifier = modifier
//                        .fillMaxWidth()
//                        .fillMaxHeight(0.12f)
//                        .background(Color.Blue)
//                )

            }



        }
    }

}



}