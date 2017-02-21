package edu.dtcc.spaol1.multiactivityapp;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Sean on 2/21/2017.
 */

public class MyIntentService extends IntentService
{
    // Create logcat TAG
    private static final String TAG = "SEAN";

    public MyIntentService()
    {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent)
    {
        Log.i(TAG, "Service Started");
    }
}
