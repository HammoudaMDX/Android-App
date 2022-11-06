package com.android.myapp;

import static com.android.myapp.R.menu.menu_24;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class form extends AppCompatActivity {

    String Choices[] = {
            "5~10",
            "10~15",
            "15~20",
            "20~25",
            "25~30",
            "30~35",
            "35~40"};


    public boolean onCreateOptionsMenu(String choice) {
        MenuInflater inflator = getMenuInflater();
        return true;
    }


    ArrayList<String> listItems=new ArrayList<String>();
    ArrayAdapter<String> adapter;

    TextView List;
    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);




    }
}