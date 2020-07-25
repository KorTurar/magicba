package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.askButton);
        final ImageView magicBallImage = (ImageView) findViewById(R.id.ballImage);
        final int[] answers = {
                R.drawable.answer_yes_magicball,
                R.drawable.later_magicball,
                R.drawable.no_idea_magicball,
                R.drawable.no_magicball,
                R.drawable.yes_magicball
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("magic", "Button is clicked");
                Random randomNumberGenerator = new Random();
                int answerNumber = randomNumberGenerator.nextInt(5);
                magicBallImage.setImageResource(answers[answerNumber]);
            }
        });
    }
}
