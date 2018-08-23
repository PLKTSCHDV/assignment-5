import java.util.Scanner;
class LN
{
  public static void main(String args[])
  {
    int i,L1,L2;
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter the elements");
    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    L1=arr[0];
    for(i=0;i<arr.length;i++)
    {
      if(arr[i]>L1)
      {
        L1=arr[i];
      }
    }
    L2=arr[0];
    for(i=1;i<arr.length;i++)
    {
      if(arr[i]>L2 && arr[i] < L1)
      {
        L2=arr[i];
      }
    }
    System.out.println("sec largest no in array " +L2);
  }
}
