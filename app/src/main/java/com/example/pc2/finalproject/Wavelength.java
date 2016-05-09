package com.example.pc2.finalproject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by Josh on 5/9/2016.
 */
public class Wavelength extends BaseScreen
{
    EditText ed2;
    EditText ed3;
    public static final String Wavelength = "speedKey";
    //ToggleButton toggleMeters = (ToggleButton) findViewById( R.id.toggleButton );
    //toggleMeters.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener);
    //ToggleButton toggleFeet = (ToggleButton) findViewById( R.id.toggleButton2 );

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_speed_of_sound );
        ed2 = (EditText) findViewById( R.id.editText2 );
        ed3 = (EditText) findViewById( R.id.editText3 );

        b1.setOnClickListener( new View.OnClickListener()
        {
            public void onClick( View v )
            {
                float temp = Float.parseFloat( ed1.getText().toString() );
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putFloat( Temperature, temp );
                editor.commit();
                //Toast.makeText( SpeedOfSound.this, "Thanks", Toast.LENGTH_LONG ).show();

                double speed = 331 + (0.6*temp);
                float freq = Float.parseFloat( ed3.getText().toString() );
                double wavelength = speed / freq;

                Toast.makeText( Wavelength.this, String.valueOf( wavelength ), Toast.LENGTH_LONG ).show();
            }
        });
    }
}
