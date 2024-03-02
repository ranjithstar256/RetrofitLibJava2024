package net.simplifiedlearning.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";
    String BASE_URL_Login = "https://simplifiedcoding.net/demos/login";
    String BASE_URL_SignUp = "https://simplifiedcoding.net/demos/signup";

    @GET("marvel")
    Call<List<Hero>> getHeroes();

}
