package com.threedev.my_machine_test.utils.network;


import com.threedev.my_machine_test.home.model.DrListModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("doctorinfo")
    @FormUrlEncoded
    Call<DrListModel> getDoctorInfo(@Field("DoctorID") int DoctorID);










}
