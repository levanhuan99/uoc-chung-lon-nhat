package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;

        System.out.println("Enter a:");
        a=input.nextInt();

        System.out.println("Enter b: ");
        b=input.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 ||b==0){
            System.out.println("there is no grestest common factor");
        }
        while (a!=b){
            if (a>b)
                a= a-b;
            else
                b=b-a;
        }
        System.out.println("Greatest common factor: "+a);







    }
}
