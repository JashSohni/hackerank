import java.util.Scanner;

class Time_travel{
public static void main(String args[]){
int year;
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if(year>1918)
{
	if(year%400==0||(year%4==0&&year%100!=0))
		System.out.println("12.09."+year);
	else
		System.out.println("13.09."+year);
}
else if(year==1918)
{
	System.out.print("26.09."+year);
}
else{
	if(year%4==0)
		System.out.println("12.09."+year);
	else
		System.out.println("13.09."+year);
}
}
}