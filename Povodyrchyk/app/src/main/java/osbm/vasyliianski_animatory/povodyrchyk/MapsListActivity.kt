package osbm.vasyliianski_animatory.povodyrchyk

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import osbm.vasyliianski_animatory.povodyrchyk.R.id
import osbm.vasyliianski_animatory.povodyrchyk.Pohonya.PohonyaQuestActivity

class MapsListActivity : AppCompatActivity() {
    private lateinit var buttonPohonya: ImageButton
    private lateinit var buttonBoronyava: ImageButton
    private lateinit var buttonDukhovaKrynytsya: ImageButton
    private lateinit var buttonKrylos: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_list)
        buttonPohonya = findViewById(id.btn_pohonya)
        buttonPohonya.setOnClickListener {
            openPohonya()
        }
        buttonBoronyava = findViewById(id.btn_Boronyava)
        buttonBoronyava.setOnClickListener {
            openBoronyavo()
        }
        buttonDukhovaKrynytsya = findViewById(id.btn_WellSpirit)
        buttonDukhovaKrynytsya.setOnClickListener {
            openDukhovaKrynyrsya()
        }
        buttonKrylos = findViewById(id.btn_Krylos)
        buttonKrylos.setOnClickListener {
            openKrylos()
        }
    }

    private fun openPohonya() {
        val playPohonya = Intent(this, PohonyaQuestActivity::class.java)
        startActivity(playPohonya)
    }

    private fun openBoronyavo() {
        val playBoronyava = Intent(this, osbm.vasyliianski_animatory.povodyrchyk.Boronyavo.BoronyavoQuestActivity::class.java)
        startActivity(playBoronyava)
    }

    private fun openDukhovaKrynyrsya() {
        val playBoronyava = Intent(this, osbm.vasyliianski_animatory.povodyrchyk.DukhovaKrynytsia.WellSpiritQuestActivity::class.java)
        startActivity(playBoronyava)
    }

    private fun openKrylos() {
        val playBoronyava = Intent(this, osbm.vasyliianski_animatory.povodyrchyk.Krylos.KrylosQuestActivity::class.java)
        startActivity(playBoronyava)
    }

}