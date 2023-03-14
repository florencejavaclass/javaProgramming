class MyInfo{

public static void main(String[] args)
  {
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter your name");
String a=scn.next();
System.out.println("Enter your age");
int s=scn.nextInt();
System.out.println("Enter your Gender");
char c=scn.next().charAt(0);
System.out.println("My name is "+a+", age is "+s+" and Gender is "+c);
}
}