package design.propia.jetpackcomposenavigation.presentation.authentication.login

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import design.propia.jetpackcomposenavigation.presentation.authentication.AuthViewModel

@Preview
@Composable
fun LoginScreen(viewModel: AuthViewModel) {
    Log.d("test","->Login Screen")
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick =  viewModel::showHome) {
            Text(text = "Welcome Log In")


        }
    }
}