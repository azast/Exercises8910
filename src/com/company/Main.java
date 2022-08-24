package com.company;

public class Main {

    public static void main(String[] args) {


        //homework 10
        int a = 6;
        int b = 5;
        int solution;
        int r = a % b;
        boolean isFound = false;


        //homework 10
        while(isFound == false){
            if(a % b == 0) {
                solution = b;
                isFound = true;
                System.out.println(solution);
            }
            else
                a = b;
                b = r;
        }

        //int tracker = 1;
    //int a = 4;
    //int b = 3;
    //int n = 3;
    //int x = 1;

    //while(tracker<a){
        //n = n * 3;
        //tracker = tracker + 1;
    //}
        //System.out.println(n);

    //while(tracker<=a){
      //  x = x * b;
        //tracker = tracker + 1;
    //}
      //  System.out.println(x);
    }
}
