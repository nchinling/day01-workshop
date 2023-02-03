package workshop1;
import java.io.Console;
import java.util.*;


public class Matrix {
    public static void main(String[] args){

        //Create console object
        Console cons = System.console();

        //Obtain number of rows and columns for first matrix
        String getRows = cons.readLine("Enter the number of equations (rows):\n"); 
        String getColumns = cons.readLine("Enter the number of terms (columns):\n"); 
        
        //Obtain the weights and remove spaces
        String getWeights = cons.readLine("Enter the weights:\n");
        getWeights = getWeights.replaceAll("\\s","");

        //Convert String to integers
        int rows = Integer.parseInt(getRows);
        int columns = Integer.parseInt(getColumns);
        int weightsC = Integer.parseInt(getWeights);
        int weightsR = 4;

        int[][] matrix = new int[rows][columns];
        int[][] weightMatrix = new int[weightsR][1];

        for (int i = 0; i<4; i++){
        //Display elements of the weights;
        System.out.printf("The elements of the weights are: %s\n", getWeights.substring(i, i+1));
        int weight = Integer.parseInt(getWeights.substring(i, i+1));
        }
        
        for (int i = 0; i<rows; i++){ 
           
            //Display elements of the weights;
            System.out.printf("The elements of the weights are: %s\n", getWeights.substring(i, i+1));
            int weight = Integer.parseInt(getWeights.substring(i, i+1));

            String rowElement = cons.readLine("Enter the elements for row %d:\n", i+1 ); 
            rowElement = rowElement.replaceAll("\\s","");
            int intRowElement = Integer.parseInt(rowElement);
            System.out.printf("The elements are:%s \n", rowElement);
            System.out.printf("The elements in integer format are:%d \n", intRowElement);
        
            

        }

    }

}



