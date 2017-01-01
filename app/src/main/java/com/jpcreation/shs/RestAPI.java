package com.jpcreation.shs;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Praveen J
 * Date: 10/12/2016
 * Project: SHS
 * Package: com.jpcreation.shs
 * Description:
 */

public interface RestAPI {
   @GET("/viewDepart")
   Call<Department> getDepart(@Query("id") String id);
}
