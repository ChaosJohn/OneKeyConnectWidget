package com.chaos.onekeyconnectwidget;

import java.util.List;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.widget.Toast;

public class SendSMS {
	public static void send(Context context, String mobile, String content,
			int times) {
		// String mobile = "10001";
		// String content = "xykdmm";

		SmsManager smsManager = SmsManager.getDefault();
		PendingIntent sentIntent = PendingIntent.getBroadcast(context, 0,
				new Intent(), 0);

		for (int i = 0; i < times; i++) {
			if (content.length() >= 70) {
				// 短信字数大于70，自动分条
				List<String> ms = smsManager.divideMessage(content);

				for (String str : ms) {
					// 短信发送
					smsManager.sendTextMessage(mobile, null, str, sentIntent,
							null);
				}
			} else {
				smsManager.sendTextMessage(mobile, null, content, sentIntent,
						null);
			}
		}

		Toast.makeText(context, "发送成功！(" + times + ")", Toast.LENGTH_LONG)
				.show();
	}

}
