class array2
{
 public static void main(String x[])
{
 int n1,n2,high;
 
 n1=Integer.parseInt(x[0]);
 n2=Integer.parseInt(x[1]);
  
abc a=new abc();
high=a.display(n1,n2);//method call with para with return
System.out.println("Highest numbber is:"+high);
   
}
}
 class abc
{
 public int display(int a,int b)
{
 int h;
 if(a>b)
   h=a;
  else
   h=b;
 return h;
}
}