import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------- ESERCIZIO 1 ----------------------------");
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int[] cinque = new int[5];

        for (int i = 0; i < cinque.length; i++) {
            cinque[i] = random.nextInt(1, 10);
        }

        int index;
        System.out.println(Arrays.toString(cinque));

        do {
            System.out.println("Scegli la posizione da inserire un nuovo numero:");
            index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < cinque.length) {
                System.out.println("Inserisci un numero da te scelto per cambiare il numero:");
                int numAgg = Integer.parseInt(scanner.nextLine());
                cinque[index] = numAgg;
                
                if (numAgg == 0) {
                    break; // Esce dal ciclo se l'utente inserisce 0
                }

                System.out.println("Ecco la nuova sequenza di numeri: " + Arrays.toString(cinque));

            } else {
                System.out.println("Esci");
                break;
            }
        } while (true);


        System.out.println("---------------------- ESERCIZIO 2 ----------------------------");


    }
}