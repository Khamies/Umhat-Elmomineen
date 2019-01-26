package com.wordpress.waleeddaud.Umahat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.wordpress.waleeddaud.Chapter_two.Contents_Data;
import com.wordpress.waleeddaud.R;
import com.wordpress.waleeddaud.z_Article.Article_1;
import com.wordpress.waleeddaud.z_Article.Article_2;
import com.wordpress.waleeddaud.z_Article.Article_3;
import com.wordpress.waleeddaud.z_Article.Article_4;
import com.wordpress.waleeddaud.z_Article.Article_5;
import com.wordpress.waleeddaud.z_Conculsion.Check_Connection;

import java.util.ArrayList;
import java.util.List;

public class Eleven extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        String [] articles_data=getResources().getStringArray(R.array.Mimona);
        int article_Selector=11;

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycleview_K);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
        Eleven_Adapter adapter=new Eleven_Adapter(charge_Content(),Article_Containers(),articles_data,article_Selector);
        recyclerView.setAdapter(adapter);

    }


    ArrayList<Contents_Data> arrayList=new ArrayList<>();
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

    public ArrayList<Class<?>> Article_Containers()
    { ArrayList<Class<?>> arrayList=new ArrayList<>();
        arrayList.add(Article_1.class);
        arrayList.add(Article_2.class);
        arrayList.add(Article_3.class);
        arrayList.add(Article_4.class);
        arrayList.add(Article_5.class);
        arrayList.add(Check_Connection.class);

        return arrayList;
    }

    ////////////////////////////////////////////////////////////////////////

    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(R.animator.slide_in_right,R.animator.slide_out_right);
    }


}
