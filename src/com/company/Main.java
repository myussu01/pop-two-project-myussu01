package com.company;

public class Main {

    public static void main(String []args){
        System.out.print(M(100,58));
    }
    public static Integer M(int a, int b){
        boolean x = false;
        if(a < 0){ x = true;
            a*=-1;
        }else if (b < 0){
            x = true; b*=-1;}
        while(a != b){
            if(a>b){a = a-b;}else{
                b = b-a;}
        } if(x){
            a*=-1;}return a;
    }

}
