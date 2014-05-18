package com.chaos.onekeyconnectwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if (intent.getAction().equals("CHANGE_MAIN_BUTTON_CONTENT")) {
			// SendSMS.send(context, "10001", "xykdmm", 1);
			Toast.makeText(context, "Received", Toast.LENGTH_LONG).show();
		}
	}

}
