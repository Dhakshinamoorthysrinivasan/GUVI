#include <stdio.h>
int main(void) {
	// your code goes here
int n,i,m;
char c[20];
scanf("%s",&c);
scanf("%d",&m);
for(i=m;c[i]!='\0';i++)
{
printf("%c",c[i]);	
}
	return 0;
}
