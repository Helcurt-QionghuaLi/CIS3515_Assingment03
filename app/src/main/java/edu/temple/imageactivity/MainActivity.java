package edu.temple.imageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);
        image=findViewById(R.id.image);

        String [] anime = {"Select Your Favorite Anime!", "One Punch Man", "One Piece",
        "Attack On Titan", "Bleach", "Naruto"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_dropdown_item,anime);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        image.setImageResource(R.drawable.onepunchman);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.onepiece);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.attackontitan);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.bleach);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.naruto);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}