package com.vishu.uifigma

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun OnBoard1(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.splash_background)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.splash_background)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.aman),
                contentDescription = "Logo",
                modifier = Modifier.size(120.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.onboarding_image),
                contentDescription = "Logo",
                modifier = Modifier.size(220.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Welcome to Amanbanks",
                fontSize = 25.sp,
                color = colorResource(id = R.color.white)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Your best selection for financial transaction.",
                fontSize = 8.sp,
                maxLines = 1,
                modifier = Modifier.wrapContentSize(),
                color = colorResource(id = R.color.white)
            )
            Spacer(modifier = Modifier.height(70.dp))
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    colorResource(id = R.color.white),
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {  },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 80.dp, start = 60.dp, end = 60.dp, bottom = 20.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0F80B8),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(14.dp)
            ) {
                Text(text = "Log In")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.weight(1f).padding(start = 60.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Or",
                    modifier = Modifier.padding(vertical = 8.dp),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.width(8.dp))

                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.weight(1f).padding(end = 60.dp)
                )
            }


            TextButton(
                onClick = { navController.navigate("home") }
            ) {
                Text(
                    text = "Go to Home Page", color = colorResource(id = R.color.bank),
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                    )
                )
            }

        }

    }


}