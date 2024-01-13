package osbm.vasyliianski_animatory.povodyrchyk.Boronyavo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.MainMenuActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class BoronyavoCongratulationsActivity : AppCompatActivity() {
    private lateinit var buttonEndB: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_boronyavo_finish)

        buttonEndB = findViewById(R.id.PictureOfBoronyavo)
        buttonEndB.setOnClickListener {
            endQuest()
        }
    }

    private fun endQuest() {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
    }
}