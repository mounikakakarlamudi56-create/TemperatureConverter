import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double temperature, result;

        while (true) {

            System.out.println("\n=================================================");
            System.out.println("          TEMPERATURE CONVERTER SYSTEM");
            System.out.println("=================================================");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.println("=================================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = sc.nextDouble();
                    result = (temperature * 9 / 5) + 32;
                    System.out.printf("\nResult: %.2f °C = %.2f °F%n", temperature, result);
                    break;

                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = sc.nextDouble();
                    result = temperature + 273.15;
                    System.out.printf("\nResult: %.2f °C = %.2f K%n", temperature, result);
                    break;

                case 3:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = sc.nextDouble();
                    result = (temperature - 32) * 5 / 9;
                    System.out.printf("\nResult: %.2f °F = %.2f °C%n", temperature, result);
                    break;

                case 4:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = sc.nextDouble();
                    result = (temperature - 32) * 5 / 9 + 273.15;
                    System.out.printf("\nResult: %.2f °F = %.2f K%n", temperature, result);
                    break;

                case 5:
                    System.out.print("Enter temperature in Kelvin: ");
                    temperature = sc.nextDouble();
                    result = temperature - 273.15;
                    System.out.printf("\nResult: %.2f K = %.2f °C%n", temperature, result);
                    break;

                case 6:
                    System.out.print("Enter temperature in Kelvin: ");
                    temperature = sc.nextDouble();
                    result = (temperature - 273.15) * 9 / 5 + 32;
                    System.out.printf("\nResult: %.2f K = %.2f °F%n", temperature, result);
                    break;

                case 7:
                    System.out.println("\n=================================================");
                    System.out.println("Thank you for using Temperature Converter System.");
                    System.out.println("Developed as part of SkillCraft Technology Internship.");
                    System.out.println("=================================================");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 7.");
            }
        }
    }
}