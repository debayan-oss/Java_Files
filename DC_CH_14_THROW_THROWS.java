package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius Cannot Be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius Cannot Be Negative";
    }
}

public class DC_CH_14_THROW_THROWS {
    public static float area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        float result= (float) (Math.PI*r*r);
        return result;
    }
    // Made By Harry
    static int divide(int a, int b)
            throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
    // Shivam Uses Divide Function Created By Harry
      try{
//          int c=divide(6,0);
//          System.out.println(c);
          float ar=area(4);
          System.out.println(ar);
      }
      catch(Exception e){
          System.out.println("Exception");
        }
    }

}
