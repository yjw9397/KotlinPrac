package com.example.mmart

import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberBackdropScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mmart.ui.theme.MmARtTheme
import java.util.Stack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MmARtTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Box {
        androidx.compose.foundation.Image(
            painter = painterResource(R.drawable.bg),
            modifier = Modifier.fillMaxSize(),
            contentDescription = "배경",
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier
                .align(Alignment.TopStart)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
        androidx.compose.foundation.Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "로고",
            modifier = Modifier
                .padding(16.dp)
                .width(150.dp)
                .height(100.dp)
        )
            androidx.compose.foundation.Image(
                painter = painterResource(R.drawable.place),
                contentDescription = "지점",
                modifier = Modifier
                    .padding(16.dp)
                    .width(100.dp)
                    .height(100.dp)
            )

        }
    }
    Box(
        Modifier
            .background(color = Color.Gray)
            .padding(top = 200.dp)

    ) {
        Column() {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                androidx.compose.foundation.Image(
                    painter = painterResource(R.drawable.category_1),
                    contentDescription = "가공식품",
                    modifier = Modifier
                        .padding(16.dp)
                        .size(80.dp)
                )
                androidx.compose.foundation.Image(
                    painter = painterResource(R.drawable.category_2),
                    contentDescription = "신선식품",
                    modifier = Modifier
                        .padding(16.dp)
                        .size(80.dp)
                )
                androidx.compose.foundation.Image(
                    painter = painterResource(R.drawable.category_3),
                    contentDescription = "일상용품",
                    modifier = Modifier
                        .padding(16.dp)
                        .size(80.dp)
                )
                androidx.compose.foundation.Image(
                    painter = painterResource(R.drawable.category_4),
                    contentDescription = "의약품",
                    modifier = Modifier
                        .padding(16.dp)
                        .size(80.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview(){
    Main()
}