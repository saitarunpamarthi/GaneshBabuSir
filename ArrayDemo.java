/*	File Name : ArrayDemo.java
	Program to demostrate One dimensional array - Adding the elements of array */
class  ArrayDemo
{ 
	public static void main(String args[])
		{
			
			int array[] = {10,15,7,43,54};
			int i;
			int result =0;
			for(i=0;i<5;i++)
				System.out.println("The value at "+ i + " position is"+ array[i]);
			for(i=0;i<5;i++)
			{
				result = result + array[i];
			}

			System.out.println("The sum of all the values in the array is: " + result);

			
		}
}
