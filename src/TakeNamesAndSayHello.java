import java.util.Scanner;

public class TakeNamesAndSayHello {

    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        String[] names = new String[5];
        int counter = 0;

        while (counter < 5) {
            System.out.println("Podaj imię numer: " + (counter + 1));
            names[counter] = nameInput.nextLine();
            counter++;
        }
        nameInput.close();

        System.out.println("Wszystkie dane wprowadzone");
        counter = 4;

        while (counter >= 0) {
            System.out.println(names[counter]);
            counter--;
        }
    }
}
