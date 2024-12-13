public class Main {
    public static void main(String[] args) {
        Tessitrice t1 = new Tessitrice("1");
        Tessitrice t2 = new Tessitrice("2");
        Tessitrice t3 = new Tessitrice("3");

        // Avvia i thread delle tessitrici
        t1.start();
        t2.start();
        t3.start();

        // Il programma continuerà a eseguire finché non lo fermerai manualmente
        // Usa "Terminate" in Eclipse o imposta una logica per fermare i thread dopo un certo tempo
    }
}
