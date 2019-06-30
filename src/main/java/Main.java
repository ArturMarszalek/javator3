import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double z;
        System.out.println("Podaj liczbe");

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        System.out.println("Podaj druga liczbe");

        double y = scanner.nextDouble();

        System.out.println(" mamy: " + x + " i " + y);

        System.out.println(" Wybierz rodzaj działania: + - / * ");

        Character d = scanner.next().charAt(0);

        switch (d){
            case '+':
                z=x+y;
                System.out.println(" suma: " + z);

                break;
            case '-':
                z=x-y;
                System.out.println(" suma: " + z);

                break;
            case '/':
                z=x/y;
                System.out.println(" suma: " + z);

                break;
            case '*':
                z=x*y;
                System.out.println(" suma: " + z);

                break;
            default:
                System.out.println("podałeś niepoprawy znak");
                break;

        }




    }
}
