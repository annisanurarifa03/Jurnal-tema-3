import java.util.Scanner ;
public class Nilaiakhir {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double NA;
	    
		System.out.println("Masukkan nilai praktikum: ");
		int P = input.nextInt();
		System.out.println("Masukkan nilai asesmen 1: ");
		int A = input.nextInt();
		System.out.println("Masukkan nilai asesmen 2: ");
		int B = input.nextInt();
		NA = (0.25*P) + (0.35*A) + (0.40*B) ;
		
		System.out.printf("Nilai akhir: %.2f" , NA);
		
		
	}
}
