package com.example.madamkinza.assignment1_contactlist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //adapter view
        ListView listView = (ListView) this.findViewById(R.id.list1);

        //data source
        ArrayList<Contact> arrayList = new ArrayList<>();

        //add dummy data
        arrayList.add(new Contact(1, R.drawable.contacticon, "mehar", "123", "Female"));
        for (int i = 1; i < 1000; i++) {
            arrayList.add(new Contact(i + 1, R.drawable.contacticon, "mehar", "123" + i, "female"));
        }


        ContactAdapter contactAdapter = new ContactAdapter(this, arrayList);
        listView.setAdapter(contactAdapter);


    }

    /*public void buttonClick(View view) {
        View parentView = (View) view.getParent();
        String name = ((TextView) parentView.findViewById(R.id.tvName)).getText().toString();
        String phone = ((TextView) parentView.findViewById(R.id.tvPhoneNo)).getText().toString();
        Intent intent = new Intent(getApplicationContext(), contactDetails.class);
        intent.putExtra("name", name);
        intent.putExtra("phone", phone);
        startActivity(intent);
    }*/



    public void buttonClick(View view) {
        View parentView = (View) view.getParent();
        String number = ((TextView) parentView.findViewById(R.id.tvPhoneNo)).getText().toString();

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        startActivity(intent);

    }


}