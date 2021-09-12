package com.projetono;

public class Main {

    public static void main(String[] args){

        No<String> no1 = new No<>("No1");

        No<String> no2 = new No<>("No2");
        //no 1 apontando para no2
        no1.setProximono(no2);

        No<String>  no3 = new No<>("No3");
        //no 2 apontando para no3
        no2.setProximono(no3);

        No<String>  no4 = new No<>("No4");
        //no 3 apontando para no 4
        no3.setProximono(no4);

        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono().getProximono());

    }
}
