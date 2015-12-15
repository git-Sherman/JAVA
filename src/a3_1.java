import java.util.Scanner;

/*
 * (#)a3_1.java 1.0 2015-11-26 2015-11-26 GMT+08:00
 */

/**
 * @author 路春辉
 * @version $1.0, 2015-11-26 2015-11-26 GMT+08:00
 * @since JDK5
 */
public class a3_1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化
		Scanner in=new Scanner(System.in);
		int count=0;
		while(true)
		{
			count=0;
		System.out.println("请输入你要的数字：");
		int number=in.nextInt();
									
		do
		{
		number=number/10;
		count=count+1;
//		System.out.println("number="+number+";count="+count);
		}
		while(number>0);
		System.out.println("您输入的数字位数为："+count);
		}
		
	}

}
