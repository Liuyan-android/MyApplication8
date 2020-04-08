package cn.edu.sdwu.android.classroom.sn170507180102;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

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
        //获取数组资源
        Resources resources=getResources();
        //整型数组
       int[] inArr=resources.getIntArray(R.array.inArr);
        for(int i=0;i<inArr.length;i++){
            Log.i(lyActivity6.this.toString(),inArr[i]+"");
        }
        //字符串数组
       String[] strArr=resources.getStringArray(R.array.strArr);
for(int i=0;i<strArr.length;i++){
    Log.i(lyActivity6.this.toString(),strArr[i]+"");
}
//普通类型数组
       TypedArray typedArray= resources.obtainTypedArray(R.array.commanArr);
        ImageView imageView=(ImageView)findViewById(R.id.ly_6);
        int resId=typedArray.getResourceId(0,0);
        imageView.setImageResource(resId);
         String str=typedArray.getString(1);
        Log.i(lyActivity6.this.toString(),str);
        //注册上下文菜单
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.ly_1_1);
        registerForContextMenu(linearLayout);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.mymenu1,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mymenu_item1:
                Toast.makeText(this,"item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item2:
                Toast.makeText(this,"item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item3:
                Toast.makeText(this,"item3",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mymenu_item1:
                Toast.makeText(this,"item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item2:
                Toast.makeText(this,"item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item3:
                Toast.makeText(this,"item3",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }

    @Override
        public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.mymenu1,menu);
        return true;

    }

}
