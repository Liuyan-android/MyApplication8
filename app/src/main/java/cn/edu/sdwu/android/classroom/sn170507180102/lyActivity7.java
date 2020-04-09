package cn.edu.sdwu.android.classroom.sn170507180102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class lyActivity7 extends AppCompatActivity {
    private ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_7);
        ToggleButton toggleButton=(ToggleButton)findViewById(R.id.ly_7_1);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(lyActivity7.this,"on",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(lyActivity7.this,"off",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Spinner spinner=(Spinner)findViewById(R.id.ly_7_spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] strArr=getResources().getStringArray(R.array.strArr);
                String content=strArr[i];
                Toast.makeText(lyActivity7.this,content,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
         spinner=(Spinner)findViewById(R.id.ly_7_spinner2);
        //准备数据
        list=new ArrayList();
        list.add("spinnerItem1");
        list.add("spinnerItem2");
        list.add("spinnerItem3");
        //实例化数组适配器
        //ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.layout_spinner_item,list);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String content=list.get(i).toString();
                Toast.makeText(lyActivity7.this,content,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
