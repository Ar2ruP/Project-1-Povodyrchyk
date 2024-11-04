package osbm.vasyliianski_animatory.povodyrchyk.Pohonya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.MainMenuActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class PohonyaCongratulationsActivity : AppCompatActivity() {
    private lateinit var buttonEndP: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_pohonya_finish)

        buttonEndP = findViewById(R.id.MariaEndButton)
        buttonEndP.setOnClickListener {
            endQuest()
        }
    }

    private fun endQuest() {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
    }
}