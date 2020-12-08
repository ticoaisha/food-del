package runner;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        System.out.println("What would you like to eat?");
        String food = new Scanner(System.in).nextLine();

        if (food.equals("pizza")){
            System.out.println("It will be $20");
            System.out.println("Continue to payment?");
            String ans = new Scanner(System.in).nextLine();
            if (ans.equals("yes")){
                System.out.println("Please give us your address");

                String address = new Scanner(System.in).nextLine();
                System.out.println("Thank you for your order");
                System.out.println(food + " will be delivered to " + address + " in 20 minutes");
            }else{
                System.out.println("Come in soon!");
            }
        }else{
            System.out.println("Sorry we only have pizza");
        }






    }

}
