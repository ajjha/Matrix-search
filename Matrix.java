import java.util.*;

public class Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] mat = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                mat[i][j] = sc.nextInt();
            }

        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the number u want to search:");
        int x = sc.nextInt();
        boolean num = false;
        int a =0;
        int b=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(mat[i][j]==x){
                    num = true;
                     a = i+1;
                     b = j+1;
                    break;
                }
            }
        }
        if(num){
            System.out.println("Number is present at index ["+a+","+b+"]");
        }
        else{
            System.out.println("Number is not present in matrix");
        }
        sc.close();

    }
    
}
