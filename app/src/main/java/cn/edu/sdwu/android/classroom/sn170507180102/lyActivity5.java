package cn.edu.sdwu.android.classroom.sn170507180102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class lyActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_5);
    }
    public  void toast1(View view){
        Toast.makeText(this, "toast1", Toast.LENGTH_SHORT).show();
    }
    public void toast2(View view){
       Toast toast=Toast.makeText(this,"toast2",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
    public void toast3(View view){
        LayoutInflater layoutInflater=getLayoutInflater();
        View view1=layoutInflater.inflate(R.layout.layout_toast,null);
        Toast toast=new Toast(this);
        toast.setView(view1);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }


}
