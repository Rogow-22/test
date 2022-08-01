import java.io.IOException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner wpisz = new Scanner(System.in);
        System.out.println("Podaj pierwszą i drugą liczbę: ");
//      char tak;
//      char nie;
        int x, y;
//        int z;
        x = wpisz.nextInt();
        y = wpisz.nextInt();
        char znak;
        int a = 1;

        while (a == 1) {
            {
                try {
                    System.out.println("Podaj znak!");

                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Dodawanie - wciśnij [+]");
                //continue;
                System.out.println("Odejmowanie - wciśnij [-]");
                //break;/
                System.out.println("Mnożenie - wciśnij [*]");
                //break;
                System.out.println("Dzielenie - wciśnij [/]");
                //break;
                System.out.println("Modulo - wciśnij [%]");

                System.out.println("Jeśli chcesz zakończyć wpisz literę [E]");
                //break;
                znak = wpisz.next().charAt(0);


//        System.out.println("Pierwiastkowanie - ^2");
//        System.out.println("Potęgowanie - ");

                switch (znak) {
                    case '+':
                        System.out.println(x + y);
                        break;
                    case '-':
                        System.out.println(x - y);
                        break;
                    case '*':
                        System.out.println(x * y);
                        break;

                    case '/':
                        if (y != 0)
                            System.out.println(x / y + " " + "Oraz reszta: " + x % y);

                        else
                            System.out.println("Nie można dzielić przez zero!!!");
                        break;

                    case '%':
                        if (y != 0 && x > y)
                            System.out.println(x % y);
                        else
                            System.out.println("Nie można dzielić przez zero!!! lub liczba pierwsza jest mniejsza od drugiej");
                        break;

                   /* case 'E':
                        if ()
                            System.out.println("Okej to kończymy.");
                        break;*/

                    default:
                        System.out.println("Nie wiem co chcesz zrobić, ale podałeś zły znak... " + '"' + znak + '"');
                        break;
                }
            }
        }
    }
}
