package com.hydeinnovations.camera

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp



@Composable fun CameraNav(modifier: Modifier){
   Row(
       modifier = Modifier.fillMaxSize()
           .padding(top = 650.dp),
       horizontalArrangement = Arrangement.SpaceAround,

   ){
       IconComposable(
           imageRes = R.drawable.ic_camera,
           contentDescription = "",
           modifier = Modifier.padding(top = 15.dp),
           contentScale = ContentScale.Crop,
           colorFilter = ColorFilter.tint(Color.White)
       )

       IconComposable(
           imageRes = R.drawable.ic_flash_auto,
           contentDescription = "",
           modifier = Modifier.padding(top = 15.dp),
           contentScale = ContentScale.Crop,
           colorFilter = ColorFilter.tint(Color.White)
       )

       Image(
           painter = painterResource(id = R.drawable.ic_record_button),
           modifier = Modifier.size(80.dp),
           contentDescription = "",
           contentScale = ContentScale.Crop
       )

       IconComposable(
           imageRes = R.drawable.ic_mic,
           contentDescription = "",
           modifier = Modifier.padding(top=15.dp),
           contentScale = ContentScale.Crop,
           colorFilter = ColorFilter.tint(Color.White)
       )

       IconComposable(
           imageRes = R.drawable.ic_settings,
           contentDescription = "",
           modifier = Modifier.padding(15.dp),
           contentScale = ContentScale.Crop,
           colorFilter = ColorFilter.tint(Color.White)
       )
   }
}


@Composable
fun IconComposable(
    imageRes: Int,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
    colorFilter: ColorFilter
) {
    Box(
        modifier = modifier
            .size(45.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.Red)
            .clickable {}
        ,

        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = contentDescription,
            modifier = Modifier.size(24.dp),
            contentScale = contentScale,
            colorFilter = colorFilter
        )
    }
}
