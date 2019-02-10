#include <stdio.h>
#include<string.h>
int main()
{
    int n,i,j=0,d=1,k=0,ans;
    scanf("%d",&n);
    while(j==0)
    {
    d=d*2;
    if(d==n)
    {j=2;}
    if(d>n)
    {
    	j=1;
    }
    k++;
    }
    if(j==1)
    {
    d=d/2;
    ans=n-d;
    }
       if(j==1)
    {
    ans=n-d;
    }
  printf("%d",ans);
 return(0);   
}
