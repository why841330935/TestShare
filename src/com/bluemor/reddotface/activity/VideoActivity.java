package com.bluemor.reddotface.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bluemor.reddotface.view1.R;

public class VideoActivity extends FragmentActivity {
	private CustomVideoView video;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_video);
		video = (CustomVideoView) findViewById(R.id.video);
		MediaController controller = new MediaController(this); 
		this.video.setMediaController(controller); 
		String uri = "android.resource://" + getPackageName() + "/"
				+ R.raw.video_test;

		video.setVideoURI(Uri.parse(uri));
		video.setMediaController(null);
		video.start();
	}
	class MyVideoView extends VideoView{


		public MyVideoView(Context context) {
			super(context);
		}
		
	}
}
