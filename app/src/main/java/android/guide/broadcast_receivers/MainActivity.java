package android.guide.broadcast_receivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//TODO 2 define BroadcastReceiver by (Context-registered receivers) way.
        BroadcastReceiver br = new MyRecevirer();
//        TODO 2.1 define the type of broadcast you want to receive
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
//TODO 3 register the receiver
        this.registerReceiver(br, filter);
    }
}