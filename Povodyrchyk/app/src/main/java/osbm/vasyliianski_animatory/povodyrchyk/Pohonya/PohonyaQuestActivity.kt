package osbm.vasyliianski_animatory.povodyrchyk.Pohonya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class PohonyaQuestActivity : AppCompatActivity() {
    private lateinit var buttonShow: Button
    private lateinit var magicWord: EditText
    private val places =
        arrayOf("Мати", "Єрусалим", "Анна", "Йоаким", "Богородиця", "Ісус", "Пресвята", "Бог", "Церква", "Храм")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_pohonya)
        openNextPlace()
    }

    private fun openNextPlace() {
        buttonShow = findViewById(R.id.PohonyaButtonNext)
        magicWord = findViewById(R.id.PohonyaLine)
        val pohonyaImage = findViewById<ImageView>(R.id.PohonyaPicture)
        buttonShow.setOnClickListener {
            when (magicWord.text.toString()) {
                places[1] -> pohonyaImage.setImageResource(R.drawable.picture001_pohonya_church)
                places[2] -> openSecondPlace()
                places[3] -> pohonyaImage.setImageResource(R.drawable.picture003_pohonya_threestations)
                places[4] -> pohonyaImage.setImageResource(R.drawable.picture004_pohonya_busstation)
                places[5] -> pohonyaImage.setImageResource(R.drawable.picture005_pohonya_cemeteru)
                places[6] -> pohonyaImage.setImageResource(R.drawable.picture006_pohonya_saints)
                places[7] -> pohonyaImage.setImageResource(R.drawable.picture007_pohonya_refectorychurch)
                places[8] -> pohonyaImage.setImageResource(R.drawable.picture008_pohonya_store)
                places[9] -> pohonyaImage.setImageResource(R.drawable.picture009_pohonya_belltower)
                places[0] -> pohonyaImage.setImageResource(R.drawable.picture010_pohonya_hillstation)
            }
        }
    }

    private fun openSecondPlace() {
        val intent = Intent(this, PohonyaCongratulationsActivity::class.java)
        this.startActivity(intent)
    }
}