/*	File Name : ScopeDemo.java
	Simple Program to explain the  decleration of avariables and scope of variables */
class ScopeDemo
{ 
	public static void main(String args[])
		{
			int int_var =10; 
					
			{
				double double_var = 15.50;
				System.out.println("Inside the Block,Integer value :" + int_var);
				System.out.println("Inside the Block,Double Value :" + double_var);
			}
			System.out.println("Integer value :" + int_var); 
			//System.out.println("Double Value :" + double_var);// Cannot Access the variable doublet_var

			
		}
}
