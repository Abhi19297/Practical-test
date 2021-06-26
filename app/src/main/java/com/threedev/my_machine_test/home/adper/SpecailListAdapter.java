package com.threedev.my_machine_test.home.adper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.threedev.my_machine_test.R;
import com.threedev.my_machine_test.home.model.DrListModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpecailListAdapter extends RecyclerView.Adapter<SpecailListAdapter.MyViewHolder>  {
    Context context;
    ArrayList<DrListModel.Data.Specialist> list;




    public SpecailListAdapter(Context context, ArrayList<DrListModel.Data.Specialist> list) {
        this.context = context;
        this.list=list;




    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.special_dr_list_litem,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {





        holder.txt_specialist_name.setText(list.get(position).getSpecialistName());
        holder.txtCreateDate.setText(context.getString(R.string.date)+list.get(position).getCreatedDate());

        holder.txt_update_date.setText("Update Date :- "+list.get(position).getUpdatedDate());
        holder.txt_updated_at.setText("Update At :- "+list.get(position).getUpdated_at());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView txt_specialist_name,txtCreateDate,txt_update_date,txt_updated_at;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            txt_specialist_name=itemView.findViewById(R.id.txt_specialist_name);
            txtCreateDate=itemView.findViewById(R.id.txt_create_date);
            txt_update_date=itemView.findViewById(R.id.txt_update_date);
            txt_updated_at=itemView.findViewById(R.id.txt_updated_at);




        }
    }

}
