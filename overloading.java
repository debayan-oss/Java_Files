

public class overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    
    /** 
     * @param a
     */
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    
    /** 
     * @param a
     * @param b
     */
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    
    /** 
     * @param a
     * @param b
     * @param c
     */
    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!"); 
    }

    
    /** 
     * @param a
     */
    static void change(int a){
        a = 98;
    }

    
    /** 
     * @param arr
     */
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // tellJoke();

        // Case 1: Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);


        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!


    }
}
