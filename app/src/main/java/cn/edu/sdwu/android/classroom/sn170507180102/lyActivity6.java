package cn.edu.sdwu.android.classroom.sn170507180102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class lyActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_6);
        //在JAVA里面获取资源
        String content=getString(R.string.hello);
        Log.i(lyActivity6.this.toString(),content);
    String sms=getString(R.string.sms);
        sms=String.format(sms,100,"张三");
        Log.i(lyActivity6.this.toString(),sms);

    }
}
