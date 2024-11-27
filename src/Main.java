import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 if you want to convert from km to miles, otherwise enter 2");
        int choice = scanner.nextInt();

        double number;



        if (choice == 1) {
            System.out.println("Enter your number which you want to counvert");
            number = scanner.nextDouble();

            System.out.println(number + "km = "+convkm2miles(number)+"miles");}
    else if (choice ==2 ){
            System.out.println("Enter your number which you want to counvert");
            number = scanner.nextDouble();

            System.out.println(number + "miles = "+convmiles2km(number)+"km");
        }
        else System.out.println("Sorry you enetered unvalid value");


    }

    private static double convmiles2km(double number) {
        return 1.60934 * number;
    }

    private static double convkm2miles(double number) {
        return 0.621371*number;
    }
}