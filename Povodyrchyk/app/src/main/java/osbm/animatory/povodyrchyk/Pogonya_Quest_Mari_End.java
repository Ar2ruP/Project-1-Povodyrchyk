package osbm.animatory.povodyrchyk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pogonya_Quest_Mari_End extends AppCompatActivity {
    private Button ButtonEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pogonya_quest_mari_end);
        ButtonEnd = findViewById(R.id.MariaEndButton);
        ButtonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EndQuest();
            }
        });
    }

    public void EndQuest() {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}