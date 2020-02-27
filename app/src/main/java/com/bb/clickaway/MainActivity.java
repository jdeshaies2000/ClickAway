package com.bb.clickaway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private TextView ageTextView;

    private ImageView imageView;

    private String concatText = "";
    private int yearCounterInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.main_textview);
        ageTextView = findViewById(R.id.second_textview);

        imageView = findViewById(R.id.action_imageview);

        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText( MainActivity.this, "Pressed Text!!", Toast.LENGTH_SHORT).show();
                Log.d("TAG_X",  "Text Pressed ...");
                concatText += "0";

                ++yearCounterInt;

                switch (yearCounterInt) {
                    case 1:
                        ageTextView.setText(R.string.human_stage_one);
                        Toast.makeText( MainActivity.this, "Age is 1", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        ageTextView.setText(R.string.human_stage_two);
                        Toast.makeText( MainActivity.this, "Age is 2", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                }

                if ((yearCounterInt >= 0) && (yearCounterInt < 2))
                    ageTextView.setText(R.string.human_stage_one);
                else if ((yearCounterInt >= 2) && (yearCounterInt < 5))
                    ageTextView.setText(R.string.human_stage_two);
                else if ((yearCounterInt >= 5) && (yearCounterInt < 13))
                    ageTextView.setText(R.string.human_stage_three);
                else if ((yearCounterInt >= 13) && (yearCounterInt < 19))
                    ageTextView.setText(R.string.human_stage_four);
                else if ((yearCounterInt >= 19) && (yearCounterInt < 30))
                    ageTextView.setText(R.string.human_stage_five);
                else if ((yearCounterInt >= 30) && (yearCounterInt < 54))
                    ageTextView.setText(R.string.human_stage_six);
                else if ((yearCounterInt >= 55 ) && (yearCounterInt < 100))
                    ageTextView.setText(R.string.human_stage_seven);
                else if (yearCounterInt == 100) {
                    ageTextView.setText("Infant");
                    yearCounterInt = 0;
                }


                /*
                if ((concatText.length() > 5) && (concatText.length() < 11))
                    imageView.setImageDrawable(getDrawable(R.drawable.car_image_one));
                else if (concatText.length() > 10)
                    imageView.setImageDrawable(getDrawable(R.drawable.car_image_two));
                */

                myTextView.setText("" + yearCounterInt);
            }
        });
    }
}
