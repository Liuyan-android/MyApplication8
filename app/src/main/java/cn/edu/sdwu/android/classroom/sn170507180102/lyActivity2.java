package cn.edu.sdwu.android.classroom.sn170507180102;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class lyActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);
        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.ly_choice);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //第二个参数代表当前选中radiobutton的ID
                RadioButton radioButton=(RadioButton) findViewById(i);
                Object object=radioButton.getTag();
                TextView textView=(TextView) findViewById(R.id.ly_text);
                if(object!=null&&object.toString().equals("1")){
                  textView.setText("right");
                }else {
                    textView.setText("wrong");
                }
            }
        });

    }
}
