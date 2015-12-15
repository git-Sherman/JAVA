import java.util.Scanner;


public class a4_2_1 {
	//创建一个判断素数的函数，如果number为素数，则函数返回true，反之
	public static boolean isprime(int number)
	{
		boolean a=true;
		for(int i=2;i<number;i+=1)
		{
			
			if(number%i==0)
			{
				a=false;
				break;							
			}
		}return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你要查询的素数个数");
		int lin=in.nextInt();
//		System.out.println("0到"+n+"里面有：");
//		for(int number=2;number<n;number+=1)
		int n=0;
		int number=2;
		do
		{
					//判断number是否为素数
					
					if(isprime(number))
					{
							System.out.print(" "+number);//输入素数
							n+=1;
					}
					//判断素数结束
					
			number+=1;
			
		}while(n<lin);
		System.out.println(" ");
		System.out.println("n="+n);
//		System.out.println("是素数");
	}

}
