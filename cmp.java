import java.util.Scanner;
class cmp
{
  public static void main(String[] args)
  {
    cn a=new cn();
    a.input();
    a.display();
  }
}

class cn
{
  public
  int R,I;
  Scanner s=new Scanner(System.in);
  public void input()
  {
    System.out.println("enter R");
  R=s.nextInt();
  System.out.println("enter I");
I=s.nextInt();
  }
  public void display()
  {
    System.out.println("out");
    System.out.println(R+"+"+I+"i");
  }
}