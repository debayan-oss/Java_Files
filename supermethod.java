// class base{
//     public base(){
//         System.out.println("I am a base constructor");
//     }
//     public base(int x){
//         System.out.println("I am a base constructor "+x);
//     }
// }



// class derived extends base{
//     public derived(){
//         System.out.println("I am a derived constructor");
//     }
//     public derived(int x,int y){
//         super(x);
//         System.out.println("I am a derived constructor "+y);
//     }
// }




// class derived_from_base extends derived{
//     public derived_from_base (){
//         System.out.println("I am a derived_from_base constructor");
//     }
//     public derived_from_base (int x,int y, int z){
//         super(x,y);
//         System.out.println("I am a derived_from_base constructor "+z);
//     }
// }




// public class supermethod {
//     public static void main(String[] args) {
//         //base b=new base();
//         //base b=new base(5);
//         //derived d=new derived();
//         //derived d=new derived(6,8);
//         //derived_from_base db=new derived_from_base();
//         derived_from_base db=new derived_from_base(1,2,3);

//     }
// }
