import java.util.Scanner;

/*
 * (#)a3_2_4.java 1.0 2015-11-27 2015-11-27 GMT+08:00
 */

/**
 * @author 路春辉的的
 * @version $1.0, 2015-11-27 2015-11-27 GMT+08:00
 * @since JDK5
 */
public class a3_2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int digit;
//		int i = 1;
//		do {
//		    i = i+5;
//		} while (i<17);
		while(true)
		{
			x=0;
			Scanner in =new Scanner(System.in);
			System.out.println("请输入一个数:");
			int number=in.nextInt();
			do{
			digit=number%10;
			x=x*10+digit;
//			System.out.print(digit);
			number/=10;
			}while(number>0);
			System.out.println();
			System.out.println("倒叙后的数字为："+x);
		}
	}

}
