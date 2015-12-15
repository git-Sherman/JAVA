import java.util.Scanner;


public class a2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//初始化
		Scanner lin=new Scanner(System.in);
		int balance=0;
//		读入投币金额
//		double a=1.0;
//		double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		System.out.println(a==b);
//		System.out.println("a和b的结果是："+(Math.abs(a-b)<1e-6));
		while(true)
		{
		System.out.println("请投币");
		int amount=lin.nextInt();
		balance=balance+amount;
//		System.out.println(amount);
//		System.out.println(amount>=10);
			if(balance>=10)
			{
	        //打印车票
			System.out.println("*********");
			System.out.println("*JAVA城际铁路专线*");
			System.out.println("*无指定座位票*");
			System.out.println("*票价：10元*");
			System.out.println("*********");
			//打印车票并找零
			System.out.println("找零"+(balance-10));
			balance=0;
			}
			else
			{
				
			}
		}
	} 

}
