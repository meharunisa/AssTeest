package com.example.madamkinza.assignment1_contactlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        TextView textView = (TextView) findViewById(R.id.tvName);
        TextView textView2 = (TextView) findViewById(R.id.tvPhoneNo);

        Intent intent = getIntent();
        String name =  intent.getStringExtra("name");

        String phone =  intent.getStringExtra("phone");

        textView.setText(name);
        textView2.setText(phone);

    }

