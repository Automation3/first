package com.example.first;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

         SeekBar seekBar;
         ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.lamp1);
        img2 = findViewById(R.id.lamp2);
        img3 = findViewById(R.id.lamp3);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progress=0;
            float f;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress=i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                 f = progress/seekBar.getMax();
                if(f<0.6){
                    img3.setBackgroundResource(R.drawable.offlamp);
                    img2.setBackgroundResource(R.drawable.onlamp);
                    img1.setBackgroundResource(R.drawable.onlamp);
                }

                    if(f<0.3){
                        img1.setBackgroundResource(R.drawable.onlamp);
                        img3.setBackgroundResource(R.drawable.offlamp);
                        img2.setBackgroundResource(R.drawable.offlamp);
                    }

                if (f==1){
                    img3.setBackgroundResource(R.drawable.onlamp);
                    img2.setBackgroundResource(R.drawable.onlamp);
                    img1.setBackgroundResource(R.drawable.onlamp);

                }
                progress=0;

         //       if (f==0){
         //           img3.setBackgroundResource(R.drawable.offlamp);
         //           img2.setBackgroundResource(R.drawable.offlamp);
          //          img1.setBackgroundResource(R.drawable.offlamp);

          //      }



            }
        });

/*
        +++ xml +++



























          <ImageView
            android:id="@+id/top_shadow"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:contentDescription="@string/text1"
            android:src="@drawable/top_shadow_nim"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintBottom_toBottomOf="parent" />

<ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:contentDescription="@string/text1"
            android:src="@drawable/toptab"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintBottom_toBottomOf="parent" />


        <TextView
            android:id="@+id/text1"
            android:layout_width="38dp"
            android:layout_height="26dp"
            android:text="@string/text8"
            android:layout_marginStart="60dp"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            android:layout_marginLeft="60dp" />

        <TextView
            android:id="@+id/text2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/text9"
            app:layout_constraintEnd_toEndOf="@+id/text3"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintStart_toStartOf="@+id/text1"/>

        <TextView
            android:id="@+id/text3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:text="@string/text7"/>


        <TextView
            android:id="@+id/text4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintTop_toBottomOf="@+id/text1"
            app:layout_constraintStart_toStartOf="@+id/text1"
            android:layout_marginTop="60dp"
            android:text="@string/text11"/>

        <TextView
            android:id="@+id/text5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintTop_toBottomOf="@+id/text2"
            app:layout_constraintStart_toStartOf="@+id/text2"
            android:layout_marginTop="60dp"
            android:text="@string/text5"/>

        <TextView
            android:id="@+id/text6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintEnd_toEndOf="@id/text3"
            app:layout_constraintTop_toBottomOf="@id/text3"
            android:layout_marginTop="40dp"
            android:text="@string/text10"/>

        <ImageView
            android:id="@+id/main"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:contentDescription="@string/text1"
            android:src="@drawable/main"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"/>

        <ImageView
            android:layout_margin="50dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:contentDescription="@string/text1"
            android:src="@drawable/element1"
            app:layout_constraintBottom_toBottomOf="@+id/main"
            app:layout_constraintEnd_toEndOf="@+id/main"
            app:layout_constraintStart_toStartOf="@+id/main"
            app:layout_constraintTop_toTopOf="@+id/main"/>

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/bottom_tab"
            android:contentDescription="@string/text1"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="@+id/main"
            app:layout_constraintBottom_toBottomOf="@+id/main" />

        <SeekBar
            android:id="@+id/seekBar"
            android:layout_width="wrap_content"
            android:layout_height="233dp"
            android:layout_marginEnd="25dp"
            android:layout_marginRight="50dp"
            android:layout_marginBottom="250dp"
            android:rotation="270"
            android:background="@drawable/line_rotate"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="1.0"
            app:layout_constraintStart_toStartOf="parent" />

        <SeekBar
            android:id="@+id/seekBar2"
            android:layout_width="wrap_content"
            android:layout_height="233dp"
            android:layout_marginEnd="335dp"
            android:layout_marginRight="50dp"
            android:layout_marginBottom="250dp"
            android:rotation="270"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="1.0"
            app:layout_constraintStart_toStartOf="parent" />


        <ImageView
            android:contentDescription="@string/text1"
            android:id="@+id/lamp1"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:src="@drawable/offlamp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent" />

        <ImageView
            android:contentDescription="@string/text1"
            android:id="@+id/lamp2"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:src="@drawable/offlamp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toEndOf="@+id/lamp1" />


        <ImageView
            android:contentDescription="@string/text1"
            android:id="@+id/lamp3"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:src="@drawable/offlamp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toEndOf="@+id/lamp2" />




*/
    }
}
