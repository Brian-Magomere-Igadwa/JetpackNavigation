package design.propia.jetpackcomposenavigation.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import design.propia.jetpackcomposenavigation.presentation.authentication.AuthViewModel

@Preview
@Composable
fun HomeScreen(viewModel: AuthViewModel) {
    Log.d("test","->Home Screen")
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Wooo Welcome TO the Home Screen")
        
    }
}