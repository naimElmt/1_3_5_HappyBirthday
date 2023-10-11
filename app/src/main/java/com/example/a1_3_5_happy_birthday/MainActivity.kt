package com.example.a1_3_5_happy_birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a1_3_5_happy_birthday.ui.theme._1_3_5_Happy_BirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _1_3_5_Happy_BirthdayTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingImage(stringResource(R.string.texto_felicidades), stringResource(R.string.texto_firma))
                }
            }
        }
    }
}
@Composable
fun FelicidadesDe(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(text = message, lineHeight = 100.sp, textAlign = TextAlign.Center, fontSize = 90.sp)
        Text(text = from, fontSize = 30.sp, modifier = Modifier.padding(19.dp).align(alignment = Alignment.End))
    }
}
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {

    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = null, contentScale = ContentScale.Crop, alpha = 0.5F
        )
        FelicidadesDe(
            message = message, from = from, modifier = Modifier.fillMaxSize().padding(10.dp)
        )
    }
}
@Preview(showBackground = false)
@Composable
private fun BirthdayCardPreview() {
    _1_3_5_Happy_BirthdayTheme {
        GreetingImage(
            stringResource(R.string.texto_felicidades),
            stringResource(R.string.texto_firma)
        )
    }
}