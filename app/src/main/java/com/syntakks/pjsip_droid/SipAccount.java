package com.syntakks.pjsip_droid;

import android.util.Log;
import org.pjsip.pjsua2.Account;
import org.pjsip.pjsua2.OnRegStateParam;

public class SipAccount extends Account {
    private static final String TAG = "SipAccount";
    @Override
    public void onRegState(OnRegStateParam prm) {
        super.onRegState(prm);
        Log.d(TAG, "On Registration State: " + prm.getCode() + " : " + prm.getReason());
    }
}
