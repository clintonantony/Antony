import java.util.Scanner;
class alpha
{
 public static void main(String[] args)
 {
  char a[]=['a','e','i','o','u','y'];
  Scanner sc=new Scanner(System.in);
  char b=sc.next();
  if(a.contains(b))
        System.out.println("it is vowel");
     else{
        System.out.println("it is consonant");
     }
 }
} 
       
    
