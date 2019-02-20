import java.util.Scanner;
class alice3{
public static void main(String args[]){
int m,n,l;  //m for scores and n for alice
Scanner sc = new Scanner(System.in);
m=sc.nextInt();
int i,j,k;
int scores[] = new int[m];
int scores2[] = new int[m];
for(i=0;i<m;i++)
{
	scores[i]=sc.nextInt();
}
l=0;
scores2[0]=scores[0];
for(i=1;i<m;i++) // for finding absolute positions 
{
	k=scores[i];
	if(scores2[l]!=k)
	{
		l++;
		scores2[l]=k;
	}
}
n=sc.nextInt();
int alice[] = new int[n];
for(i=0;i<n;i++)
{
	alice[i]=sc.nextInt();
}
int rank[]=new int[n];
for(i=0;i<n;i++)
{
	for(j=l;j>=0;j--)
	{
		if(alice[i]<scores2[j] && j>0)
		{
			rank[i]=j+2;
			l=j;
			break;
		}
		if(alice[i]==scores2[j] && j>0)
		{
			rank[i]=j+1;
			l=j;
			break;
		}
		if(j==0 && alice[i]<scores2[j])
			rank[i]=2;
		if(j<1 && alice[i]>=scores2[j])
			rank[i]=1;
	}
}
for(i=0;i<n;i++)
{
	System.out.println(rank[i]);
}
}
}