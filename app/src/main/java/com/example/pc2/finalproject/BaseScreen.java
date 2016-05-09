package com.example.pc2.finalproject;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BaseScreen extends AppCompatActivity
{
    EditText ed1;
    Button b1;
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Temperature = "tempKey";
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        //setContentView( R.layout.??? );

        ed1 = (EditText) findViewById( R.id.editText );
        b1 = (Button) findViewById( R.id.button );

        sharedpreferences = getSharedPreferences( MyPREFERENCES, Context.MODE_PRIVATE );

        b1.setOnClickListener( new View.OnClickListener()
        {
            public void onClick( View v )
            {
                float temp = Float.parseFloat( ed1.getText().toString() );
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putFloat( Temperature, temp );
                editor.commit();
                Toast.makeText( BaseScreen.this, "Thanks", Toast.LENGTH_LONG ).show();
            }
        });
    }
}
