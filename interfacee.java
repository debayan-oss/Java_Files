interface raj{
    int a=45;
    void method1();
    void method2();
}
interface saj{
    void method3();
    void method4();

}
class rajsaj implements raj,saj{
    public void method1(){
        System.out.println("I am method1");
    }
    public void method2(){
        System.out.println("I am method2");
    }

    public void method3(){
        System.out.println("I am method3");
    }
    public void method4(){
        System.out.println("I am method4");
    }
}
public class interfacee {
    public static void main(String[] args) {
        rajsaj rs=new rajsaj();
        rs.method1();
        //System.out.println(rs.a);
    }
}
