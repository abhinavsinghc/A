class A
{
    int i = 300;
}
 
class B extends A
{
    int i = 300;

 

   public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
    }
}
