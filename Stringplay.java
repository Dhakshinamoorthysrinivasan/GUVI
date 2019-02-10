/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stringplay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			String[] str = new String[10000];
			String strnew = "";
		String[] substr = new String[10000];
		int n,k=1,l=1;
		BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt( reader.readLine());
		for(int i=0;i<n;i++)
		{
			str[i]=reader.readLine();
		}
			for(int i=0;i<n;i++)
		{
		//	System.out.println(str[i]);
		}
		while(k!=0)
		{
			for(int i=0;i<n;i++)
		{
			substr[i]=str[i].substring(0, l);
			
		}
		
	//int z=n-1;
		
			for(int i=0;i<n-1;i++)
		{
			if(substr[i].equals(substr[i+1]))
			{
				k=1;
			}
			else{
				k=0;
				int d=substr[1].length();
				int e=-1;
				//substr[1].replace(e, d, " ");
				strnew = substr[1].substring(0, substr[1].length()-1);
			}
			//System.out.println(k);
		}
		
	
		l++;	
		}
		
			for(int i=0;i<n;i++)
		{
			//System.out.println(substr[i]);
			//System.out.println(k);
		}
	
				System.out.println(strnew);
		
	}
}
