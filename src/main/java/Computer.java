import java.util.Random;

public class Computer {

    private static Elements computerChoise (){

        Random random = new Random();

        int computerChoice = random.nextInt(3) +1;

        switch  (computerChoice){
            case 1:
                return Elements.PAPIER;
            case 2:
                return Elements.NOZYCE;
        }

        return Elements.KAMIEN;
    }

}
