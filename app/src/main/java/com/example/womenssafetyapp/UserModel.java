package com.example.womenssafetyapp;

public class UserModel {
    public String name;
    public String email;

    public UserModel(String name,String email){

        this.name=name;
        this.email=email;
    }

    public UserModel(){

    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }


}
