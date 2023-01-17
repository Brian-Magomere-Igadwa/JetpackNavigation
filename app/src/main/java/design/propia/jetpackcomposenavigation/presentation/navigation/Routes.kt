package design.propia.jetpackcomposenavigation.presentation.navigation

sealed class Routes(
    val route:String
){
    object Home:Routes("home")
    object Login:Routes("login")
    object Onboarding:Routes("onboarding")
    object SignUp:Routes("signup")
}
