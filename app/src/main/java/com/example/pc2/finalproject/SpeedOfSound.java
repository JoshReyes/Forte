package com.example.pc2.finalproject;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SpeedOfSound extends BaseScreen
{
    EditText ed;
    EditText ed2;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_speed_of_sound );
        ed = (EditText) findViewById( R.id.editText );
        ed2 = (EditText) findViewById( R.id.editText2 );

        b1.setOnClickListener( new View.OnClickListener()
        {
            public void onClick( View v )
            {
                float temp = Float.parseFloat( ed1.getText().toString() );
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putFloat( Temperature, temp );
                editor.commit();
                double speed = 331 + (0.6*temp);
                ed2.setText( Double.toString( speed ) );
            }
        });
    }
}
