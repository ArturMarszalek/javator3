import java.util.Random;

public class Computer {

    public static Elements computerChoise() {

        Random random = new Random();

        int computerChoice = random.nextInt(3) +1;

        switch  (computerChoice){
            case 1:
                System.out.println("Komputer wybrał papier");
                return Elements.PAPIER;
            case 2:
                System.out.println("Komputer wybrał nożyce");
                return Elements.NOZYCE;
        }
        System.out.println("Komputer wybrał kamień");
        return Elements.KAMIEN;
    }

}
