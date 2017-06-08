package com.company;

public class Main {

    public static int Getsum(int[] x){
        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum +=x[i];
            if(maxsum<sum) {
                maxsum = sum;
            }
            else if(sum<0) {
                sum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {

        int[] arr = {-3,9,1,-2,7,-7,3,10,-2,23};

        System.out.println(Getsum(arr));

    }
}
