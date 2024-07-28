package com.vishu.uifigma

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier.statusBarsPadding(),
        topBar = {
            TopBar(
                onBackNavClicked = { Toast.makeText(context, "Menu", Toast.LENGTH_LONG).show() }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(bottom = 130.dp),
                backgroundColor = colorResource(id = R.color.purple_200),
                onClick = {
                    Toast.makeText(context, "HELLO , I am chatBot", Toast.LENGTH_LONG).show()
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.chatbot),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 80.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.main),
                    contentDescription = "Welcome Image",
                    modifier = Modifier
                        .size(250.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Text(
                    text = "Welcome to Aman Bank",
                    style = MaterialTheme.typography.h5.copy(fontSize = 22.sp),
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    contentPadding = PaddingValues(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.weight(1f).padding(top = 30.dp)
                ) {
                    items(6) { index ->
                        when (index) {
                            0 -> FeatureButton("Account Details", R.drawable.acd) { /* Handle click */ }
                            1 -> FeatureButton("Recent Transactions", R.drawable.rcd) { /* Handle click */ }
                            2 -> FeatureButton("Card Details", R.drawable.cdd) { /* Handle click */ }
                            3 -> FeatureButton("Locate ATM", R.drawable.atm) { /* Handle click */ }
                            4 -> FeatureButton("Locate Branch", R.drawable.bank) { /* Handle click */ }
                            5 -> FeatureButton("Open Account", R.drawable.ggp) { /* Handle click */ }
                        }
                    }
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd)
                    //.padding(top = 16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = colorResource(id = R.color.splash_background),
                            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                        )
                       .padding( 16.dp)
                        .height(120.dp)
                ) {
                    androidx.compose.material3.Button(
                        onClick = { /* Handle Login */ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally)
                            .height(70.dp).padding(top = 16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text(text = "Log In")
                    }
                }
            }
        }
    }
}

@Composable
fun FeatureButton(text: String, icon: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = text,
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = text,
                fontSize = 10.sp,
                color = Color.Black,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun TopBar(
    onBackNavClicked: () -> Unit = {}
) {
    TopAppBar(
        title = {
            Image(
                painter = painterResource(id = R.drawable.aman),
                contentDescription = "Logo",
                modifier = Modifier
                    .heightIn(max = 30.dp)
            )
        },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.splash_background),
        navigationIcon = {
            IconButton(onClick = { onBackNavClicked() }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    tint = Color.White,
                    contentDescription = null
                )
            }
        }
    )
}
