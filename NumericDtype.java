import java.util.*;
class Numeric
{
public static void main(String args[])
{
int a,b,c;
long d;
double e;
Scanner s=new Scanner(System.in);
System.out.println("enter values of numeric data types:");
a=s.nextByte();
b=s.nextShort();
c=s.nextInt();
d=s.nextLong();
e=s.nextFloat();
System.out.printf(" ****PRINTING VALUES****\na=%d\nb=%d\nc=%d\nd=%d\ne=%f",a,b,c,d,e);
}
}