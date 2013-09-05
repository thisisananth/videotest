package com.example.videotest;

import com.example.videotest.R;
import com.ooyala.android.OoyalaPlayer;
import com.ooyala.android.OoyalaPlayerLayout;
import com.ooyala.android.OoyalaPlayerLayoutController;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
    
    private String test="Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OoyalaPlayerLayout playerLayout = (OoyalaPlayerLayout)findViewById(R.id.ooyalaPlayer);
        OoyalaPlayerLayoutController playerLayoutController = new OoyalaPlayerLayoutController(playerLayout,
        "l4aWsxOrJsQb5QTA3TSfyfKdI5Qb", "www.ooyala.com");
        OoyalaPlayer player = playerLayoutController.getPlayer();
        if (player.setEmbedCode("JzeTM1ZTo1Q0DFzpG5NFLGMjPaQqUC6-")) {
        // The Embed Code works
        player.play();
        } else {
        Log.d(this.getClass().getName(), "Something Went Wrong!");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
