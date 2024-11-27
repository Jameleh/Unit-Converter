import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter 1 if you want to convert from km to miles, otherwise enter 2");
            int choice = scanner.nextInt();

            double number;


            if (choice == 1) {
                System.out.println("Enter your number which you want to convert");
                number = scanner.nextDouble();

                System.out.println(number + "km = "+convkmTomiles(number)+"miles");}
        else if (choice ==2 ){
                System.out.println("Enter your number which you want to convert");
                number = scanner.nextDouble();

                System.out.println(number + "miles = "+convmilesTokm(number)+"km");
            }
            else System.out.println("Sorry you entered invalid value");
        } catch (Exception e) {
            System.out.println("Please Enter just Numbers ");
        }


    }

    private static double convmilesTokm(double number) {
        return 1.60934 * number;
    }


    private static double convkmTomiles(double number) {
        return 0.621371*number;
    }
}