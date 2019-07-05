/*	File Name : ArrayDemo2.java
	This program produces 10 Random numbers
import java.util.*;

class ArrayDemo2 {

  public static void main (String args[]) {
  
    int[] ndigits = new int[10];
    double x;
    int n;
    
    Random myRandom = new Random();
    for (int i = 0; i < 10; i++) {
 	    ndigits[i] = 0;
    }

    for (long i=0; i < 100000; i++) {
      x = myRandom.nextDouble() * 10.0;
      n = (int) x;
      ndigits[n]++;
    }
    
    for (int i = 0; i <= 9; i++) {
      System.out.println(i+": " + ndigits[i]);
    }
  }
  
}
