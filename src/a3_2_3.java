import java.util.Scanner;

/*
 * (#)a3_2_3.java 1.0 2015-11-27 2015-11-27 GMT+08:00
 */

/**
 * @author 路春辉
 * @version $1.0, 2015-11-27 2015-11-27 GMT+08:00
 * @since JDK5
 */
public class a3_2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		chushihua
		Scanner lin =new Scanner(System.in);
		int number=(int)(Math.random()*100+1);//[0,1)-->[0,100)-->[1,100]
		int count=0;
		int a=0;
		
		do{
			a=lin.nextInt();
			count+=1;
			if(a<number)
			{
			System.out.println("您输入的数字偏小");
			}
			else if(a>number)
			{
				System.out.println("您输入的数字偏大");
			}
		} while(a!=number);
			System.out.println("恭喜你猜对了，你猜了："+count+"次");
		

	}

}
