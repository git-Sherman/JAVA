import java.util.Scanner;


public class a7_1_1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x=0,y=0;
		x=in.nextInt();
		y=in.nextInt();
		sum(x,y);
		System.out.println(x+"到"+y+"的和是"+sum(x,y));
		

	}
	//创建一个sum函数
		public static int sum(int x,int y)
		{
			int sum=0;
			for(int i=x;i<=y;i++)
			{
				 sum+=i;
			}
			return sum;
		}

}
