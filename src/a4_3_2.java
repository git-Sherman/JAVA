import java.util.Scanner;


public class a4_3_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		int oa=a;
		int ob=b;
		int x=0;
		
//		int gcd=1;
//		for(int i=1;i<=a&&i<=b;i++)
//		{
//			if(a%i==0&&b%i==0)
//			{
//				gcd=i;
//			}
//		}
		while(b!=0)
		{
			x++;
			int r=a%b;
			System.out.println(a+","+b+","+r);
			a=b;
			b=r;
			
		}
		System.out.println(oa+"和"+ob+"最大公约数为："+a);
		System.out.println("运算次数为："+x);
	}

}
