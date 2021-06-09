package com.example.habihabi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Filter1 extends AppCompatActivity {
    private RadioGroup radio_group;
    private Button next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter1);

        setView();
    }

    private void setView() {
        next1 = (Button) findViewById(R.id.next_btn2);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Filter2.class);
                startActivity(intent);
            }
        });

        radio_group = findViewById(R.id.radio_group);
        radio_group.setOnCheckedChangeListener(radioListener);
    }

    private RadioGroup.OnCheckedChangeListener radioListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.cost_zero:
                    for (int i = 0; i < 16; i++) {
                        Properties.tempList.add(Properties.hobbyArrayList.get(i));
                    }
                    break;
                case R.id.cost_one:
                    for (int i = 16; i < 141; i++) {
                        Properties.tempList.add(Properties.hobbyArrayList.get(i));
                    }
                    break;
                case R.id.cost_three:
                    for (int i = 141; i < 305; i++) {
                        Properties.tempList.add(Properties.hobbyArrayList.get(i));
                    }
                    break;
                case R.id.cost_five:
                    for (int i = 305; i < 475; i++) {
                        Properties.tempList.add(Properties.hobbyArrayList.get(i));
                    }
                    break;
                case R.id.cost_ten:
                    for (int i = 475; i < 646; i++) {
                        Properties.tempList.add(Properties.hobbyArrayList.get(i));
                    }
                    break;
                case R.id.cost_fifteen:
                    for (int i = 646; i < 818; i++) {
                        Properties.tempList.add(Properties.hobbyArrayList.get(i));
                    }
                    break;
                case R.id.cost_infinity:
                    for (int i = 818; i < 999; i++) {
                        Properties.tempList.add(Properties.hobbyArrayList.get(i));
                    }
                    break;
            }
        }
    };

}