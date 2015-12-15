import java.util.Scanner;


public class a6_1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		Character c='a';
		Character k='b';
		int[] a={1,2,3};
		System.out.println(a.length);
		String s="123456hello";
//		System.out.println(s.charAt(0));
		System.out.println(s.substring(6));
		s="zzz";
		System.out.println(s);
		k=c;
		System.out.println("c="+c);
		System.out.println("k="+k);
		System.out.println(s.compareTo("aaabb"));
//		char c='z';
////		c=(char)(c+32);
//		System.out.println((int)c);
//		int s=98;
//		char l=(char)s;
//		System.out.println(c+32);
////		int i='a'-'A';
//		System.out.println(l);

	}

}
