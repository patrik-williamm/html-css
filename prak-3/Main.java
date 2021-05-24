
//program kasir sederhana
//patrik_williamm

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		//user input
		System.out.print("masukkan jumlah Barang 	: ");
		int brg = inp.nextInt();

		int pembelian = 12000 * brg;
		if (pembelian >= 100000) {
			System.out.println("Anda mendapatkan diskon 20%");
			int total = pembelian - 20/100; 
			System.out.println("total belanja anda : "+total);
		}

		System.out.printlln("terimah kasih telah berbelanja di tempat kami!");
	}
}