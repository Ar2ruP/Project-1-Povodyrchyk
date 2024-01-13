package osbm.vasyliianski_animatory.povodyrchyk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainMenuActivity : AppCompatActivity() {
    private lateinit var buttonPlay: Button
    private lateinit var buttonAbout: Button
    private lateinit var buttonExit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        buttonPlay = findViewById(R.id.MainButton_Play)
        buttonPlay.setOnClickListener {
            playStart()
        }
        buttonAbout = findViewById(R.id.MainButtonAbout)
        buttonAbout.setOnClickListener {
            openAbout()
        }
        buttonExit = findViewById(R.id.MainButtonExit)
        buttonExit.setOnClickListener {
            finish()
            exitProcess(0)
        }
    }

    private fun playStart() {
        val play = Intent(this, MapsListActivity::class.java)
        startActivity(play)
    }

    private fun openAbout() {
        val seeAbout = Intent(this, AboutActivity::class.java)
        startActivity(seeAbout)
    }
}