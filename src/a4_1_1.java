import java.util.Scanner;

/*
 * (#)a4_1_1.java 1.0 2015-11-27 2015-11-27 GMT+08:00
 */

/**
 * @author 路春辉
 * @version $1.0, 2015-11-27 2015-11-27 GMT+08:00
 * @since JDK5
 */
public class a4_1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n =in.nextInt();
//		int i=1;
		int factor=1;
//		while(i<=n)
//		{
//			factor=factor*i;
//			i+=1;
//			
//		}
		for(int i=1;i<=n;++i)
		{
//			factor=factor*i;
			factor*=i;
		}
		System.out.println(factor);
		

	}

}
