package com.example.k_ssun.lab_intent1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

// NextActivity를 사용하기 위해 AndroidManifest.xml에 사용한다고 명시를 해줘야함
// <activity android:name=".NextActivity"></activity>
public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent in = this.getIntent();
        // Intent in = this.get타입명Extra("데이터 키"); 지정한 키값에 맞는 데이터가 없으면 null반환
        Toast.makeText(this.getApplicationContext(), "name : " + in.getStringExtra("name"), Toast.LENGTH_LONG).show();

    }
}
