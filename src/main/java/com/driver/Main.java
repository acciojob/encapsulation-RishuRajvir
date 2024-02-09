package com.driver;

public class Main {
    public static void main(String[] args) {
            RWOnly r = new RWOnly();
            r.setter("Rishu Raj");
            // r.g(23);
        System.out.println(r.getter());
    }
}
