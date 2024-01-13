package osbm.vasyliianski_animatory.povodyrchyk.DukhovaKrynytsia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class WellSpiritQuestActivity : AppCompatActivity() {
    private lateinit var buttonShow: Button
    private lateinit var magicWord: EditText
    private val places = arrayOf("Криниця", "Святість", "Дух", "Віра", "Бог", "Душа", "Ісус", "Біблія", "Любов", "Зцілення")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_wellspirit)
        openNextPlace()
    }

    private fun openNextPlace() {
        buttonShow = findViewById(R.id.WellSpiritButtonNext)
        magicWord = findViewById(R.id.WellSpiritLine)
        val pohonyaImage = findViewById<ImageView>(R.id.WellSpiritPicture)
        buttonShow.setOnClickListener {
            when (magicWord.text.toString()) {
                places[1] -> pohonyaImage.setImageResource(R.drawable.picture021_dukhovakrynytsya_stage)
                places[2] -> pohonyaImage.setImageResource(R.drawable.picture022_dukhovakrynytsya_station2)
                places[3] -> openThirdPlace()
                places[4] -> pohonyaImage.setImageResource(R.drawable.picture023_dukhovakrynytsya_arch)
                places[5] -> pohonyaImage.setImageResource(R.drawable.picture024_dukhovakrynytsya_refectory)
                places[6] -> pohonyaImage.setImageResource(R.drawable.picture025_dukhovakrynytsya_maria)
                places[7] -> pohonyaImage.setImageResource(R.drawable.picture026_dukhovakrynytsya_church)
                places[8] -> pohonyaImage.setImageResource(R.drawable.picture027_dukhovakrynytsya_chapel)
                places[9] -> pohonyaImage.setImageResource(R.drawable.picture028_dukhovakrynytsya_station1)
                places[0] -> pohonyaImage.setImageResource(R.drawable.picture029_dukhovakrynytsya_prayer)
            }
        }
    }

    private fun openThirdPlace() {
        val intent = Intent(this, WellSpiritCongratulationsActivity::class.java)
        this.startActivity(intent)
    }

}