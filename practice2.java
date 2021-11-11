class cylinder{
    private int height;
    private int radius;
    public cylinder(int h,int r){
        height=h;
        radius=r;

    }

    
    /** 
     * @return int
     */
    public int getradius(){
        return radius;
    }
    
    /** 
     * @param r
     */
    public void setradius(int r){
        radius=r;
    }
    
    /** 
     * @return int
     */
    public int getheight(){
        return height;
    }
    
    /** 
     * @param h
     */
    public void setheight(int h){
        height=h;
    }
    
    /** 
     * @return double
     */
    public double vol(){
        return Math.PI*radius*radius*height;
    }
    
    /** 
     * @return double
     */
    public double area(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }

}
class rectangle{
    private int length;
    private int height;

    public rectangle(){
        length=12;
        height=10;
    }
    public rectangle(int l,int h){
        length=l;
        height=h;
    }
    public int  getlen(){
        return length;
    }
    public int getheight(){
        return height;
    }
}


public class practice2 {
    public static void main(String[] args) {
        //cylinder cy=new cylinder(5,2);
        //cy.setheight(5);
        //System.out.println(cy.getheight());
        //cy.setradius(2);
        // System.out.println(cy.getradius());
        // System.out.println(cy.vol());
        // System.out.println(cy.area());
        rectangle obj=new rectangle(10,50);
        System.out.println(obj.getheight());
        System.out.println(obj.getlen());
    }
}
