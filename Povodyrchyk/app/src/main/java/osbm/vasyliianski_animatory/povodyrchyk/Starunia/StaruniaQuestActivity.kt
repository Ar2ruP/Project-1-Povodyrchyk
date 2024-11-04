package osbm.vasyliianski_animatory.povodyrchyk.Starunia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class StaruniaQuestActivity: AppCompatActivity() {
        private lateinit var buttonShow: Button
        private lateinit var magicWord: EditText
        private val places =
            arrayOf("", "Симеон", "Церква", "Ікона", "Лукач", "Священство", "Бог", "Ікона", "Ісус", "")

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_quest_starunia)
            openNextPlace()
        }

        private fun openNextPlace() {
            buttonShow = findViewById(R.id.StaruniaButtonNext)
            magicWord = findViewById(R.id.StaruniaLine)
            val staruniaImage = findViewById<ImageView>(R.id.StaruniaPicture)
            buttonShow.setOnClickListener {
                when (magicWord.text.toString()) {
                    places[1] -> staruniaImage.setImageResource(R.drawable.picture039_starunia)
                    places[2] -> openSecondPlace()
                    places[3] -> staruniaImage.setImageResource(R.drawable.picture040_starunia_cross)
                    places[4] -> staruniaImage.setImageResource(R.drawable.picture041_starunia_xiv)
                    places[5] -> staruniaImage.setImageResource(R.drawable.picture042_starunia_store)
                    places[6] -> staruniaImage.setImageResource(R.drawable.picture043_starunia_church)
                    places[7] -> staruniaImage.setImageResource(R.drawable.picture044_starunia_school)
                    places[8] -> staruniaImage.setImageResource(R.drawable.picture045_starunia_garden_house)
//                    places[9] -> staruniaImage.setImageResource(R.drawable.picture0)
//                    places[0] -> staruniaImage.setImageResource(R.drawable.picture0)
                }
            }
        }

        private fun openSecondPlace() {
            val intent = Intent(this, StaruniaCongratulationsActivity::class.java)
            this.startActivity(intent)
        }
    }