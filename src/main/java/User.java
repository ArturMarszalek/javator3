import java.util.Scanner;

public class User {


    public static Elements start() {


        System.out.println("Twój wybór: ");
        System.out.println("Dla papier wpisz: P");
        System.out.println("Dla kamienia wpisz: K");
        System.out.println("Dla nożyczek wpisz: N");

        Scanner scanner = new Scanner(System.in);

        String choise = scanner.nextLine().toUpperCase();

        switch (choise) {
            case "P":
                return Elements.PAPIER;
            case "K":
                return Elements.KAMIEN;
            case "N":
                return Elements.NOZYCE;
        }

        System.out.println("Wpisz poprawnie matole");
        return start();
    }
}
