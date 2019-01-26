package com.wordpress.waleeddaud.Chapter_one;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

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
import com.wordpress.waleeddaud.z_Conculsion.Books;
import com.wordpress.waleeddaud.z_Conculsion.My_App;

import java.util.ArrayList;
import java.util.List;


public class Mothers extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mothers);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ////////////////////////////////////////////////////////
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycleview_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Mothers_Adapter adapter=new Mothers_Adapter(charge_adapter(),Umahat_classes());
        recyclerView.setAdapter(adapter);


    }

    ArrayList arrayList=new ArrayList();
    Mothers_Data data=new Mothers_Data();

    public List <Mothers_Data> charge_adapter()
    {
     for (int i=0;i<data.Mothers_images.length;i++)
     { Mothers_Data data2=new Mothers_Data();
        data2.image=data2.Mothers_images[i];
         arrayList.add(data2);
     }

    return arrayList;
    }


    public ArrayList<Class<?>> Umahat_classes()
    { ArrayList<Class<?>> arrayList=new ArrayList<>();
        arrayList.add(One.class);
        arrayList.add(Two.class);
        arrayList.add(Three.class);
        arrayList.add(Four.class);
        arrayList.add(Five.class);
        arrayList.add(Six.class);
        arrayList.add(Seven.class);
        arrayList.add(Eight.class);
        arrayList.add(Nine.class);
        arrayList.add(Ten.class);
        arrayList.add(Eleven.class);
        arrayList.add(Books.class);
        arrayList.add(My_App.class);


        return arrayList;}




}
