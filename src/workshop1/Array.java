package workshop1;

public class Array {

    public static void main(String[] args){


        String[][] names = new String[2][3];
        names[0][0] = "a";
        names[0][1] = "b";
        names[0][2] = "c";
        names[1][0] = "d";
        names[1][1] = "e";
        names[1][2] = "f";


        //Example of the famous double loop for arrays of arrays. 
        int i = 0;
        //outer box
        while (i < names.length){
            int j = 0;
            while (j < names[i].length){
            System.out.printf("[i=%d][j=%d] %s\n", i, j, names[i][j]);
            j +=1;
        }
        i +=1;

        }
    }

    
}


        // String[] names = new String[3];
        // names[0] ="apple"; 
        // names[1] ="orange"; 
        // names[2] ="banana"; 

        // System.out.printf("Array size: %d\n", names.length);

        // int i =0 ;

        // while (i<names.length){
        //     System.out.printf("[%d]: %s\n", i+1, names[i]);
        //     i +=1;
        // }
