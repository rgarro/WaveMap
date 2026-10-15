package com.emptyart.wavecount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * Who bared record of the word of god, and of the
 * testimony of Jesus Christ and of all things that he saw
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //choosing the beach
        Button btnNext = (Button) findViewById(R.id.my_button);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                String spinnerValue = spinner.getSelectedItem().toString();
                Log.d("beach", spinnerValue);
                Intent intent = new Intent(MainActivity.this, WaveCountActivity.class);
                intent.putExtra("surf_spot", spinnerValue);
                startActivity(intent);
            }
        });
    }
}
