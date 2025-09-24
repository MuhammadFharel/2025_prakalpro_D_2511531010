package pekan3;

import java.util.Scanner;

public class OperatorRelasional {
	public static void main(String[] args) {
		int A1;
		int A2;
		boolean hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		hasil = A1 > A2;// apakah lebih besar dari A2?
		System.out.println("A1 > A2 = " +hasil);
		hasil = A1 < A2;// apakah lebih kecil dari A2?
		System.out.println("A1 < A2 = " +hasil);
		hasil = A1 >= A2;// apakah lebih besar samadengan dari A2?
		System.out.println("A1 >= A2 = " +hasil);
		hasil = A1 <= A2;// apakah lebih kecil samadengan dari A2?
		System.out.println("A1 <= A2 = " +hasil);
		hasil = A1 == A2;// apakah samadengan dari A2?
		System.out.println("A1 == A2 = " +hasil);
		hasil = A1 != A2;// apakah tidak samadengan dari A2?
		System.out.println("A1 != A2 = " +hasil);

	}

}
