package com.threedev.my_machine_test.home.adper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import com.threedev.my_machine_test.R;
import com.threedev.my_machine_test.home.model.DrListModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TrainingListAdapter extends RecyclerView.Adapter<TrainingListAdapter.MyViewHolder>  {
    Context context;
    ArrayList<DrListModel.Data.Training> list;




    public TrainingListAdapter(Context context, ArrayList<DrListModel.Data.Training> list) {
        this.context = context;
        this.list=list;




    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.training_dr_list_litem,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {



        Glide
                .with(context)
                .load(list.get(position).getThumbImage())
                .placeholder(R.drawable.no_img)
                .error(R.drawable.no_img)
                .into(holder.ivProfile);

        holder.txtClgName.setText(list.get(position).getCollegeName());
        holder.txtCreateDate.setText(context.getString(R.string.date)+list.get(position).getCreatedDate());

        holder.txtDegree.setText(context.getString(R.string.degree)+list.get(position).getDegree());
        holder.txtYear.setText(context.getString(R.string.yr)+list.get(position).getYear());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivProfile;
        TextView txtClgName,txtCreateDate,txtDegree,txtYear;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivProfile=itemView.findViewById(R.id.iv_profile);
            txtClgName=itemView.findViewById(R.id.txt_clg_name);
            txtCreateDate=itemView.findViewById(R.id.txt_create_date);
            txtDegree=itemView.findViewById(R.id.txt_degree);
            txtYear=itemView.findViewById(R.id.txt_year);




        }
    }

}
