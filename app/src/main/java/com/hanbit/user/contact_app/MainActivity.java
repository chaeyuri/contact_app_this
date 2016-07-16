package com.hanbit.user.contact_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<People> list = PeopleList.getList();
        final ListView contactList = (ListView) findViewById(R.id.listView);
        contactList.setAdapter(new Adapter(this,list));
    }
}
