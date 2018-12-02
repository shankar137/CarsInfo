package com.alliance.ex7;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView car_name,car_date,car_company;
    ImageView car_image;
    String id,name;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        car_name=findViewById(R.id.carname);
        car_image=findViewById(R.id.carimage);
        car_date=findViewById(R.id.car_date);
        car_company=findViewById(R.id.car_com);
        id=getIntent().getStringExtra("id");
        name=getIntent().getStringExtra("name");
        car_name.setText(name);
        if(id.equals("1"))
        {
            car_image.setImageResource(R.drawable.audi);
            car_company.setText("COMPANY: AUDI");
            car_date.setText("Date: 13-02-2018");
        }
        if(id.equals("2"))
        {
            car_image.setImageResource(R.drawable.mercedes);
            car_company.setText("COMPANY: MERCEDES");
            car_date.setText("Date: 11-04-2018");
        }
        if(id.equals("3"))
        {
            car_image.setImageResource(R.drawable.bmw);
            car_company.setText("COMPANY: BMW");
            car_date.setText("Date: 13-03-2018");
        }

    }
}
