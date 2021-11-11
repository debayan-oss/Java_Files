package com.company;

public class throw__ {
    
    /** 
     * @param a
     * @param b
     * @return int
     * @throws ArithmeticException
     */
    static int div(int a ,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        try{
            int c=div(6, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("you cant divided it by zero :(");
        }
    }
}
