package com.example.dicegame;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    final int random = new Random().nextInt(6);
    private int count = 0;





    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView count = findViewById(R.id.textCount);


        TextView res1 = findViewById(R.id.textRes1);
        TextView res2 = findViewById(R.id.textRes2);
        TextView res3 = findViewById(R.id.textRes1);
        TextView res4 = findViewById(R.id.textRes2);
        TextView res5 = findViewById(R.id.textRes2);

        Button los = findViewById(R.id.buttonThrow);
        Button restart = findViewById(R.id.buttonReset);


        los.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                void rollDice(){
                    res1.setText(random);
                    res2.setText(random);
                    res3.setText(random);
                    res4.setText(random);
                    res5.setText(random);
                }
                updateRollCount();

            }


        private void updateRollCount() {
            count.setText("Liczba rzutów: " + count);

        };
    });
};
}