package edu.dtcc.spaol1.multiactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static edu.dtcc.spaol1.multiactivityapp.MainActivity.MESSAGE_KEY;

/**
 * Created by Sean on 2/21/2017.
 */
public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary_activity);

        // Get the intent
        Intent i = getIntent();

        // Receive the created sent from the main activity
        String stringReceived = i.getStringExtra(MESSAGE_KEY);

        // Put the created string into a TextView
        TextView tvStringReceived = (TextView) findViewById(R.id.tvCreatedString);
        tvStringReceived.setText(stringReceived);
    }

    public void onBtnPreviousClick(View view)
    {
        Toast.makeText(this, "Resuming Previous Activity", Toast.LENGTH_SHORT).show();

        // Return to MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
