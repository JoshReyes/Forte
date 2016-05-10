package com.example.pc2.finalproject;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Directivity extends BaseScreen
{
    EditText ed2;
    EditText ed3;
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_directivity );

        ed2 = (EditText) findViewById( R.id.editText2 );
        ed3 = (EditText) findViewById( R.id.editText3 );

        b1.setOnClickListener( new View.OnClickListener()
        {
            public void onClick( View v )
            {
                float arrlength = Float.parseFloat(ed2.getText().toString() );
                ed3.setText( Double.toString( 1 / arrlength ) );
            }
        });
    }
}
