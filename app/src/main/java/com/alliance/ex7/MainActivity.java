package com.alliance.ex7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView carsListView;
    List<Cars> list;
    String id,name;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carsListView=findViewById(R.id.l1);
        list=new ArrayList<>();
        Cars c1=new Cars("1","AUDI I8");
        Cars c2=new Cars("2","MERCEDES BENZ");
        Cars c3=new Cars("3","BMW");
        list.add(c1);
        list.add(c2);
        list.add(c3);

        ArrayAdapter ad=new ArrayAdapter<Cars>(MainActivity.this,android.R.layout.simple_list_item_1,list);
        carsListView.setAdapter(ad);

        carsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long po)
            {
                id=list.get(i).getId();
                name=list.get(i).getName();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("id",id);
                intent.putExtra("name",name);
                startActivity(intent);

            }
        });
    }
}
