package com.threedev.my_machine_test.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import com.threedev.my_machine_test.R;
import com.threedev.my_machine_test.home.adper.SpecailListAdapter;
import com.threedev.my_machine_test.home.adper.TrainingListAdapter;
import com.threedev.my_machine_test.home.model.DrListModel;
import com.threedev.my_machine_test.utils.Constant;
import com.threedev.my_machine_test.utils.network.ApiClient;
import com.threedev.my_machine_test.utils.network.ApiInterface;
import com.threedev.my_machine_test.utils.network.NetworkUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ApiInterface apiInterface;

    ImageView ivDr;
    TextView txtDrName,txtDrAddress,txt_degree,txt_slogun,txt_about,txt_registration_id;
    TextView txt_graduation_year,txt_location_from,txt_focus,txt_consation_fees,txt_consaction_day;
    TextView txt_language,txt_contact_number,txt_website,txt_message,txt_additional_date;
    RecyclerView rvTraining,rvSpecialist;
    TrainingListAdapter adapter;
    private ProgressDialog pDialog;
    NestedScrollView nv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nv_main = findViewById(R.id.nv_main);
        ivDr = findViewById(R.id.iv_dr);
        txtDrName = findViewById(R.id.txt_dr_name);
        txtDrAddress = findViewById(R.id.txt_dr_address);
        rvTraining = findViewById(R.id.rv_training);
        rvSpecialist = findViewById(R.id.rv_specialist);
        txt_degree = findViewById(R.id.txt_degree);
        txt_slogun = findViewById(R.id.txt_slogun);
        txt_about = findViewById(R.id.txt_about);
        txt_registration_id = findViewById(R.id.txt_registration_id);
        txt_graduation_year = findViewById(R.id.txt_graduation_year);
        txt_location_from = findViewById(R.id.txt_location_from);
        txt_focus = findViewById(R.id.txt_focus);
        txt_consaction_day = findViewById(R.id.txt_consaction_day);
        txt_consation_fees = findViewById(R.id.txt_consation_fees);
        txt_language = findViewById(R.id.txt_language);
        txt_contact_number = findViewById(R.id.txt_contact_number);
        txt_website = findViewById(R.id.txt_website);
        txt_message = findViewById(R.id.txt_message);
        txt_additional_date = findViewById(R.id.txt_additional_date);


        if (NetworkUtils.isNetworkConnected(MainActivity.this)) {
            try {

                pDialog = new ProgressDialog(this);
                pDialog.setMessage("Please wait...");
                pDialog.setCancelable(false);
                pDialog.show();
                getDoctorInfo(4);


            } catch (Exception e) {
                pDialog.dismiss();
                e.printStackTrace();

                Toast.makeText(MainActivity.this, Constant.SWW, Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(MainActivity.this, Constant.NIC, Toast.LENGTH_SHORT).show();
        }
    }










    private void getDoctorInfo(int DoctorId) {


        Call<DrListModel> call = apiInterface.getDoctorInfo(DoctorId);

        call.enqueue(new Callback<DrListModel>() {
            @Override
            public void onResponse(Call<DrListModel> call, Response<DrListModel> response) {
                pDialog.dismiss();
                DrListModel model = response.body();

                if(model != null){

                    DrListModel.Data data =model.getData();

                    if(data != null){

                        nv_main.setVisibility(View.VISIBLE);
                        setDrInfo(data);


                        ArrayList<DrListModel.Data.Training> trainingArrayList = new ArrayList<>();

                        trainingArrayList = data.getTraining();

                        if(trainingArrayList != null && !trainingArrayList.isEmpty()){

                            adapter = new TrainingListAdapter(MainActivity.this,trainingArrayList);
                            rvTraining.setAdapter(adapter);
                        }

                        ArrayList<DrListModel.Data.Specialist> specialistArrayList = new ArrayList<>();

                        specialistArrayList = data.getSpecialist();

                        if(specialistArrayList != null && !specialistArrayList.isEmpty()){

                           SpecailListAdapter adapter = new SpecailListAdapter(MainActivity.this,specialistArrayList);
                            rvSpecialist.setAdapter(adapter);
                        }



                    }
                    else {
                        Toast.makeText(MainActivity.this, model.getMessage(), Toast.LENGTH_SHORT).show();

                    }







                }
                else {
                    Toast.makeText(MainActivity.this, Constant.DNF, Toast.LENGTH_SHORT).show();


                }


            }

            @Override
            public void onFailure(Call<DrListModel> call, Throwable t) {
                pDialog.dismiss();
                Toast.makeText(MainActivity.this, Constant.SWW, Toast.LENGTH_SHORT).show();


            }
        });



    }

    private void setDrInfo(DrListModel.Data data) {
        txtDrName.setText(data.getDoctorName());
        txtDrAddress.setText(data.getAartasLocation());

        Glide
                .with(MainActivity.this)
                .load(data.getProfile())
                 .placeholder(R.drawable.no_img)
                .error(R.drawable.no_img)
                .into(ivDr);



        txt_degree.setText(data.getDegree());
        txt_slogun.setText(data.getSlogun());
        txt_about.setText(data.getAbout());
        txt_registration_id.setText(data.getRegistrationID());
        txt_graduation_year.setText(data.getGraduationYear());
        txt_location_from.setText(data.getLocationFrom());
        txt_focus.setText(data.getFocus());
        txt_consaction_day.setText(data.getConsactionDay());
        txt_consation_fees.setText(data.getConsationFees());
        txt_language.setText(data.getLanguage());
        txt_contact_number.setText(data.getContactNumber());
        txt_website.setText(data.getWebsite());
        txt_message.setText(data.getMessage());

        StringBuilder builder = new StringBuilder();
        for (String s: data.getAdditional_date()) {
            builder.append(s);
            builder.append(" ");
        }
        txt_additional_date.setText(builder.toString().trim());
    }

}