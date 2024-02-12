package com.driver;

public class RWOnly {
    private   int roll;
    private String name;
//    public RWOnly(int roll, String name){
//        this.roll = roll;
//        this.name = name;
//    }
    public void setName(String name){
       this.name = name;
    }
   
    public String getName(){
        return this.name;
    }
}
