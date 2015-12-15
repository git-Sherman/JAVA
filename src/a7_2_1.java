
public class a7_2_1 {

	/**
	 * @param args
	 */
	public static void f()
	{
		System.out.println("hello");
	}
			
	//创建swap函数
	public static void swap(int i,int j)
	{
		int t;
		t=i;
		i=j;
		j=t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		swap(a,b);
		f();
		System.out.println("a="+a+" b="+b);

	}

}
