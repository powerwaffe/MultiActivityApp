package edu.dtcc.spaol1.multiactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    // Create message key
    public static String MESSAGE_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnCreateStringClick(View view)
    {
        // Create an intent
        Intent intent = new Intent(this, SecondActivity.class);

        // Get user created string
        EditText etMainEditText = (EditText) findViewById(R.id.etMainEditText);
        String createdString = etMainEditText.getText().toString();

        // Put the string into the intent
        intent.putExtra(MESSAGE_KEY, createdString);

        // Start activity
        startActivity(intent);

        // Create toast
        Toast.makeText(this, "String Created", Toast.LENGTH_SHORT).show();

        // Start MyIntentService
        Intent intent2 = new Intent(this, MyIntentService.class);
        startService(intent2);
    }
}
