package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.string.mantra;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView assurance = (TextView) findViewById(R.id.text);

        assurance.setText("Make Everyday decisions easier!");

        final ImageView ballDisplay =
                (ImageView) findViewById(R.id.image_eightBall);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Button askButton;

        askButton = (Button) findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random number = new Random();
                int result = number.nextInt(5);

                ballDisplay.setImageResource(ballArray[result]);

            }
        });


    }
}