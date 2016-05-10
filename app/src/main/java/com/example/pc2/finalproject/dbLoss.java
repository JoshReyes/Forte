package com.example.pc2.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;

public class dbLoss extends BaseScreen
{
    EditText ed2;
    EditText ed3;
    ToggleButton tb4;
    ToggleButton tb3;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_db_loss );

        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);
        tb4 = (ToggleButton) findViewById(R.id.toggleButton4);
        tb3 = (ToggleButton) findViewById(R.id.toggleButton3);
    }

    CompoundButton.OnCheckedChangeListener changeChecker = new CompoundButton.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            if(isChecked)
            {
                if( buttonView == tb4 )
                {
                    tb3.setChecked( false );
                    float distance = Float.parseFloat( ed2.getText().toString() );
                    float decibelLoss = -3 * distance;
                    ed3.setText( Float.toString( decibelLoss ) );
                }
                else
                {
                    tb4.setChecked( false );
                    float distance = Float.parseFloat( ed2.getText().toString() );
                    float decibelLoss = -6 * distance;
                    ed3.setText( Float.toString( decibelLoss ) );
                }
            }
            else
            {
                if( buttonView == tb4 )
                {
                    tb3.setChecked( true );
                    float distance = Float.parseFloat( ed2.getText().toString() );
                    float decibelLoss = -6 * distance;
                    ed3.setText( Float.toString( decibelLoss ) );
                }
                else
                {
                    tb4.setChecked( true );
                    float distance = Float.parseFloat( ed2.getText().toString() );
                    float decibelLoss = -3 * distance;
                    ed3.setText( Float.toString( decibelLoss ) );
                }
            }
        }
    };
}
