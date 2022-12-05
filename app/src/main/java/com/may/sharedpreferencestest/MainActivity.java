package com.may.sharedpreferencestest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSave = findViewById(R.id.btn_save);
//        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();
                editor.putString("name","张三");
                editor.putInt("age",12);
                editor.putBoolean("married",false);
                editor.remove("张三");
                editor.apply();
//                String name = sp.getString("name", "");
//                int age = sp.getInt("age", 0);
//                boolean married = sp.getBoolean("married", true);
//                Toast.makeText(MainActivity.this,"name:"+name+"age:"+age+"married:"+married,Toast.LENGTH_LONG).show();


            }
        });


    }
}