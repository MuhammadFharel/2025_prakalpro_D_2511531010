package pekan7_2511531010;

import java.util.Scanner;

public class PanggilMahasiswa2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("NIM : ");
		String x= input.nextLine();
		System.out.print("Nama : ");
		String y= input.nextLine();
		Mahasiswa_2511531010 a= new Mahasiswa_2511531010();
		a.setNim2(x);
		a.setNama(y);
		if(x.startsWith("25")) {
			System.out.println(a.getNama()+ " Anda Angkatan 2025");
		}
		if(a.getNim2().contains("1153")) {
			System.out.println(y+ " Anda Mahasiswa Informatika");
	}
		a.Cetak2 ();
		input.close();
	}
}
