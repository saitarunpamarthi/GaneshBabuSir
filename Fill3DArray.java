class Fill3DArray {

  public static void main (String args[]) {
  
    int[][][] M;
    M = new int[4][5][3];
  
    for (int row=0; row < 4; row++) {
      for (int col=0; col < 5; col++) {
        for (int ver=0; ver < 3; ver++) {
          M[row][col][ver] = row+col+ver;
        }
      }
    }
    

    for (int row=0; row < 4; row++) {
      for (int col=0; col < 5; col++) {
        for (int ver=0; ver < 3; ver++) {
          System.out.print(M[row][col][ver]);
	System.out.println();
        }
	System.out.println();	
      }
    }
  }
  
}
