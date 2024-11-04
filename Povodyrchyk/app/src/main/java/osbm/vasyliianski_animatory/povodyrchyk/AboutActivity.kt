package osbm.vasyliianski_animatory.povodyrchyk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    private lateinit var buttonAP: Button
    private lateinit var buttonAA: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        buttonAP = findViewById(R.id.About_Povodyrchyk)
        buttonAP.setOnClickListener {
            aboutP()
        }
        buttonAA = findViewById(R.id.About_VAIF)
        buttonAA.setOnClickListener {
            aboutVAIF()
        }
    }
    private fun aboutVAIF() {
        val playPohonya = Intent(this, osbm.vasyliianski_animatory.povodyrchyk.About.VAIFActivity::class.java)
        startActivity(playPohonya)
    }

    private fun aboutP() {
        val playBoronyava = Intent(this, osbm.vasyliianski_animatory.povodyrchyk.About.AboutPovodyrchykActivity::class.java)
        startActivity(playBoronyava)
    }
}