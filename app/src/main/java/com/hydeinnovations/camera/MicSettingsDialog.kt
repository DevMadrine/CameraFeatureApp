package com.hydeinnovations.camera

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties


@Composable
fun MicSettingsDialog(
    onDismiss:()->Unit,
    onConfirm:()->Unit
) {
   Dialog(onDismissRequest = {
       onDismiss()
   },
       properties = DialogProperties(
           usePlatformDefaultWidth = false
       )
   ) {
       Card(
           elevation = CardDefaults.cardElevation(
               defaultElevation = 5.dp
           ),
           shape = RoundedCornerShape(15.dp),
           modifier = Modifier
               .fillMaxWidth(0.95f)
               .border(1.dp, color = Color.Blue, shape = RoundedCornerShape(15.dp)),

       ) {
           Column(modifier = Modifier
               .fillMaxSize()
               .padding(15.dp),
               verticalArrangement = Arrangement.spacedBy(25.dp)

           ) {
               Box(
                   modifier = Modifier
                       .width(50.dp)
                       .height(10.dp)
                       .background(Color.White)
               )

             Text(
                 text = "INPUT CONFIG",
                 style = MaterialTheme.typography.headlineMedium,
                 textAlign = TextAlign.Center,
                 fontWeight = FontWeight.Bold
             )
           }
       }


   }
}