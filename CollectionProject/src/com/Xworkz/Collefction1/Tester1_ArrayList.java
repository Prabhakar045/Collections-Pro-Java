package com.Xworkz.Collefction1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tester1_ArrayList {
    public static void main(String[] args) {


        String moviesNames[] = new String[6];
        moviesNames[0]="pbk";
        moviesNames[1]="";
        moviesNames[2]="";
        moviesNames[3]="";
        moviesNames[4]="";
        moviesNames[5]="";
//        moviesNames[6]="";

        System.out.println(moviesNames);



        String  array[] = {};  //1
        int[]  array1 = {};

        String[]  s = new String[10];  //2


        //Abstraction
        // <> Generics helps to add similar type of Objects
        // Here ArrayList() is giving implementation

        Collection moviesName = new ArrayList();
        //  Collection moviesName = new TreeSet();
        moviesName.add("KGF");
        moviesName.add(1);
        moviesName.add("pk");
        moviesName.add("Uppi");
        moviesName.add("jogi");
        moviesName.add("om");


        for(Object movies : moviesName){
            System.out.println(movies);
        }

        System.out.println(moviesName.size());
        System.out.println(moviesName.remove("jogi"));
        System.out.println(moviesName.size());

        System.out.println("******************************************");

        List<String> c = new ArrayList<String>();
        c.add("Prabhakar");
//        c.add(1000);
        c.add("");
        c.add(1, "shekar");


        System.out.println(c);

    }
}
