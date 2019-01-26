package com.wordpress.waleeddaud.Umahat;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wordpress.waleeddaud.Chapter_two.Contents_Data;
import com.wordpress.waleeddaud.R;

import java.util.ArrayList;
import java.util.List;


public class Five_Adapter  extends RecyclerView.Adapter<Five_Adapter.Linker> {

    public List<Contents_Data> data=new ArrayList<>();
    ArrayList<Class<?>>articles_container=new ArrayList<>();
    String[] articles_data=new String[6];
    int selector;
    public Context context;

    public Five_Adapter(List<Contents_Data> data,ArrayList<Class<?>> articles_container,
                        String []articles_data,int selector)
    {this.data=data;
        this.articles_container=articles_container;
        this.articles_data=articles_data;
        this.selector=selector;

    }

    @Override
    public Linker onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.contents_card,parent,false);
        TextView textView=(TextView)v.findViewById(R.id.textView_OF_content);
        Typeface face=Typeface.createFromAsset(parent.getContext().getAssets(), "fonts/Boahmed_Alhour.ttf");
        textView.setTypeface(face);


        return new Linker(v);
    }

    @Override
    public void onBindViewHolder(Linker holder,  final int  position) {
        Contents_Data data_2= data.get(position);
        holder.text.setText(data_2.title);
         final Class<?>t=articles_container.get(position);
        holder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), t);
                intent.putExtra("Zainab_1",articles_data[position]);
                intent.putExtra("selector",selector);
                Bundle transition = ActivityOptions.makeScaleUpAnimation(view, 0, 0, view.getWidth(),
                        view.getHeight()).toBundle();
                view.getContext().startActivity(intent,transition);

            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }




    public class Linker extends RecyclerView.ViewHolder{

        TextView text;
        public Linker(View itemView) {
            super(itemView);

            text=(TextView) itemView.findViewById(R.id.textView_OF_content);

        }


    }


}


