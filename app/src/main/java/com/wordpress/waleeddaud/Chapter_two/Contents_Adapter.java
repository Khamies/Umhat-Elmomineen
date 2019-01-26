package com.wordpress.waleeddaud.Chapter_two;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wordpress.waleeddaud.R;
import java.util.ArrayList;
import java.util.List;


public class Contents_Adapter  extends RecyclerView.Adapter<Contents_Adapter.Linker> {

        public List<Contents_Data> data=new ArrayList<>();
        public Context context;

        public Contents_Adapter(List<Contents_Data> data)
        {this.data=data;

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
        public void onBindViewHolder(Linker holder, final int position) {
           Contents_Data data_2= data.get(position);
            holder.text.setText(data_2.title);


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



