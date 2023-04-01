package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements UsersAdapter.ClickedListener{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<UserModel> list = new ArrayList<UserModel>(){{
                                    add(new UserModel("Ssentamu Abel"));
                                    add(new UserModel("Kivumbi Ronald"));
                                    add(new UserModel("Nakivumbi Rahmah"));
                                    add(new UserModel("Babirye Sharon"));
                                    add(new UserModel("Nakato Daizy"));
    }};





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter = new UsersAdapter(list, getApplicationContext(),  this::clickedItem);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void clickedItem(UserModel user) {
        startActivity(new Intent(getApplicationContext(), SelectedUser.class).putExtra("username", user.getUsername()));

    }


}