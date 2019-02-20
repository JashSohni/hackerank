import java.util.Scanner;

class classes{
public static void main(String args[]){
int i,k;
int num_cases=0;
Scanner sc = new Scanner(System.in);
num_cases=sc.nextInt();
int num_stu[]=new int[num_cases];
int num_min_stu[]=new int[num_cases];
int arrival_time[][]=new int[num_cases][1000];
for(i=0;i<num_cases;i++)
{
	num_stu[i]=sc.nextInt();
	num_min_stu[i]=sc.nextInt();
	for(k=0;k<num_stu[i];k++)
		arrival_time[i][k]=sc.nextInt();
}
for(i=0;i<num_cases;i++)
{
	int num_stu_on_time=0;
	int j;
	for(j=0;j<num_stu[i];j++)	
	{
		if(arrival_time[i][j]<=0)
			num_stu_on_time++;
	}
	if(num_stu_on_time>=num_min_stu[i])
		System.out.println("NO");
	else
		System.out.println("YES");
}
}
}