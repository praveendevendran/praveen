package com.example.boundserviceexample;

import android.os.Bundle;
import android.os.IBinder;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void playAudio(View view) {
        Intent serviceIntent = new Intent(this, UnboundPlayer.class);
        startService(serviceIntent);
    }

    public void stopAudio(View view) {
        Intent serviceIntent = new Intent(this, UnboundPlayer.class);
        stopService(serviceIntent);   
    }
 /*   BoundedAudioPlayerService myService;
    private boolean isBound;
    ImageButton btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(ImageButton)findViewById(R.id.button1);
        isBound=false;
       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void playAudio(View view) {
        Intent objIntent = new Intent(this,  BoundedAudioPlayerService.class);
        if(!isBound)
        {
        bindService(objIntent, myConnection, Context.BIND_AUTO_CREATE);
        isBound=true;
        btn.setBackgroundResource(R.drawable.pause);//setText("Pause");
        startService(objIntent);
        }
        else
        {
            myService.plauseAudio();
            btn.setBackgroundResource(R.drawable.play);
            isBound=false;
            unbindService(myConnection);
        }
               
    }

    public void stopAudio(View view) {
        Intent objIntent = new Intent(this, BoundedAudioPlayerService.class);
        if(isBound)
        {
            isBound=false;
        unbindService(myConnection);   
        stopService(objIntent);
       
        }
        else
            stopService(objIntent);
        btn.setBackgroundResource(R.drawable.play);
    }
    private ServiceConnection myConnection = new ServiceConnection() {

       

        public void onServiceConnected(ComponentName className,
                IBinder service) {
            myService = ((BoundedAudioPlayerService.MyLocalBinder) service).getService();
            isBound = true;
        }
       
        public void onServiceDisconnected(ComponentName arg0) {
            isBound = false;
        }
       
       };
      
        @Override
        protected void onDestroy() {
            super.onDestroy();
            if (isBound) {
                // Disconnect from an application service. You will no longer
                // receive calls as the service is restarted, and the service is
                // now allowed to stop at any time.
                unbindService(myConnection);
                isBound = false;
            }
        }
*/

}
