import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int part = 0;
        Scanner scanner = new Scanner(System.in);
        while (part != 6){
            System.out.println("\n\nChoose the number of the Assigment you want to run 1-3 6(Exit)");
            part = scanner.nextInt();
            System.out.println("\n\n\n");
            switch(part) {
                case 1:
                    System.out.println("1. Write a for loop that prints the numbers from 1 to 10.");
                    for(int i = 1; i<=10; i++){
                        System.out.println(i);
                    }
                    System.out.println("2. Write a for loop that calculates the sum of the first 10 positive integers and prints the result.");
                    int sum = 0;
                    for(int i = 1; i<=10; i++){
                        System.out.println("The sum of " + i + " + " + sum + " = " + (sum = i + sum));
                    }
                    System.out.println("3. Write a for loop that prints the multiplication table of a number provided by the user (from 1 to 10).");
                    System.out.println("Give me a number to get the multiplication table.");
                    int multiplication = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i*multiplication);
                    }
                    break;
                case 2:
                    int exit = 0;
                    while(exit != 2){
                        int input = -1;
                        System.out.println("1. User Input.");
                        while(input<0){
                            System.out.println("Please enter a Positive integer");
                            input = scanner.nextInt();
                            if(input < 0){
                                System.out.println("That's not a Positive integer");
                            }
                        }
                        System.out.println("2. Output the Result");
                        int sume = 0;
                        while(input > 0){
                            sume += input%10;
                            input /= 10;
                        }
                        System.out.println("Result: " + sume);
                        System.out.println("Do you want to run again this assigment?\n1. Yes\n2. No");
                        exit = scanner.nextInt();
                    }
                    break;
                case 3:
                    int menu, num1, num2, result = 0;
                    System.out.println("Welcome to the Calculator!");
                    do {
                        System.out.println("""
                                
                                Please select an operation:
                                1. Addition
                                2. Subtraction
                                3. Multiplication
                                4. Division
                                5. Exit
                                """);
                        if ((menu = scanner.nextInt()) != 5){
                            System.out.println("Enter the first number: ");
                            num1 = scanner.nextInt();
                            System.out.println("Enter the second number: ");
                            num2 = scanner.nextInt();
                            result = switch (menu) {
                                case 1 -> num1 + num2;
                                case 2 -> num1 - num2;
                                case 3 -> num1 * num2;
                                case 4 -> num1 / num2;
                                default -> result;
                            };
                            System.out.println("Result: " + result);
                        }
                    }while (menu != 5);
                    break;
            }
        }
        scanner.close();
    }
}