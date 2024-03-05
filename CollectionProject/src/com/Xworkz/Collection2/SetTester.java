package com.Xworkz.Collection2;

import java.util.HashSet;
import java.util.Set;

public class SetTester {

    public static void main(String[] args) {
        Set<Object> s = new HashSet<>();
        s.add("KGF");
        s.add("KGF");// ignored
        s.add(null);
        s.add(null);

        s.add("Rohit Sharma");

        System.out.println(s);
        for (Object s1 : s){
            System.out.println(s1);
        }

        if (s.contains("KGF")){
        System.out.println("true");}
    }
}
