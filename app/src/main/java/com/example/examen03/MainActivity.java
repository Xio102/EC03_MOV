package com.example.examen03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button supportButton;
    private RecyclerView recyclerView;
    private FoodAdapter foodAdapter;
    private ArrayList<FoodModel> foodModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();

        supportButton = findViewById(R.id.support_button);
        recyclerView = findViewById(R.id.food_recycler_view);
        foodAdapter = new FoodAdapter(foodModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);

        supportButton.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this,SupportActivity.class);
            startActivity(intent);
        });
    }

    private void getData() {
        foodModel = new ArrayList<>();
        foodModel.add(new FoodModel("fideos", R.drawable.fideos));
        foodModel.add(new FoodModel("ensalada", R.drawable.ensalada));
        foodModel.add(new FoodModel("hamburguesa", R.drawable.hamburguesa));
        foodModel.add(new FoodModel("pastel", R.drawable.pastel));
        foodModel.add(new FoodModel("agua", R.drawable.agua));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share_icon:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.folder_icon:
                Toast.makeText(this, "Folder", Toast.LENGTH_SHORT).show();
                break;
            case R.id.notification_icon:
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_icon:
                Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;

    }
}