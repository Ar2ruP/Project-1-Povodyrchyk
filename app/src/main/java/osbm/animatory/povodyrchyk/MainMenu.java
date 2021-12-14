package osbm.animatory.povodyrchyk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    private Button ButtonPlay, ButtonExit,ButtonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ButtonPlay = findViewById(R.id.MainButton_Play);
        ButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayStart();
            }
        });

        ButtonAbout=findViewById(R.id.MainbuttonAbout);
        ButtonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View about) {
                OpenAbout();
            }
        });
        ButtonExit = findViewById(R.id.MainButtonExit);
        ButtonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View exit) {
                finish();
                System.exit(0);
            }
        });
    }

    public void PlayStart() {
        Intent Play = new Intent(this, Pogonya_Quest_Mari_Start.class);
        startActivity(Play);
    }
    public void OpenAbout(){
        Intent SeeAbout=new Intent(this, PovodyrchykAbout.class);
        startActivity(SeeAbout);
    }

}