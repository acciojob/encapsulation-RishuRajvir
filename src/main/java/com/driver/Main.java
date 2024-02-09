package com.driver;

public class Main {
    public static void main(String[] args) {
            RWOnly r = new RWOnly();
            r.setname("Rishu Raj");
            r.setroll(23);
        System.out.println(r.getname()+" "+r.getroll());
    }
}