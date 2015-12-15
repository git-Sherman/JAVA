import java.util.Scanner;


public class a5_2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		final int size=3;
		int[][] boord=new int[size][size];
		boolean gotresult=false;
		int numofx=0;
		int numofo=0;
		
		//读入矩阵
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<boord[i].length;j++)
			{
				boord[i][j]=in.nextInt();
			}
		}
		out:
		do
		{
		//检查行
				
			for(int i=0;i<size;i++)
			{
				 numofx=0;
				 numofo=0;
				for(int j=0;j<size;j++)
				{
					if(boord[i][j]==1)
					{
						numofx++;
					}
					else
					{
						numofo++;
					}
				}
				if(numofx==3||numofo==3)
				{
						gotresult=true;
						break out;
				}
						
				
			}
			//检查列
			for(int i=0;i<size;i++)
			{
				 numofx=0;
				 numofo=0;
				for(int j=0;j<size;j++)
				{
					if(boord[j][i]==1)
					{
						numofx++;
						
					}
					else
					{
						numofo++;
					}
				}
				if(numofx==3||numofo==3)
				{
						gotresult=true;
						break out;
				}
			}
			numofx=0;
			numofo=0;
			
			//检查正对角
			for(int i=0;i<size;i++)
			{
				
				if(boord[i][i]==1)
				{
					numofx++;
				}
				else
				{
					numofo++;
				}
				if(numofx==3||numofo==3)
				{
						gotresult=true;
						break out;
				}
			}
			numofx=0;
			numofo=0;
			//检查反对角
			for(int i=0;i<size;i++)
			{
				
				if(boord[i][size-1-i]==1)
				{
					numofx++;
				}
				else
				{
					numofo++;
				}
				if(numofx==3||numofo==3)
				{
						gotresult=true;
						break out;
				}
			}
		}while(false);
			//输出矩阵
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					System.out.print(boord[i][j]);
				}
				System.out.println();
			}
			//判断获胜
			if(gotresult)
			{
				if(numofx==3)
				{
					System.out.println("X方获胜");
				}
				else
				{
					System.out.println("O方获胜");
				}
			}
			else
			{
				System.out.println("无人获胜");
			}
		
	}

}
