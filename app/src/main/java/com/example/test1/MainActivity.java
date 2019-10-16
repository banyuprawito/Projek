package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHelloClick();
    }

    private void btnHelloClick(){
        final Button btnHello = findViewById(R.id.btn_hello);
        final TextView tvHello = findViewById(R.id.hello_text);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String helloText = tvHello.getText().toString();
            if(helloText.equals("")){
                tvHello.setText("Hello!");
                btnHello.setText(R.string.btn_hello_clicked);
            } else {
                tvHello.setText("");
                btnHello.setText(R.string.btn_hello);
            }
            }
        });
    }
}
