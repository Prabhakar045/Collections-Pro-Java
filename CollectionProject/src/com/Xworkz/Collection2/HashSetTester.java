package com.Xworkz.Collection2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTester {

    public static void main(String[] args) {

        HashSet<String> h = new HashSet<>();
        h.add("pbk");
        h.add("KL");

        HashSet<String>  h1 = new HashSet<>();
        h1.add("pbk");
        h.add("hd");
        h.add("rm");




     boolean n =   h.addAll(h);
    System.out.println(n);

    }
}
