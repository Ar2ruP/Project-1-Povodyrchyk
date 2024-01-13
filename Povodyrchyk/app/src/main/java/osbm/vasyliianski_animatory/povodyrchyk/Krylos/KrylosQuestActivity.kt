package osbm.vasyliianski_animatory.povodyrchyk.Krylos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class KrylosQuestActivity : AppCompatActivity() {
    private lateinit var buttonShowK: Button
    private lateinit var magicWordK: EditText
    private val places =
        arrayOf("Успіння", "Молитва", "Галич", "Богородиця", "Анна", "Йоаким", "Пресвята", "Діва", "Марія")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_krylos)
        openNextPlace()
    }

    private fun openNextPlace() {
        buttonShowK = findViewById(R.id.KrylosButtonNext)
        magicWordK = findViewById(R.id.KrylosLine)
        val boronyavoImage = findViewById<ImageView>(R.id.KrylosPicture)
        buttonShowK.setOnClickListener {
            when (magicWordK.text.toString()) {
                places[1] -> openFirstPlace()
                places[2] -> boronyavoImage.setImageResource(R.drawable.picture031_krylos_cemeteru)
                places[3] -> boronyavoImage.setImageResource(R.drawable.picture032_krylos_museum)
                places[4] -> boronyavoImage.setImageResource(R.drawable.picture033_krylos_prince_well)
                places[5] -> boronyavoImage.setImageResource(R.drawable.picture034_krylos_shop)
                places[6] -> boronyavoImage.setImageResource(R.drawable.picture035_krylos_mini_church)
                places[7] -> boronyavoImage.setImageResource(R.drawable.picture036_krylos_chapel)
                places[8] -> boronyavoImage.setImageResource(R.drawable.picture037_krylos_statue_christ)
                places[9] -> boronyavoImage.setImageResource(R.drawable.picture038_krylos_church)
                places[0] -> boronyavoImage.setImageResource(R.drawable.picture030_krylos_scene)
            }
        }
    }

    private fun openFirstPlace() {

        val intent = Intent(this, KrylosCongratulationsActivity::class.java)
        startActivity(intent)
    }
}