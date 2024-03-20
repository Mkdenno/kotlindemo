package com.example.myapp

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val painter = painterResource(id = R.drawable.kenya)
            val description="I love Kenya"
            val title= "KENYA"

            Box(modifier = Modifier
                .fillMaxSize(0.5f)
                .padding(16.dp)
            )
            {
                ImageCArd(
                    painter = painter,
                    contentDescription = description,
                    title =title
                )
            }




        }
    }
}

@Composable
fun ImageCArd(
    painter: Painter,
    contentDescription: String,
    title:String,
    modifier: Modifier =Modifier
    ) {
    Card (
        modifier =modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp)

    ){
    Box(modifier = Modifier
        .height(200.dp)
    ){
        Image(
            painter = painter,
            contentDescription =contentDescription,
            contentScale = ContentScale.Crop
            )
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors=listOf(
                        Color.Transparent,
                        Color.Black

                    ),
                    startY = 300f
                )

            )
        )
        {

        }
        
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
            contentAlignment = Alignment.BottomStart
        ){
         Text(title, style = TextStyle(color=Color.White, fontSize = 16.sp) )
        }
    }
    }



}

