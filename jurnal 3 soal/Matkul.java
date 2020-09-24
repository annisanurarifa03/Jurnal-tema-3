import java.util.Scanner;
public class Matkul {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Masukkan nama mata kuliah:");
		String mata_kuliah = input.nextLine();
		System.out.println("Masukkan jumlah jam per minggu:");
		int jam = input.nextInt();
		System.out.println(" ");
		System.out.println("Aku suka kuliah " + mata_kuliah);
		System.out.println("Kuliah " + jam + " jam per minggu rasanya kurang. ");
		System.out.println("Tambahin dong jadi 12 jam per minggu :) ");
		
		
	}
}
