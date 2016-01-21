package com.example.activity.chapter11_listview_multichoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private static final String[] items = { "lorem", "ipsum",
            "dolor", "sit", "amet", "consectetuer", "adipiscing",
            "elit", "morbi", "vel", "ligula", "vitae", "arcu",
            "aliquet", "mollis", "etiam", "vel", "erat", "placerat",
            "ante", "porttitor", "sodales", "pellentesque", "augue",
            "purus" };
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, items);
        listView.setAdapter(adapter);
    }
}
