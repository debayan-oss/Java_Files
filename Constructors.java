class MyMainEmployee{
    private int id;
    private String name;


    
    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }



    
    /** 
     * @return String
     */
    public String getName(){
        return name;
    }
    
    /** 
     * @param n
     */
    public void setName(String n){
        this.name = n;
    }
    
    /** 
     * @param i
     */
    public void setId(int i){
        this.id = i;
    }
    
    /** 
     * @return int
     */
    public int getId(){
        return id;
    }
}

public class Constructors {
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
