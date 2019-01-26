package com.wordpress.waleeddaud.z_Conculsion;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.wordpress.waleeddaud.Chapter_one.Mothers_Adapter;
import com.wordpress.waleeddaud.Chapter_one.Mothers_Data;
import com.wordpress.waleeddaud.R;
import com.wordpress.waleeddaud.Umahat.Eight;
import com.wordpress.waleeddaud.Umahat.Eleven;
import com.wordpress.waleeddaud.Umahat.Five;
import com.wordpress.waleeddaud.Umahat.Four;
import com.wordpress.waleeddaud.Umahat.Nine;
import com.wordpress.waleeddaud.Umahat.One;
import com.wordpress.waleeddaud.Umahat.Seven;
import com.wordpress.waleeddaud.Umahat.Six;
import com.wordpress.waleeddaud.Umahat.Ten;
import com.wordpress.waleeddaud.Umahat.Three;
import com.wordpress.waleeddaud.Umahat.Two;

import java.util.ArrayList;
import java.util.List;


public class Books extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycleview_Of_books);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Final_Adapter1 adapter=new Final_Adapter1(charge_adapter(),Books_classes());
        recyclerView.setAdapter(adapter);





    }


    ArrayList arrayList=new ArrayList();
    Final_Data data=new Final_Data();

    public List<Final_Data> charge_adapter()
    {
        for (int i=0;i<data.Books_Image.length;i++)
        { Final_Data data2=new Final_Data();
            data2.image=data2.Books_Image[i];
            arrayList.add(data2);
        }

        return arrayList;
    }


    public ArrayList<Class<?>> Books_classes()
    { ArrayList<Class<?>> arrayList=new ArrayList<>();
        arrayList.add(Book_1.class);
        arrayList.add(Book_2.class);
        arrayList.add(Book_3.class);


        return arrayList;}


    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(R.animator.slide_in_right,R.animator.slide_out_right);
    }


}
