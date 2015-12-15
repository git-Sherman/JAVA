import java.util.Scanner;


public class a5_1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x;
		int[] number=new int[10];
		x=in.nextInt();
		while(x!=-1)
		{
			if(x>=0&&x<=9)
			{
				number[x]++;
			}
			x=in.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"的个数为："+number[i]);
		}
	}

}
