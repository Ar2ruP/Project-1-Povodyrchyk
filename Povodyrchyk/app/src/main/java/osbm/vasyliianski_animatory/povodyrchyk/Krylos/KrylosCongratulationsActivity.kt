package osbm.vasyliianski_animatory.povodyrchyk.Krylos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.MainMenuActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class KrylosCongratulationsActivity : AppCompatActivity() {
    private lateinit var buttonEndK: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_krylos_finish)
        
        buttonEndK = findViewById(R.id.KrylosEndButton)
        buttonEndK.setOnClickListener {
            endQuest()
        }
    }

    private fun endQuest() {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
    }
}