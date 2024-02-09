package com.driver;

public class RWOnly {
    private   int roll;
    private String name;
//    public RWOnly(int roll, String name){
//        this.roll = roll;
//        this.name = name;
//    }
    public void setroll(int roll){
        if(roll<0)
            return;
        this.roll = roll;
    }
    public int getroll(){
        return this.roll;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return this.name;
    }
}
