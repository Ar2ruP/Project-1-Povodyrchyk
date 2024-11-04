package osbm.vasyliianski_animatory.povodyrchyk.Starunia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import osbm.vasyliianski_animatory.povodyrchyk.MainMenuActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class StaruniaCongratulationsActivity : AppCompatActivity() {
    private lateinit var buttonEndP: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_starunia_congratulations)
                buttonEndP = findViewById(R.id.StaruniaEndButton)
                buttonEndP.setOnClickListener {
                    endQuest()
                }
            }

            private fun endQuest() {
                val intent = Intent(this, MainMenuActivity::class.java)
                startActivity(intent)
            }
        }