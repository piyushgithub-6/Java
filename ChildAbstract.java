 abstract class ParentAbstract
{
	public abstract void first(int i,int j);
}
class ChildAbstract extends ParentAbstract
{	
	public void first(int i,int j)
		{
		i=10;
		j=20;		
		}
	public static void main(String args[])
		{
			ChildAbstract c=new ChildAbstract();
			System.out.println("Value of i and j:"+c.first(1,2));
		}
}

	