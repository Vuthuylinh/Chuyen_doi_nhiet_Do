import java.util.Scanner;

public class menu_chuyendoi_nhietdo {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitTocelsius(double fahrenheit) {
        double celsius = ((5.0 / 9) * (fahrenheit - 32));
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double celsius;
        double fahrenheit;

        do {
            System.out.println("Choice 1: convert Celsius to Fahrenheit");
            System.out.println("Choice 2: convert Fahrenheit to Celsius");
            System.out.println("Choice 0: Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter celsius degree: ");
                    celsius = input.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println(celsius + "C convert into " + fahrenheit + " F");
                    break;

                case 2:
                    System.out.println("Enter Fahrenheit degree: ");
                    fahrenheit = input.nextDouble();
                    celsius = fahrenheitTocelsius(fahrenheit);
                    System.out.println(fahrenheit + " F convert to celsius: " + celsius + " C");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }


        } while (choice != 0);
    }
}