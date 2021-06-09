package com.example.habihabi;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class HobbyList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby_list);

        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row, Properties.resultList);

        ListView lv = (ListView) findViewById(R.id.list_type3);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(getApplicationContext(), Link.class);
                intent.putExtra("uri", Properties.resultList.get(position).uri);


                startActivity(intent);
            }
        });
    }


}

class MyAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Hobby> arrayList;
    LayoutInflater inf;

    public MyAdapter(Context context, int layout, ArrayList<Hobby> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
        inf = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.list);

        Hobby m = arrayList.get(position);
        tvName.setText(m.name);

        return convertView;
    }
}

class Hobby {
    String name = "";
    String uri;
    String category;

    public Hobby(String name, String uri, String category) {
        super();
        this.name = name;
        this.uri = uri;
        this.category = category;
    }

    public Hobby() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}