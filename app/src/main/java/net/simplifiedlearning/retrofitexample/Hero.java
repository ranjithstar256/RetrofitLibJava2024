package net.simplifiedlearning.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Hero {

    @SerializedName("realname")
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//
//    public String getRealname() {
//        return realname;
//    }
//
//    public String getTeam() {
//        return team;
//    }
//
//    public String getFirstappearance() {
//        return firstappearance;
//    }
//
//    public String getCreatedby() {
//        return createdby;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public String getImageurl() {
//        return imageurl;
//    }

    //public String getBio() {
  //      return bio;
  //  }
}
