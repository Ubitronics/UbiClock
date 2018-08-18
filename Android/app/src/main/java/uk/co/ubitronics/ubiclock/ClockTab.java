package uk.co.ubitronics.ubiclock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AnalogClock;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClockTab extends Fragment {

    public ClockTab() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clock_tab, container, false);



        // Setup and initalise ubiAnalogClock
        //AnalogClock ubiAnalogClock = (AnalogClock).getView().findViewById(R.id.ubiAnalogClock);
        //TextView txtMyTextBox = (TextView)getView().findViewById(R.id.my_text_box)

        // On click do the following
        //ubiAnalogClock.setOnClickListener(new View.OnClickListener() {

        //    @Override
//            public void onClick(View v) {
//
//                // Get the current time and date as a string variable
//                String ubiDateTime = DateFormat.getDateTimeInstance().format(new Date());
//
//                // Popup overlay that displays the current time and date
//                Toast.makeText(ClockTab.this, ubiDateTime, Toast.LENGTH_SHORT).show();
//            }
//        });


    }

}
