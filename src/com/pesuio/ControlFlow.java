package com.pesuio;

import java.util.Scanner;

public class ControlFlow {
//    print the first n fibonacci numbers
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i =0; i<n-2; i++){
            System.out.println(a+b);
            int c=a+b;
            a=b;
            b=c;
        }
    }

//    execute until user enters 0;
    public static void keeprunning(){
        int in;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers, enter 0 to terminate");
        in = scanner.nextInt();
        System.out.println(in);
        while (in!=0){
            in = scanner.nextInt();
            System.out.println(in);
        }
    }

    //    execute until user enters 0;
    public static void runOnce(){
        int in;
        Scanner scanner = new Scanner(System.in);
        do{
            in = scanner.nextInt();
            System.out.println(in);
        }while (in!=0);
    }

    public static void checkEven(int n){
        if(n%2==0){
            System.out.println("even no");
        }else if(n%2==1){
            System.out.println("odd no");
        }else {
            System.out.println("not a number");
        }
    }

}
