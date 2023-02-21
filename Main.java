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



  public static double[][] withWeightedAverage(double[][] a, double[] weights){
    int rows = a.length;
    int columns = a[0].length;
    int retRows = a.length+1;
    int retColumns = a[0].length+1;
    double [][] retVal = new double[retRows][retColumns];
    for (int r = 0; r<rows;r++){
      for (int c = 0; c<columns;c++){
        retVal[r][c] = a[r][c];
      }
    }
     
    for(int r = 0;r<rows;r++){
      double weightedAvg = 0;
      for(int c = 0;c<columns;c++){
        weightedAvg += (retVal[r][c]*weights[c]);
      }
      retVal[r][columns] = weightedAvg;
    }

    for (int c = 0; c<retColumns;c++){
      double sum = 0;
      for (int r = 0; r<rows;r++){
        sum+= retVal[r][c];
      }
      retVal[rows][c] = sum/rows;
    }
    return retVal;
  }
  



  public static void main(String[] args) {
    int [][] bruh = new int[][] {{2,3,4,5},{4,5,6,7},{2,3,5,6},{2,3,4,1}};
    System.out.println(Arrays.deepToString(CopySquare(bruh)));
    int [][] bruh2 = new int[][] {{2,3,4,5},{4,5,6,7}};
    System.out.println(Arrays.deepToString(CopyRect(bruh2)));
    int [][] bruh3 = new int[][] {{2,3,5},{4,5,6,7},{2,3,5,6},{2,3,4,1,5}};
    System.out.println(Arrays.deepToString(CopyRugged(bruh3)));
    System.out.println(Arrays.deepToString(CopyRugged(bruh)));
    printTranspose(bruh);
    double[][] bruh4 = new double[][] {
      {99, 85, 98},
      {98, 57, 79},
      {92, 77, 74},
      {94, 62, 81},
      {99, 94, 92},
      {80, 76.5, 67},
      {76, 58.5, 90.5},
      {92, 66, 91},
      {77, 70.5, 66.5},
      {89, 89.5, 81}};
    double[] bruh5 = new double[] {0.25,0.25,0.5};
    double[][] bruh6 = (withWeightedAverage(bruh4,bruh5));
    for (double[] row:bruh6){
      System.out.println(Arrays.toString(row));
    }
    
  }
}