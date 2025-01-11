package com.example.recycleview_demo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview_demo.model.Cat;
import com.example.recycleview_demo.model.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        List<Cat> list_cat = new ArrayList<>();
        list_cat.add(new Cat(R.drawable.img, "mèo dễ thương", "1 ngày"));
        list_cat.add(new Cat(R.drawable.img_1, "mèo báo", "2 ngày"));
        list_cat.add(new Cat(R.drawable.img_2, "mèo chất", "3 ngày"));
        list_cat.add(new Cat(R.drawable.img_3, "mèo meme", "3 ngày"));
        list_cat.add(new Cat(R.drawable.img_4, "nhìn cái gì", "4 ngày"));
        list_cat.add(new Cat(R.drawable.img_5, "Huh Huh Huh ...", "4 ngày"));
        list_cat.add(new Cat(R.drawable.img_6, "Like", "4 ngày"));
        list_cat.add(new Cat(R.drawable.img_7, "Wibu", "6 ngày"));

        recyclerView = findViewById(R.id.recycleview);

        MyAdapter myAdapter = new MyAdapter(list_cat);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }
}