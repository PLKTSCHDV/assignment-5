import java.util.Scanner;
class area 
{
public static void main(String args[]) 
{       
Scanner s= new Scanner(System.in);      
System.out.println("Enter L:");
int L= s.nextInt();
System.out.println("Enter B:");
int B= s.nextInt();    
int  area=L*B;
System.out.println("Area " + area);      
}
}
