package com.example.imagescomposerotation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardStack(innerPadding)
                }
            }
        }
    }


}

@Composable
private fun CardStack(innerPadding: PaddingValues) {
    for(i in 0..20){
        Card (modifier = Modifier.size(200.dp).graphicsLayer {
            translationX =
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