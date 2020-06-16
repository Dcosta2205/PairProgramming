package com.masai.preclassvideos;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView recyclerView;
    private List<PreClassModel> preClassModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.rv_recycler_view);
        buildModelData();
        PreClassAdapter adapter = new PreClassAdapter(preClassModelList,this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildModelData() {
        for (int i = 0; i < 8; i++) {
            PreClassModel preClassModel = new PreClassModel("Intro to Java " + i, "Lloyd", " 9:00am");
            preClassModelList.add(preClassModel);
        }
    }

    @Override
    public void onItemClicked(PreClassModel model, int position) {
        Toast.makeText(this,"Item clicked at " + position, Toast.LENGTH_SHORT).show();
    }
}