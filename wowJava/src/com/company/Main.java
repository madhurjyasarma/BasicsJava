package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        byte a = 30;
//        byte b = 45;
//        something = a + b;
//        System.out.println(something);
//        int a;
//        a = 20;
//        System.out.println(a);
//        double b;
//        b = 25.66;
//        System.out.println(b);
//        boolean won;
//        won = true;
//        System.out.println(won);
//
//        String dad = "deta";
//
//        System.out.println(dad);
////        System.lineSeparator(dad);
//
//
//        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
//        System.out.println(n);
//
//


//        Scanner sc = new Scanner(System.in);
//        int a;
//        int b;
//
//        System.out.println("Enter the value of a and b: ");
//        a=sc.nextInt();
//        b=sc.nextInt();
////        System.out.println(a);
//
//        //sum
//        int sum;
//        sum = a + b;
//        System.out.println(sum+"");
//
//        //sub
//        int sub;
//        sub = a - b;
//        System.out.println(sub+"");
//
//        //mul
//        int mul;
//        mul = a * b;
//        System.out.println(mul+"");
//

//with Test cases


        Scanner sc = new Scanner(System.in);

        int test;
        test = sc.nextInt();
        while(test!=0){

            int a;
            int b;

            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println((a+b)+" "+(a-b)+" "+(a*b));

            //decrement test each time
            test--;

        }



    }
}
