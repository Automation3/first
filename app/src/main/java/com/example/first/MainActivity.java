package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.lamp1);
        img2 = findViewById(R.id.lamp2);
        img3 = findViewById(R.id.lamp3);
        seekBar = findViewById(R.id.mySeekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                float f = (float) progress / seekBar.getMax();
                if (f > 0.4 && f <= 0.7) {
                    img3.setBackgroundResource(R.drawable.offlamp);
                    img2.setBackgroundResource(R.drawable.onlamp);
                    img1.setBackgroundResource(R.drawable.onlamp);
                }

                if (f > 0.1 && f <= 0.4) {
                    img1.setBackgroundResource(R.drawable.onlamp);
                    img3.setBackgroundResource(R.drawable.offlamp);
                    img2.setBackgroundResource(R.drawable.offlamp);
                }

                if (f > 0.7) {
                    img3.setBackgroundResource(R.drawable.onlamp);
                    img2.setBackgroundResource(R.drawable.onlamp);
                    img1.setBackgroundResource(R.drawable.onlamp);

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}
