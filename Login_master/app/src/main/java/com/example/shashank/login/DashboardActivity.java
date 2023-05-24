package com.example.shashank.login;

/**
 * Created by Shashank on 14-Feb-18.
 */
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class DashboardActivity extends AppCompatActivity {
    String EmailHolder;
    TextView Email;
    Button LogOUT, mbtn_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mbtn_url = findViewById(R.id.btn_url);
        mbtn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://csacademy.com/app/graph_editor/"));
                startActivity(urlintent);
            }
        });

        Email = findViewById(R.id.textView1);
        LogOUT = findViewById(R.id.button1);

        Intent intent = getIntent();
        EmailHolder = intent.getStringExtra(MainActivity.UserEmail);
        Email.setText(Email.getText().toString() + EmailHolder);

        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(DashboardActivity.this, "로그아웃", Toast.LENGTH_LONG).show();
            }
        });
    }
}