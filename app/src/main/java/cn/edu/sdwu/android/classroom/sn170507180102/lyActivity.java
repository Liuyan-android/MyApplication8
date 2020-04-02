package cn.edu.sdwu.android.classroom.sn170507180102;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ly);
        //1、加载界面,不要使用文件名使用id来引用资源
        Button button=(Button) findViewById(R.id.ly_1);
        ImageView imageView=(ImageView)findViewById(R.id.ly_tu);
        //3、调用事件源的setxxxListener方法注册事件监听器
        button.setOnClickListener(new MyClickListener());
        //使用内部匿名类注册监听器
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //设置壁纸
                WallpaperManager wallpaperManager= (WallpaperManager) getSystemService(WALLPAPER_SERVICE);
                try{
                    wallpaperManager.setResource(R.raw.img);
                }catch (Exception e){
                    Log.e(lyActivity.class.toString(),e.toString());

                }

                return true;
            }
        });

    }


    }

    //2、实现事件监听类，该类是一个特殊的java类，必须实现一个xxxListener接口
    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Log.i(lyActivity.class.toString(),"button click");}
    }


