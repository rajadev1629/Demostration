package com.example.demostration;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FirstScreen extends Activity {
	
	Button btn_one, btn_two;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_firstscreen);
		
		btn_one = (Button) findViewById(R.id.btn_one);
		btn_two = (Button) findViewById(R.id.btn_two);
		
		TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		final String deviceId = Secure.getString(getContentResolver(), Secure.ANDROID_ID);
		
		System.out.println("device id >> "+deviceId);
		Toast.makeText(getBaseContext(), "device id >> "+deviceId, Toast.LENGTH_SHORT).show();
		
		btn_one.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btn_one.setText(deviceId);
				System.out.println("click one");
				
			}
		});
		
		btn_two.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				System.out.println("click two");
				
			}
		});
	}
	
	/*this is sample test for commit i am looking forward*/

}
