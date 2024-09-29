package study;

import java.util.Scanner;

public class Coffee_Machine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("What coffee would you like to have?");
        System.out.println("1. Turkish Coffee");
        System.out.println("2. Filter Coffee");
        System.out.println("3. Espresso");


        String whichCoffee = sc.nextLine().trim().toLowerCase();
        String coffeeMessage = "";


        switch (whichCoffee) {
            case "turkish coffee":
                coffeeMessage = "Turkish coffee will be ready for you.";
                break;
            case "filter coffee":
                coffeeMessage = "Filter coffee will be ready for you.";
                break;
            case "espresso":
                coffeeMessage = "Espresso coffee will be ready for you.";
                break;
            default:
                System.out.println("You made incorrect entry.");
                return;
        }
        System.out.println(coffeeMessage);


        System.out.println("Would you like to add some milk? (Please press  Yes or No) : ");
        String milk = sc.nextLine().trim().toLowerCase();

        if (milk.equals("yes")) {
            System.out.println("Adding milk in progress...");
        } else if (milk.equals("no")) {
            System.out.println("Milk not added.");
        } else {
            System.out.println("You made incorrect entry.");
            return;
        }


        System.out.println("Would you like to add some sugar? (Please press  Yes or No) : ");
        String sugar = sc.nextLine().trim().toLowerCase();

        if (sugar.equals("yes")) {
            System.out.println("How much sugar would you like?");
            int muchSugar = sc.nextInt();
            System.out.println(muchSugar + " adding sugar in progress...");
            String code = sc.nextLine();
        } else if (sugar.equals("no")) {
            System.out.println("Sugar not added.");
        } else {
            System.out.println("You made incorrect entry.");
            return;
        }


        System.out.println("What size of coffee would you like? (Please press Large size - Medium size - Small size): ");
        String size = sc.nextLine().trim().toLowerCase();
        String sizeMessage = "";

        switch (size) {
            case "large size":
                sizeMessage = "Your coffee " + size + " preparing...";
                break;
            case "medium size":
                sizeMessage = "Your coffee " + size + " preparing...";
                break;
            case "small size":
                sizeMessage = "Your coffee " + size + " preparing...";
                break;
            default:
                System.out.println("You made incorrect entry.");
                return;
        }
        System.out.println(sizeMessage);


        System.out.println(whichCoffee + " " + size + " it is ready. Enjoy!!!");

    }
}
