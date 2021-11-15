package com.tokbox.sample.basicvideochat;

import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;

public class OpenTokConfig {
    /*
    Fill the following variables using your own Project info from the OpenTok dashboard
    https://dashboard.tokbox.com/projects

    Note that this application will ignore credentials in the `OpenTokConfig` file when `CHAT_SERVER_URL` contains a
    valid URL.
    */

    // Replace with a API key
    public static final String API_KEY = "47370691";
    
    // Replace with a generated Session ID
    public static final String SESSION_ID = "1_MX40NzM3MDY5MX5-MTYzNTk3NjE2MDcxMn5FdXBUdmlwSGlWc1k5M09xdTREdXNjVnB-fg";
    
    // Replace with a generated token (from the dashboard or using an OpenTok server SDK)
    public static final String TOKEN = "T1==cGFydG5lcl9pZD00NzM3MDY5MSZzaWc9ZWNiYjNmZjk5ODdkMjhmMWE0MGE5ZTMzN2YxYWI1YWQwYmZjY2IyODpzZXNzaW9uX2lkPTFfTVg0ME56TTNNRFk1TVg1LU1UWXpOVGszTmpFMk1EY3hNbjVGZFhCVWRtbHdTR2xXYzFrNU0wOXhkVFJFZFhOalZuQi1mZyZjcmVhdGVfdGltZT0xNjM1OTc2MTkxJm5vbmNlPTAuNTYyNDI1ODcxMjMzNTA0NCZyb2xlPXB1Ymxpc2hlciZleHBpcmVfdGltZT0xNjM4NTY4MTkwJmluaXRpYWxfbGF5b3V0X2NsYXNzX2xpc3Q9";

    // *** The code below is to validate this configuration file. You do not need to modify it  ***

    public static boolean isValid() {
        if (TextUtils.isEmpty(OpenTokConfig.API_KEY)
                || TextUtils.isEmpty(OpenTokConfig.SESSION_ID)
                || TextUtils.isEmpty(OpenTokConfig.TOKEN)) {
            return false;
        }

        return true;
    }

    @NonNull
    public static String getDescription() {
        return "OpenTokConfig:" + "\n"
                + "API_KEY: " + OpenTokConfig.API_KEY + "\n"
                + "SESSION_ID: " + OpenTokConfig.SESSION_ID + "\n"
                + "TOKEN: " + OpenTokConfig.TOKEN + "\n";
    }
}
