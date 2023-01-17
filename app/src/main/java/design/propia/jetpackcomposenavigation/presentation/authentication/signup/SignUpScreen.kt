package design.propia.jetpackcomposenavigation.presentation.authentication.signup

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
fun SignUpScreen(viewModel: AuthViewModel) {
    Log.d("test","->Sign UP Screen")
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = viewModel::showLogin ) {
            Text(text = "Sign Up WIth us")

        }
    }
}