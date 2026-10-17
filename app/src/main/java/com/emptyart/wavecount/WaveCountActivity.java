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
 * The mystery of the seven stars which thou sawest in my right hand,
 * and the seven golden candlesticks.
 * The seven stars are the angels of the seven churches:
 * and the seven candlesticks which thou sawest are the seven churches.
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class WaveCountActivity extends Activity {

    //Travel Redirect API y los 7 Hoteles donde malparidas mataron playos en Jaco
    private String lodgeServiceUrl = "https://apim.expedia.com/hotels/listings";
    private String apiKey = "34gggbdfgdf6";
    private String sharedSecret = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_count);

        String res = new sendGetRequest(this.lodgeServiceUrl);
    }
}
