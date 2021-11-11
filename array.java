public class array {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // int []arr={2,3,4,5,4};
        // for(int e:arr){
        //     System.out.println(e);
        // }


        // int [] arr=new int[3];
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=4;
        // System.out.println(arr[2]);
        

        // int [] arr;
        // arr=new int[5];
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=4;
        // System.out.println(arr[0]);

        int [][] flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        //System.out.println(flats[0][2]);
        for(int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
      


        // int [][] flats; // A 2-D Array
        // flats = new int [2][3];
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;

        // // Displaying the 2-D Array (for loop)
        // System.out.println("Printing a 2-D array using for loop");
        // for(int i=0;i<flats.length;i++){
        //     for(int j=0;j<flats[i].length;j++) {
        //         System.out.print(flats[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }

    }
}




