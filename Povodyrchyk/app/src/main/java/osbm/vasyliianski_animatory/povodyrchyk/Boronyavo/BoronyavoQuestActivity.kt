package osbm.vasyliianski_animatory.povodyrchyk.Boronyavo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import osbm.vasyliianski_animatory.povodyrchyk.Pohonya.PohonyaCongratulationsActivity
import osbm.vasyliianski_animatory.povodyrchyk.R

class BoronyavoQuestActivity : AppCompatActivity() {
    private lateinit var buttonShow: Button
    private lateinit var magicWord: EditText
    private val places = arrayOf("Ісус", "Душа", "Мати", "Монастир", "Богородиця", "Хрест", "Церква", "Бог", "Пресвята")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_boronyavo)
        openNextPlace()
    }

    private fun openNextPlace() {
        buttonShow = findViewById(R.id.BoronyavoButtonNext)
        magicWord = findViewById(R.id.BoronyavoLine)
        val boronyavoImage = findViewById<ImageView>(R.id.BoronyavoPicture)
        buttonShow.setOnClickListener {
            when (magicWord.text.toString()) {
                places[1] -> boronyavoImage.setImageResource(R.drawable.picture012_boronyava_stork)
                places[2] -> boronyavoImage.setImageResource(R.drawable.picture013_boronyava_cemeteru)
                places[3] -> boronyavoImage.setImageResource(R.drawable.picture014_boronyava_house)
                places[4] -> openFifthPlace()
                places[5] -> boronyavoImage.setImageResource(R.drawable.picture015_boronyava_cemeteru)
                places[6] -> boronyavoImage.setImageResource(R.drawable.picture016_boronyava_vineyard)
                places[7] -> boronyavoImage.setImageResource(R.drawable.picture017_boronyava_church)
                places[8] -> boronyavoImage.setImageResource(R.drawable.picture018_boronyava_crossroads)
                places[9] -> boronyavoImage.setImageResource(R.drawable.picture019_boronyava_jesuschrist)
                places[0] -> boronyavoImage.setImageResource(R.drawable.picture020_boronyava_well)
            }
        }
    }

    private fun openFifthPlace() {
        val intent = Intent(this, BoronyavoCongratulationsActivity::class.java)
        startActivity(intent)
    }
}