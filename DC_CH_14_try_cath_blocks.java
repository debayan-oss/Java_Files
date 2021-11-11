package com.company;

import java.util.Scanner;

public class DC_CH_14_try_cath_blocks {
    public static void main(String[] args) {
//        int a=60000;
//        int b=0;
//        int c=a/b;
        //Without Using Try & Catch Block
//        System.out.println("Result Is "+c);

        //With Using Try & Catch Block
//        try {
//            int c = a / b;
//            System.out.println("Result Is "+c);
//        }
//        catch(Exception e){
//            System.out.println("We Failed To Divide.Reason--->>");
//            System.out.println(e);
//        }


        /////////////// Handling Specific Exception /////////////////
//        int [] marks=new int[3];
//        marks[0]=10;
//        marks[1]=20;
//        marks[2]=30;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter The Array Index:");
//        int ind=sc.nextInt();
//
//        System.out.println("Enter the number you want to divide the value with");
//        int number=sc.nextInt();
//        try{
//            System.out.println("The value at array index entered is: " + marks[ind]);
//            System.out.println("The value of array-value/number is: " + marks[ind]/number);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Arithmetic Exception Occurred");
//            System.out.println(e);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//            System.out.println(e);
//        }
//        catch(Exception e){
//            System.out.println("Some other Exception Occurred");
//            System.out.println(e);
//        }


        ////////////// Nested Try-Catch Block //////////////
//        int[] marks=new int[3];
//        marks[0]=10;
//        marks[1]=20;
//        marks[2]=30;
//        Scanner sc=new Scanner(System.in);
//        boolean flag=true;
//        while(flag){
//            System.out.println("Enter the value of index:");
//            int ind=sc.nextInt();
//            try{
//                System.out.println("Welcome To The Laptop Of Debayan");
//                try{
//                    System.out.println(marks[ind]);
//                    flag=false;
//                }
//                catch(ArrayIndexOutOfBoundsException e){
//                    System.out.println("ArrayIndexOutOfBoundsException Error");
//                    System.out.println(e);
//
//                }
//            }
//            catch(Exception e){
//                System.out.println("Some another exception occurred");
//                System.out.println(e);
//            }
//        }
//        System.out.println("Thanks for using this program");

        // Quick Quiz
//        int []array=new int[5];
//        array[0]=1;
//        array[1]=2;
//        array[2]=3;
//        array[3]=4;
//        array[4]=5;
//
//        Scanner sc1=new Scanner(System.in);
//
//        boolean count=true;
//        while(count) {
//            System.out.println("Enter The Value of Index:");
//            int no = sc1.nextInt();
//            try {
//                System.out.println("Associated Index No Is:");
//                System.out.println(array[no]);
//                try{
//                    System.out.println("Continuing");
//                }
//                catch(ArrayIndexOutOfBoundsException e){
//                    count=false;
//                }
//            }
//            catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ArrayIndexOutOfBoundsException Error");
//                System.out.println(e);
//            }
//            catch(Exception e){
//                System.out.println("Some another exception occurred");
//                System.out.println(e);
//            }
//        }
//        System.out.println("Thanks for using this program");
        }

    }

