package uk.co.ubitronics.ubiclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class ClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        // Setup and initalise ubiAnalogClock
        final AnalogClock ubiAnalogClock = (AnalogClock) findViewById(R.id.ubiAnalogClock);

        // On click do the following
        ubiAnalogClock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Get the current time and date as a string variable
                String ubiDateTime = DateFormat.getDateTimeInstance().format(new Date());

                // Popup overlay that displays the current time and date
                Toast.makeText(ClockActivity.this, ubiDateTime, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
