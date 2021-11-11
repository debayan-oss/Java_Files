//inheritance is the act where we borrow property and method from exiting class
package  com.company;
class boy{
    int x;
    String name;
    
    /** 
     * @return String
     */
    public String getb(){
        return name;
    }
    
    /** 
     * @param n
     */
    public void setb(String n){
        name=n;
    }
}
class girl extends boy {
    int y;
    //String name; get this property from the boy 
    public String getg(){
        return name;
    }
    public void setg(String n){
        name=n;
    }
}

public class inheritance {
    public static void main(String[] args) {
        // boy b=new boy();
        // b.setb("rajdeep");
        // System.out.println(b.getb());
        // girl g=new girl();
        // g.setb("rajdeep");
        // System.out.println(g.getb());
        // boy b=new boy();
        // b.setg("rajdeep");
        // System.out.println(b.getg());
        girl g=new girl();
        g.setg("rajdeep");
        System.out.println(g.getg());

    }
}
