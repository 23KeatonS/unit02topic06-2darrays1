import java.util.Arrays;

public class Main {
  
  public static int [][] CopySquare(int[][] a){
    int rowLength = a.length;
    int [][] retVal = new int[rowLength][rowLength];
    for (int r = 0; r<rowLength;r++){
      for (int c = 0; c<rowLength;c++){
        retVal[r][c] = a[r][c];
      }
    }
    return retVal;

  }

  public static int [][] CopyRect(int[][] a){
    int rowLength = a.length;
    int columns = a[0].length;
    int [][] retVal = new int[rowLength][columns];
    for (int r = 0; r<rowLength;r++){
      for (int c = 0; c<columns;c++){
        retVal[r][c] = a[r][c];
      }
    }
    return retVal;

  }  


  public static int [][] CopyRugged(int[][] a){
    int rowLength = a.length;
    int[][] retVal = new int[rowLength][];
    for (int r = 0; r<rowLength;r++){
      retVal[r] = a[r];
    }
    return retVal;

  }  



  public static void printTranspose(int[][] a){
    int rows = a.length;
    int columns = a[0].length;
    for (int c = 0;c<columns; c++){
      for (int r = 0; r<rows;r++){
        System.out.print(a[r][c]);
        System.out.print(" ");
      }
      System.out.println("");
    }
  }


  public static void main(String[] args) {
    int [][] bruh = new int[][] {{2,3,4,5},{4,5,6,7},{2,3,5,6},{2,3,4,1}};
    System.out.println(Arrays.deepToString(CopySquare(bruh)));
    int [][] bruh2 = new int[][] {{2,3,4,5},{4,5,6,7}};
    System.out.println(Arrays.deepToString(CopyRect(bruh2)));
    int [][] bruh3 = new int[][] {{2,3,5},{4,5,6,7},{2,3,5,6},{2,3,4,1,5}};
    System.out.println(Arrays.deepToString(CopyRugged(bruh3)));
    System.out.println(Arrays.deepToString(CopyRugged(bruh)));
    printTranspose(bruh2);
    
  }
}