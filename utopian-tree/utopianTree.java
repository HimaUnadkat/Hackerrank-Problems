import java.io.*;
import java.util.*;

public class UthopianTree {

	public static void main(String[] args) {
		int testCases = 0;
		int spring = 2;
		int summer = 1;
		int defaultHeight = 1;
		int result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter testCases:");
		testCases = sc.nextInt();
		int[] N = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			System.out.println("Enter N:");
			N[i] = sc.nextInt();
		}
		for (int i = 0; i < testCases; i++) {
			if (N[i] == 0) {
				System.out.println(defaultHeight);
			} else {
				result = 1;
				do {
				
					/*if (N[i] % 2 == 0) {
						result = result * spring;
						N[i]--;
					} 
					else {
						result = result + summer;
						N[i]--;
					}
					*/
					
					result = result * spring;
					N[i]--;
					if(N[i]>=1){
					result = result + summer;
					N[i]--;
					}
				} while (N[i] > 0);
				System.out.println(result);
			}

		}

	}
}