abstract class pen{
    
    
    /** 
     * @param refil(
     */
    /** 
     * @param refil(
     */
    abstract void write();
     abstract void refil();
 }


class fountain extends pen{
    void write(){
        System.out.println("write");
    }
    void refil(){
        System.out.println("refil");
    }
    void changenib(){
        System.out.println("change Nib");
    }
}
interface basicanimal{
    void sleep();
    void eat();
}
class monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite...");
    }
}
class human extends monkey implements basicanimal{
    public void speek(){
        System.out.println("hello");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void eat(){
        System.out.println("eat");
    }
}



public class practiceset_60 {
    public static void main(String[] args) {
        
        //q-->1
        // fountain penn=new fountain();
        // penn.write();
        // penn.refil();
        // penn.changenib();

        //q-->2
        // human h=new human();
        // h.speek();
        // h.sleep();
        // h.eat();
        
        // h.jump();
        // h.bite();

        //q-->5(polymorphism eg.)
        monkey m=new human();
        m.jump();
        m.bite();
        //m.sleep()//--> not allowed b/c monkey is reference .so monkey's method is applicable
        //m.speak()
        //m.eat()
        // basicanimal b=new human();
        // b.eat();
        // b.sleep();
        //b.speak,jump,bite not applicable

    }
}
