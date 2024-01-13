package osbm.vasyliianski_animatory.povodyrchyk.DukhovaKrynytsia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import osbm.vasyliianski_animatory.povodyrchyk.MainMenuActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class WellSpiritCongratulationsActivity : AppCompatActivity() {
    private lateinit var buttonEndWS: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_wellspirit_congratulations)

        buttonEndWS = findViewById(R.id.WellSpiritEndButton)
        buttonEndWS.setOnClickListener {
            endQuest()
        }
    }

    private fun endQuest() {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
    }
}