package android.guide.broadcast_receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
//TODO 1 create class extends broadcast receiver
public class MyRecevirer extends BroadcastReceiver {
//  TODO 1.1 override onReceive method
    @Override
    public void onReceive(Context context, Intent intent) {
//        TODO 1.1.1 Do something
        Toast.makeText(context,"Intent Detected, "+intent.getAction().toString(),Toast.LENGTH_SHORT).show();
        Log.i("TAG", "onReceive: "+intent.toString());
    }
}
