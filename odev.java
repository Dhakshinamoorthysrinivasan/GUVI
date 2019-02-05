import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a;
		BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
		 
		 a=Integer.parseInt( reader.readLine());
          if(a%2==0)
          {
          	System.out.println("Even");
          }
           if(a%2==1)
          {
          	System.out.println("Odd");
          }
           if(a<0)
          {
          	System.out.println("invalid");
          }
		
	}
}
