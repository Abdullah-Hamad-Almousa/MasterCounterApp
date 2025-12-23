package com.mysticbyte.mastercounterapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mysticbyte.mastercounterapp.theme.IdTextApp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mastercounterapp.composeapp.generated.resources.Res
import mastercounterapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {

    Box(
        modifier = Modifier
            .background(Color(0xFF232323))
            .fillMaxSize()
    ){

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){

            Box(

            ){

            }

            Column(
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Text(
                    text = IdTextApp.textApp,
                    fontSize = 12.sp,
                    color = Color(0xFF9A9A9A),
                    modifier = Modifier.padding(6.dp),
                    textDecoration = TextDecoration.Underline
                )
            }

        }

    }

}