package com.wordpress.waleeddaud.Chapter_one;

/**
 * Created by root on 30/09/15.
 */

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.wordpress.waleeddaud.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by root on 25/09/15.
 */
public class Mothers_Adapter extends RecyclerView.Adapter<Mothers_Adapter.Linker> {

    public List<Mothers_Data> data=new ArrayList<>();
    public ArrayList<Class<?>> umahat_classes=new ArrayList<>();

    public Mothers_Adapter(List<Mothers_Data> data,ArrayList<Class<?>> umahat_classes)
    {this.data=data;
        this.umahat_classes=umahat_classes;

    }

    @Override
    public Linker onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.mothers_card,parent,false);


        return new Linker(v);
    }

    @Override
    public void onBindViewHolder(Linker holder, final int position) {
        Mothers_Data data_2= data.get(position);
        holder.image.setImageResource(data_2.image);
        final Class<?>t=umahat_classes.get(position);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), t);
                Bundle transition = ActivityOptions.makeCustomAnimation(view.getContext(), R.animator.slide_in_left
                        , R.animator.slide_out_left).toBundle();
                view.getContext().startActivity(intent,transition);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();

    }




    public class Linker extends RecyclerView.ViewHolder{

        ImageView image;
        public Linker(View itemView) {
            super(itemView);

            image=(ImageView) itemView.findViewById(R.id.imageView);
        }


    }


}

