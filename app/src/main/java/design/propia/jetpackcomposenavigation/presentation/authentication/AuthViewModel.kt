package design.propia.jetpackcomposenavigation.presentation.authentication

import android.util.Log
import androidx.lifecycle.ViewModel

class AuthViewModel:ViewModel() {
    lateinit var navigateTo:(String)->Unit

    //navigation callbacks
    fun showSignUp(){
        Log.d("Aha","Seen")
        navigateTo("signup")
    }

    fun showOnboarding(){
        navigateTo("onboarding")
    }
    fun showLogin(){
        navigateTo("login")
    }
    fun showHome(){
        navigateTo("home")
    }
}