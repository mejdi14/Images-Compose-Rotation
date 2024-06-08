package com.example.imagescomposerotation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imagescomposerotation.ui.theme.ImagesComposeRotationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImagesComposeRotationTheme {
                    Box(modifier = Modifier.fillMaxSize()){
                        for(i in 0..20)
                        Card (modifier = Modifier.align(Alignment.Center)
                            .height(200.dp)
                            .width(100.dp)
                            .graphicsLayer {
                                translationX = -20f * i
                            }){

                        }
                }
            }
        }
    }


}

@Composable
private fun CardStack(innerPadding: PaddingValues, modifier: Modifier) {
    for(i in 0..20){
        Box (modifier = modifier.background(Color.Red)
            .height(200.dp)
            .width(100.dp)
            .graphicsLayer {
                rotationX = 100f


            }){

        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ImagesComposeRotationTheme {
        Greeting("Android")
    }
}