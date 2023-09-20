package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How long do you want your array to be?");
		int n = in.nextInt();
		boolean[] array = new boolean[n];
		for (int i=0; i < n; i++) {
			array[i]=true;
		}
		for (int i=0; i < n; i++) {
			for (int p=2; p<n; p++) {
				for (int j=2; j < n; j++) {	
					if (i == p * j) {
						array[i]=false;
				}
				}
			}
		}

	
	
	for (int k = 0; k < n; k++) {
		if ( array[k] == true) {
			System.out.print(k+",");

		}
	}
}
}
