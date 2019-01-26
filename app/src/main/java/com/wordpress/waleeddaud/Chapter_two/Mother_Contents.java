package com.wordpress.waleeddaud.Chapter_two;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.wordpress.waleeddaud.R;

import java.util.ArrayList;
import java.util.List;


public class Mother_Contents extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother__contents);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycleview_2);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
        Contents_Adapter adapter=new Contents_Adapter(charge_Content());
        recyclerView.setAdapter(adapter);

    }


    ArrayList <Contents_Data> arrayList=new ArrayList<>();
    Contents_Data data=new Contents_Data();

    public List<Contents_Data> charge_Content()
    {
        for (int i=0;i<data.Titles.length;i++)
        { Contents_Data data2=new Contents_Data();
            data2.title=data.Titles[i];
            arrayList.add(data2);

        }
     return arrayList;
    }

}
