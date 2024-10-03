import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {
		// Stampare i numeri interi da 0 a 10(10 escluso)
		int pippo = 10;
		for (int i = 0; i < 10; i++) {
			pippo = pippo + 1;

			System.out.println(i);
		}

		System.out.println("\ntabellina del 7");

		for (int a = 0; a <= 10; a++) {
			int r = 7 * a;
			System.out.println(r);
		}

		int n = 7;
		if (n % 2 == 0) {
			System.out.println(n + "è pari");
		} else {
			System.out.println(n + " è dispari");
		}
		//come leggere da tastiera
		//Scanner leggi = new Scanner(System.in);
		
		//Per leggere un intero
		//int n1= leggi.nextInt();
		
		//per leggere una stringa
		//String s1 = leggi.nextLine();
		
		//System.out.println(leggi);
		
		 Scanner num = new Scanner(System.in);
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Inserisci il numero " + (i + 1) + ": ");
	            int numero = num.nextInt();
	            
	            if (numero > 10) {
	                System.out.println(numero + " è maggiore di 10.");
	            } else if (numero < 10) {
	                System.out.println(numero + " è minore di 10.");
	            } else {
	                System.out.println(numero + " è uguale a 10.");
	            }
	        } 
	}
}