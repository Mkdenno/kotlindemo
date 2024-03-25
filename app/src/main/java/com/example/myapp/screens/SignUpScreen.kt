package com.example.myapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapp.components.EmailInput
import com.example.myapp.components.HeadingTextComponent
import com.example.myapp.components.MyTextField
import com.example.myapp.components.NormalTextComponent
import com.example.myapp.components.PasswordInput

@Composable
fun SignUpScreen() {
    var password by remember {
        mutableStateOf("")
    }
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
    ){
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = "Hello There")
            HeadingTextComponent(value = "CREATE ACCOUNT")
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(labelValue = "Full Name")
            Spacer(modifier = Modifier.height(20.dp))

            MyTextField(labelValue = "Last Name")
            Spacer(modifier = Modifier.height(20.dp))

            EmailInput(labelValue = "Email")
            Spacer(modifier = Modifier.height(20.dp))

            PasswordInput(value = password, placeholder="Password", onValueChange ={
                password=it
            } )

        }

        
    }
    
}



@Composable
fun PreviewSignUpScreen() {
    SignUpScreen()
}