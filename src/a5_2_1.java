import java.util.Scanner;


public class a5_2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] data={3,5,6,3,7,8,4,9,5,7,6,9,1,4,5};
		int[] x1=new int[data.length];
		int x=in.nextInt();
		int sum=0;
		int loc=-1;
		boolean t=false;
		for(int i=0;i<data.length;i++)
		{
			if(x==data[i])
			{
				x1[i]=i;
				t=true;
				
			}
		}
		if(t)
		{
			System.out.println(x);
			for(int k:x1)
			{
				
				if(k!=0)
				{
					sum+=1;
//					System.out.println("在第"+i+"位置");
				}
			}
			System.out.println("共有"+sum+"个");
			
			
		}
		else
		{
			System.out.println(x+"不在数组里面");
		}
	}

}
