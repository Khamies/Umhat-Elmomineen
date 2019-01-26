package com.wordpress.waleeddaud.z_Conculsion;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wordpress.waleeddaud.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 12/10/15.
 */

public class Final_Adapter2 extends RecyclerView.Adapter<Final_Adapter2.Linker> {


    public List<Final_Data> data=new ArrayList<>();
    public ArrayList<Class<?>> MyApp_classes=new ArrayList<>();

    public Final_Adapter2(List<Final_Data> data, ArrayList<Class<?>> MyApp_classes)
    {this.data=data;
        this.MyApp_classes=MyApp_classes;

    }

    @Override
    public Linker onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.final_card2,parent,false);


        return new Linker(v);
    }

    @Override
    public void onBindViewHolder(Linker holder, final int position) {
        Final_Data data_2= data.get(position);
        holder.image.setImageResource(data_2.image);
        holder.textView.setText(data_2.text);
        final Class<?>t=MyApp_classes.get(position);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), t);
                Bundle transition = ActivityOptions.makeScaleUpAnimation(view, 0, 0, view.getWidth(),
                        view.getHeight()).toBundle();
                view.getContext().startActivity(intent,transition);

            }
        });

        //holder.setonclick was repeated to able the user to go to next activity smoothly by image or text.
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), t);
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

        ImageView image;
        TextView textView;
        public Linker(View itemView) {
            super(itemView);

            image=(ImageView) itemView.findViewById(R.id.imageView2);
            textView=(TextView) itemView.findViewById(R.id.textView_of_finalCard2);
        }


    }
}


