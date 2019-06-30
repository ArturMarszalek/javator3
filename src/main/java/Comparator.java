public class Comparator {

    public Computer computer;
    public User user;


    public static Wynik compare() {

        Elements playerChoice;
        Elements computerChoice;

        playerChoice = User.start();
        computerChoice = Computer.computerChoise();

        if (playerChoice == computerChoice) {
            return Wynik.REMIS;
        }


        switch (playerChoice) {
            case NOZYCE:
                return computerChoice == Elements.KAMIEN ? Wynik.PORAŻKA : Wynik.ZWYCIĘSTWO;
            case KAMIEN:
                return computerChoice == Elements.PAPIER ? Wynik.PORAŻKA : Wynik.ZWYCIĘSTWO;
            case PAPIER:
                return computerChoice == Elements.NOZYCE ? Wynik.PORAŻKA : Wynik.ZWYCIĘSTWO;
        }

        return Wynik.REMIS;
    }

    public static void result(Wynik wynik) {


        switch (wynik) {

            case ZWYCIĘSTWO:
                System.out.println("Wygrałeś");
                break;
            case PORAŻKA:
                System.out.println("Przegrałeś");
                break;
            case REMIS:
                System.out.println("Remis");
                break;
        }

    }

}
