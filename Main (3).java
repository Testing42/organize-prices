package edu.cscc;
import java.util.Scanner;
import java.util.Arrays;




public class Main {


    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] prices = new int[10];

        for (int i = 0; i < prices.length; i++)
        {
            System.out.print("Please enter phone cost: ");
            prices[i] = input.nextInt();
        }

        Arrays.sort(prices);

        highCost(prices);
        lowCost(prices);

    }

        public static char highCost(int[] prices){
            System.out.println("3 most Expensive phone costs");
            for (int i = prices.length - 1; i >= 7 ; i--) {
                System.out.println(prices[i]);
            }
            System.out.println("");
            return 0;
        }

        public static char lowCost(int[] prices){
            System.out.println(" 3 Cheapest phone costs");
            for (int i = 0; i < 3; i++) {
                System.out.println(prices[i]);
            }
            return 0;
        }
}

