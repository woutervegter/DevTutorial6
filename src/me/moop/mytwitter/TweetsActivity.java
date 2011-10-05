package me.moop.mytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TweetsActivity extends Activity {
	
	TextView mTxtvTitle;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tweets);
		
		mTxtvTitle = (TextView) findViewById(R.id.txtvTitle);
	
		Intent intent = getIntent();
		Bundle extrasBundle = intent.getExtras();
		mTxtvTitle.setText(extrasBundle.getString("twitter_user_name"));
	}
}
