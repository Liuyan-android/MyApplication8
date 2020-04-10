package cn.edu.sdwu.android.classroom.sn170507180102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class lyActivity8_1 extends AppCompatActivity {
private ArrayList list;
    private ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_8);
        list = new ArrayList();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        ListView listView = (ListView) findViewById(R.id.ly_8_1);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        //设置监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String content = list.get(i).toString();
                Toast.makeText(lyActivity8_1.this, content, Toast.LENGTH_SHORT).show();
            }


        });

    }
    public  void refresh(View view){
        list.add("item4");
        list.add("item5");
        arrayAdapter.notifyDataSetChanged();
    }

}
