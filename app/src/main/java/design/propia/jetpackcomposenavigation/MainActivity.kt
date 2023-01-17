package design.propia.jetpackcomposenavigation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import design.propia.jetpackcomposenavigation.presentation.authentication.AuthViewModel
import design.propia.jetpackcomposenavigation.presentation.authentication.login.LoginScreen
import design.propia.jetpackcomposenavigation.presentation.authentication.onboarding.OnboardingScreen
import design.propia.jetpackcomposenavigation.presentation.authentication.signup.SignUpScreen
import design.propia.jetpackcomposenavigation.presentation.home.HomeScreen
import design.propia.jetpackcomposenavigation.presentation.navigation.Routes
import design.propia.jetpackcomposenavigation.ui.theme.JetpackComposeNavigationTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<AuthViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {


                    val navController = rememberNavController()
                    viewModel.navigateTo = {
                        Log.d("Wazi", it)
                        navController.navigate(it)
                    }

                    NavHost(
                        navController = navController,
                        startDestination = Routes.Onboarding.toString()
                    ) {
                        composable(route=Routes.Onboarding.toString()) { OnboardingScreen(viewModel = viewModel) }
                        composable(route="login") { LoginScreen(viewModel = viewModel) }
                        composable(route="signup") { SignUpScreen(viewModel = viewModel) }
                        composable(route=Routes.Home.toString()) { HomeScreen(viewModel = viewModel) }

                        /*...*/
                    }


                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeNavigationTheme {
        Greeting("Android")
    }
}