package osbm.vasyliianski_animatory.povodyrchyk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed({ startActivity(Intent(this@SplashScreenActivity, MainMenuActivity::class.java)) }, 2000)
        setContentView(R.layout.activity_splashscreen)
    }
}
