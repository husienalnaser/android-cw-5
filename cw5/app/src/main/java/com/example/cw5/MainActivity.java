package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Button next=findViewById(R.id.nextPage);
        final EditText editText=findViewById(R.id.name);
        final EditText editText1=findViewById(R.id.age);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name", editText.getText().toString());
                    intent.putExtra("age",editText1.getText().toString());
                    startActivity(intent);
                }
            });


    }

}