package com.company;

public class Author {

    private String name;
    private String email;
    private String gender;


    public Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    public String getName(){
        return  this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getGender(){
        return this.gender;
    }

    public String toString(){
        return "Author[name = " + name + " ,email=" + email + " ,gender " + gender + "]";

    }

}
