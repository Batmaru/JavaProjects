import java.util.Scanner;

public class Cicli {

    public static void main(String[] args) {
        int pippo = 10;
        // Stampare i numeri interi da 0 a 10 (10 escluso)
        for (int i = 0; i < 10; i++) {
            pippo = pippo + i;
            System.out.println(i);
        }

        // Stampare la tabellina del 7
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 7);
        }

        for (int i = 7; i <= 70; i += 7) {
            System.out.println(i);
        }

        int n = 7;
        for (int i = 0; i < 10; i++) {
            System.out.println(n);
            n += 7;
        }

        for (int i = 0; i < 70;) {
            for (int j = 0; j < 7; j++) {
                i = i + 1;
            }
            System.out.println(i);
        }

        /*
         * Scrivere un codice basato sull'operatore if che determina e stampa se un
         * numero è pari o dispari
         */
        int n1 = 7;
        if (n1 % 2 == 0) {
            System.out.println(n1 + " è pari");
        } else {
            System.out.println(n1 + " è dispari");
        }

        // Come leggere da tastiera
        Scanner leggi = new Scanner(System.in);

        // Per leggere un numero intero
        System.out.print("Inserire un numero intero: ");
        int n2 = leggi.nextInt();

        // Per leggere una linea di testo
        leggi.nextLine();
        System.out.print("Inserire una linea di testo: ");
        String s1 = leggi.nextLine();

        // Leggere 10 numeri da tastiera e verificare se sono maggiori o minori di 10
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Inserire un numero: ");
            int num = scan.nextInt();

            if (num > 10) {
                System.out.println("Il numero " + num + " è maggiore di 10");
            } else if (num < 10) {
                System.out.println("Il numero " + num + " è minore di 10");
            } else {
                System.out.println("Il numero " + num + " è uguale a 10");
            }
        }
    }
}
