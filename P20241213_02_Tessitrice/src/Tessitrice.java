
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

class Tessitrice extends Thread {
    // Lista dei tessuti che non è più "final" e non è "static final"
    private static LinkedList<String> TESSUTI = new LinkedList<>();
    private static Random RANDOM = new Random();

    private String nomeTessitrice;

    static {
        // Aggiungiamo i vari tipi di tessuto nella LinkedList
        TESSUTI.add("Cotone");
        TESSUTI.add("Lino");
        TESSUTI.add("Lana");
        TESSUTI.add("Seta");
        TESSUTI.add("Poliestere");
        TESSUTI.add("Nylon");
    }

    public Tessitrice(String nomeTessitrice) {
        this.nomeTessitrice = nomeTessitrice;
    }

    @Override
    public void run() {
        // Percorso del file Scrivania/provajson
        String directory = System.getProperty("user.home") + "/Scrivania/provajson";

        // Crea la directory se non esiste
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs(); // Crea la directory se non esiste
        }

        String filePath = directory + "/tessitrice_" + nomeTessitrice + ".txt";

        while (true) {
            try {
                // Genera un prodotto casuale
                String tipoTessuto = TESSUTI.get(RANDOM.nextInt(TESSUTI.size()));
                int quantita = RANDOM.nextInt(41) + 20; // Valori tra 20 e 60
                Prodotto prodotto = new Prodotto(nomeTessitrice, tipoTessuto, quantita);

                // Converte in JSON
                String json = prodotto.SerializeJson();

                // Scrive nel file
                try (FileWriter fileWriter = new FileWriter(filePath, true)) {
                    fileWriter.write(json + "\n");
                    System.out.println("Scrittura completata nel file: " + filePath);
                }

                // Aspetta 10 secondi
                Thread.sleep(10_000);

            } catch (IOException e) {
                System.err.println("Errore nella scrittura del file: " + e.getMessage());
            } catch (InterruptedException e) {
                System.err.println("Thread interrotto: " + e.getMessage());
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}