package com.divyansh;

import java.util.Scanner;

public class countnum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = in.nextInt();

        System.out.print("enter which number you want to count: ");
        int z = in.nextInt();



        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == z ){
                count++;

            }
            n = n / 10;

        }
        System.out.println(count);

    }
}
