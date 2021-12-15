package osbm.animatory.povodyrchyk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pogonya_Quest_Store extends AppCompatActivity implements Places {
    private Button ButtonShow;
    private EditText MagicWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pogonya_quest_store);
        OpenNextPlace();
    }
    public void OpenNextPlace() {
        ButtonShow = (Button) findViewById(R.id.StoreButtonNext);
        MagicWord = (EditText) findViewById(R.id.StoreLine);

        ButtonShow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (Places[1].equals(String.valueOf(MagicWord.getText()))) {
                            openFirstPlace();
                        }
                        else if (Places[2].equals(String.valueOf(MagicWord.getText()))) {
                            openSecondPlace();
                        }
                        else if (Places[3].equals(String.valueOf(MagicWord.getText()))) {
                            openThirdPlace();
                        }
                        else if (Places[4].equals(String.valueOf(MagicWord.getText()))) {
                            openFourthPlace();
                        }
                        else if (Places[5].equals(String.valueOf(MagicWord.getText()))) {
                            openFifthPlace();
                        }
                        else if (Places[7].equals(String.valueOf(MagicWord.getText()))) {
                            openSeventhPlace();
                        }
                        else if (Places[8].equals(String.valueOf(MagicWord.getText()))) {
                            openEighthPlace();
                        }
                        else if (Places[9].equals(String.valueOf(MagicWord.getText()))) {
                            openNinthPlace();
                        }
                        else if (Places[0].equals(String.valueOf(MagicWord.getText()))) {
                            openTenthPlace();
                        }

                    }
                }
        );
    }

    public void openFirstPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_Church.class);
        startActivity(intent);
    }

    public void openSecondPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_BusStation.class);
        startActivity(intent);
    }
    public void openThirdPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_Cemeteru.class);
        startActivity(intent);
    }
    public void openFourthPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_Saints.class);
        startActivity(intent);
    }

    public void openFifthPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_RefectoryChurch.class);
        startActivity(intent);
    }

    public void openSeventhPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_BellTower.class);
        startActivity(intent);
    }

    public void openEighthPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_HillStation.class);
        startActivity(intent);
    }

    public void openNinthPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_ThreeStations.class);
        startActivity(intent);
    }

    public void openTenthPlace() {
        Intent intent = new Intent(this, Pogonya_Quest_Mari_End.class);
        startActivity(intent);
    }
}