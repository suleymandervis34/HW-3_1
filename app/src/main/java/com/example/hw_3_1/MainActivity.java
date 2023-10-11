package com.example.hw_3_1;

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

        EditText gmail = findViewById(R.id.get_email);
        EditText mesege = findViewById(R.id.get_mesege);
        EditText then = findViewById(R.id.get_then);
        Button otpravit = findViewById(R.id.otpravit);
        otpravit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = gmail.getText().toString();
                String themes = then.getText().toString();
                String messages = mesege.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
                intent.putExtra(Intent.EXTRA_SUBJECT, themes);
                intent.putExtra(Intent.EXTRA_TEXT, messages);
                startActivity(Intent.createChooser(intent, "Send"));
            }
        });

    }
}