package com.example.jinha.chief;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    List<String > list = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list.add("大法阿斯蒂芬");
        list.add("的算法水电费");
        list.add("二维儿童");
        list.add("好热个人");
        list.add("玩儿腐蚀光环");
        list.add("大法阿斯蒂芬");
        list.add("的算法水电费");
        list.add("二维儿童");
        list.add("好热个人");
        list.add("玩儿腐蚀光环");
        list.add("大法阿斯蒂芬");
        list.add("的算法水电费");
        list.add("二维儿童");
        list.add("好热个人");
        list.add("玩儿腐蚀光环");
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycle_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(this.list);
        mAdapter.setItemClickListener(this);
        mRecyclerView.addItemDecoration(new MyItemDecoration());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this,MenuActivity.class);
        startActivity(intent);
    }
}

