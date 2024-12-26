class Reverse
{
public static void main(String args[])
{
int r,rev=0,num=8765;
while(num>0)
{
r=num%10;
rev=(rev*10)+r;
num=num/10;
}
System.out.println("reverse of a given number is  "+rev);
}
}