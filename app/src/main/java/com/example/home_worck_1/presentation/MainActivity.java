package com.example.home_worck_1.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.home_worck_1.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  EmojiAdapter emojiAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.rv);
    emojiAdapter = new EmojiAdapter();
    recyclerView.setAdapter(emojiAdapter);

    }
}