package com.projetmcsdrone.mcsrecorder;

import android.util.Log;

/**
 * Created by Asul ich on 16/11/2016.
 */

public class AppLog {
    private static final String APP_TAG = "AudioRecorder";

    public static int logString(String message) {
        return Log.i(APP_TAG, message);

    }
}
