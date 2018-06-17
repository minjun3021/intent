package com.example.kmj.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);          //연결
        input=(EditText)findViewById(R.id.input);
        btn.setOnClickListener(new View.OnClickListener() { //클릭됐을때
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra("text",input.getText().toString());
                startActivity(intent);
            }
        });

    }
}
