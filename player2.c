#include <stdio.h>
int main(void) {
	// your code goes here
int n,i,m=1;
scanf("%d",&n);
if(n<=1)
{
	m=1;
}
else{
for(i=1;i<=n;i++)
{
	m=m*i;
}
}
printf("%d",m);
	return 0;
}
