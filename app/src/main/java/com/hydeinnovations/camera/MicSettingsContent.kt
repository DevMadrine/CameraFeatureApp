package com.hydeinnovations.camera


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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MicSettingsContent(
    modifier: Modifier = Modifier
) {
    var showMicSettings by remember { mutableStateOf(false) }

    Box(modifier = modifier
        .background(Color.Red.copy(alpha = 0.5f))
        .clickable { showMicSettings = false }
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(modifier = Modifier
                .fillMaxHeight(0.025f)
                .fillMaxWidth(0.4f)
                .background(color = Color.White, shape = RoundedCornerShape(12.dp)),
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
            ){
Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(top = 10.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceAround
){

    Box(
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Red, shape = RoundedCornerShape(25.dp))


    )
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Red, shape = RoundedCornerShape(20.dp))

    )
}
            }
        }
    }


}