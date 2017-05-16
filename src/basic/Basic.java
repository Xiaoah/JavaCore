package basic;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		//输入
/*		Scanner in = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = in.nextLine();
		System.out.println("how old are you?");
		int age = in.nextInt();
		System.out.println("hello, "+name+",your age is "+age);
*/
		//大数值
/*		Scanner in = new Scanner(System.in);
		System.out.println("how many numbers do you need to draw? ");
		int k = in.nextInt();
		System.out.println("what is the hihgest number you can draw?");
		int n = in.nextInt();
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for(int i =1;i<=k;i++){
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
		}
		System.out.println(lotteryOdds);
*/
		//for each循环
/*		int[] a = {1,2,4,5};
		for (int i : a) {
			System.out.println(i);
		}
		//copy数组，第二个参数指定新数组的长度
		int[] b = Arrays.copyOf(a, 2*a.length);
		for (int i : b) {
			System.out.println(i);
		}
*/
		//随机抽彩
/*		Scanner in = new Scanner(System.in);
		System.out.println("how many numbers do you want to draw?");
		int k = in.nextInt();
		System.out.println("what is the highest number you can draw?");
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		for(int i =0;i<numbers.length;i++){
			numbers[i] = i+1;
		}
		int[] result = new int[k];
		for(int i =0;i<result.length;i++){
			int r = (int)(Math.random()*n);
			result[i] = numbers[r];
			numbers[r] = numbers[n-1];
			n--;
		}
		Arrays.sort(result);
		System.out.println("the result:");
		for (int i : result) {
			System.out.println(i);
		}
*/

	}

}
