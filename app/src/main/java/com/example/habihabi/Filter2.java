package com.example.habihabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class Filter2 extends AppCompatActivity {
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9;
    private Button next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter2);

        setView();


    }

    private void setView() {
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);

        next2 = (Button) findViewById(R.id.next_btn2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCheckBox();

                Intent intent = new Intent(getApplicationContext(), HobbyList.class);
                startActivity(intent);
            }
        });
    }

    private void checkCheckBox() {
        if (checkBox1.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("운동")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox2.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("공예/창작")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox3.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("수집")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox4.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("놀이")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox5.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("기르기")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox6.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("음악")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox7.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("감상")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox8.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("자기계발")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
        if (checkBox9.isChecked()) {
            for (int i = 0; i < Properties.tempList.size(); i++) {
                if (Properties.tempList.get(i).getCategory().equals("요리")) {
                    Properties.resultList.add(Properties.tempList.get(i));
                }
            }
        }
    }
}
