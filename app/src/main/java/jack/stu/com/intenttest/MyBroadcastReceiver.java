package jack.stu.com.intenttest;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 项目名  review
 * 包名    jack.stu.com.intenttest
 * 文件名   MyBroadcastReceiver
 * 创建者   JackLee
 * 创建时间  2018/12/15  10:56
 * 描述    TODO
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        int type = intent.getIntExtra("test", -1);

        if (type != -1) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.cancel(type);
        }

        if (action.equals("click")) {
            Toast.makeText(context, "click", Toast.LENGTH_SHORT).show();
        }

        if (action.equals("cancel")) {
            Toast.makeText(context, "cancel", Toast.LENGTH_SHORT).show();
        }
    }
}
