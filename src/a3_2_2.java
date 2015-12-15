import java.util.Scanner;

/*
 * (#)a3_2_2.java 1.0 2015-11-27 2015-11-27 GMT+08:00
 */

/**
 * @author 林升淼
 * @version $1.0, 2015-11-27 2015-11-27 GMT+08:00
 * @since JDK5
 */

public class a3_2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		chushihua
		Scanner in =new Scanner(System.in);
		int number;
		int sum=0;
		
		int count=0;
		count=in.nextInt();
		if(count>0)
		{
			int numbers[] =new int[count];
			for(int i=0;i<numbers.length;i++)
			{
			
			numbers[i]=in.nextInt();
		
			sum+=numbers[i];	
					
			}
		
			
				double aver=(double)sum/numbers.length;
				for(int i=0;i<numbers.length;i++)
				{
					if(numbers[i]>aver)
					{
					System.out.println(numbers[i]);
					}
				}
		System.out.println("平均数为=："+(double)sum/numbers.length);
			
		}
	}

}
