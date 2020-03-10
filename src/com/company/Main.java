package com.company;

public class Main {

    public static void main(String []args){
        int[] an = M(145, -90);
        System.out.print(an[0] + " " + an[1]);
    }
    public static int[] M(int numerator, int denominator){
        boolean x = false;
        boolean j = false;
        int a = numerator;
        int b = denominator;
        if(a < 0){ x = true;
            a*=-1;
        }if (b < 0){
            j = true; b*=-1;}
        while(a != b){
            if(a>b){a = a-b;}else{
                b = b-a;}
        }numerator/=a; denominator/=a; if(j){
            numerator*=-1; denominator*=-1;}int [] ans = new int[2]; ans[0] = numerator; ans[1] = denominator;return ans;
    }

}
