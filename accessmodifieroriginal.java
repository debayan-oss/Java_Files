class c{
    public int x=5;
    protected int y=6;
    int z=7;
    private int a=9;
    public void method(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);         // its all under same class
        System.out.println(a);
    }
}

public class accessmodifieroriginal {
    public static void main(String[] args) {
        c obj =new c();
        //obj.method();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        //System.out.println(obj.a); // its all under same package
    }
}
