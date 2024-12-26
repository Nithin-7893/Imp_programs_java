class Breaked
{
public static void main(String args[])
{
int i,j;
for (i=1;i<=3;i++)
{
for(j=1;j<=3;j++)
{
if(j==2)
{
break outer;
}
System.out.println("i="+i+", j="+j);
}
}
System.out.println("i="+i+", j="+j);
}
}