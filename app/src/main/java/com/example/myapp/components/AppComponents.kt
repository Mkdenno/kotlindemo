package com.example.myapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.MarkEmailRead
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NormalTextComponent(
    value:String,

) {
    Text(
        text =value,
        modifier = Modifier
            .height(30.dp)
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
            color= Color.Gray,
        textAlign = TextAlign.Center
        )
    
}

@Composable
fun HeadingTextComponent(
    value:String,

    ) {
    Text(
        text =value,
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color= Color.Gray,
        textAlign = TextAlign.Center
    )

}

@Composable
fun MyTextField(
    labelValue:String,

) {
    var textValue by remember {mutableStateOf("") }

    OutlinedTextField(
        label={
              Text(text = labelValue)
        },
        value =textValue,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray),

        keyboardOptions = KeyboardOptions.Default,
        onValueChange = {
        textValue=it
    },
        leadingIcon = {
            Icon(imageVector =Icons.Default.AccountBox,

                contentDescription =null )
        }

    )
    
}

@Composable
fun EmailInput(
    labelValue:String,

    ) {
    var textValue by remember {mutableStateOf("") }

    OutlinedTextField(
        label={
            Text(text = labelValue)
        },
        value =textValue,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray),

        keyboardOptions = KeyboardOptions.Default,
        onValueChange = {
            textValue=it
        },
        leadingIcon = {
            Icon(imageVector =Icons.Default.MarkEmailRead,

                contentDescription =null )
        }

    )

}

@Composable
fun PasswordInput(value: String,
                  placeholder: String,
                  label: String="Password",
                  onValueChange:(String)->Unit,
                  modifier: Modifier = Modifier
) {
    var passwordVisible by remember {mutableStateOf(false) }
    var password by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = value,
        placeholder = {
                      Text(text = "Password")
                      },
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray),
        leadingIcon = {
            Icon(imageVector =Icons.Default.Password,

                contentDescription =null )
        },

       keyboardOptions = KeyboardOptions(
           keyboardType = KeyboardType.Password
       ),
       visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),

       trailingIcon = {
           IconButton(onClick = {
               passwordVisible=!passwordVisible
           }) {
               Icon(imageVector =if (passwordVisible) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
                   contentDescription =null,
                   )

           }
       }
   )

}