package com.example.android.malfianazhari_1202154200_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText menu;
    EditText porsi;
    Button btn_abnormal;
    Button btn_eatbus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu =  (EditText) findViewById(R.id.menu);
        porsi = (EditText) findViewById(R.id.porsi);
        btn_abnormal=(Button) findViewById(R.id.btn_abnormal);
        btn_eatbus=(Button) findViewById(R.id. btn_eatbus);

        btn_abnormal.setOnClickListener(this);
        btn_eatbus.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == btn_abnormal.getId()){
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("nama_restoran", btn_abnormal.getText());
            intent.putExtra("porsi", porsi.getText().toString());
            intent.putExtra("menu", menu.getText().toString());
            startActivity(intent);

        } else if(view.getId() == btn_eatbus.getId()){
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("nama_restoran", btn_eatbus.getText());
            intent.putExtra("porsi", porsi.getText().toString());
            intent.putExtra("menu", menu.getText().toString());
            startActivity(intent);
        }
    }
}
