package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SelectedUser extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_user);

        TextView username = (TextView) findViewById(R.id.tv_selectedUser);
        String data =  getIntent().getStringExtra("username");


        username.setText(data);

    }

}