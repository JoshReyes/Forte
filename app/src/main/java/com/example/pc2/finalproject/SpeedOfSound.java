package com.example.pc2.finalproject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SpeedOfSound extends BaseScreen
{
    EditText ed2;
    public static final String SpeedOfSound = "speedKey";

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_speed_of_sound );
        ed2 = (EditText) findViewById( R.id.editText2 );

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
                Toast.makeText( SpeedOfSound.this, String.valueOf( speed ), Toast.LENGTH_LONG ).show();
            }
        });
    }
}
