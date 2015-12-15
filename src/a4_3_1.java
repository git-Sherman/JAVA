import java.util.Scanner;

/*
 * (#)a4_2_3.java 1.0 2015-11-29 2015-11-29 GMT+08:00
 */

/**
 * @author 路春辉
 * @version $1.0, 2015-11-29 2015-11-29 GMT+08:00
 * @since JDK5
 */
public class a4_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double fn=0;
		int x=1;
		for(int i=1;i<=n;i++,x=-x)
		{
	
			fn=fn+x*(1.0/i);
			
		}
		System.out.println(fn);
		System.out.printf("%.2f",fn);//"%.2f"代表对fn保留两位小数
	}

}
