package design.propia.jetpackcomposenavigation.presentation.authentication.onboarding

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import design.propia.jetpackcomposenavigation.presentation.authentication.AuthViewModel

@Preview
@Composable
fun OnboardingScreen(viewModel: AuthViewModel) {
    Log.d("wueh", "->Onboarding Screen")
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Karibu Onboarding")
        Button(
            onClick = viewModel::showSignUp, shape = RoundedCornerShape(50.dp)
        ) {
            Text(text = "Get Started")


        }
    }
}