import java.util.Scanner;
class leap
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  if(a%4==0)
  {
   System.out.println("leap year");
  }
   else
   {
    System.out.println("not aleap year");
   }
  }
 } 
