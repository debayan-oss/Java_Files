// //import java.util.*;
// public class practiceset_86 {
//     public static void main(String[] args) {
//         //pro1
//         //syntex error
//         // int a=1
//         // System.out.println(a);

//         //logical error
//         //prime number print
//         // int i=0;
//         // for(i=0;i<5;i++){
//         //     System.out.println(2*i+1);
//         // }// but 9 is not a prime number
//         //System.out.println(8/0);// run time error

//         //pro2
//         // try{
//         //     int a = 666/0;
//         // }
//         // catch (IllegalArgumentException e){
//         //     System.out.println("HeHe");
//         // }
//         // catch (ArithmeticException e){
//         //     System.out.println("Haha");
//         // }

//         //pro3
//         boolean flag=true;
//         int [] arr=new int[3];
//         arr[0]=1;
//         arr[1]=2;
//         arr[2]=3;
//         java.util.Scanner sc=new java.util.Scanner(System.in);
//         //Random rand=new Random();
//         int i=0;
//         while(flag && i<5){
//             try{
//                 System.out.println("enter the index");
//                 int ind=sc.nextInt();
//                 System.out.println("value is"+arr[ind]);
//                 break;
//             }
//             catch(Exception e){
//                 System.out.println("error");
//                 i++;
//             }

//         }
//         if(i>=5){
//             System.out.println("Haha end");
//         }

//     }
// }
