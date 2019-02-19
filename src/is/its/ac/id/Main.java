package is.its.ac.id;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //greeting();
        //travelTimeAndBudget();
        //timeDifference();
        //countryArea();
        //round();
        //hackerProblem();
    }

    private static void hackerProblem() {

    }

    private static void round() {

    }

    private static void countryArea() {
        String area;
        Scanner ar;

        //Area
        System.out.print("What is the square area of your destination country in km2?");
        ar = new Scanner(System.in);
        area = ar.nextLine();

        double areas = Double.parseDouble(area) * 0.386;
        System.out.println("In miles2 that is " + areas);
    }

    private static void timeDifference() {
        String time_dif;
        Scanner td;

        //Time Difference
        System.out.print("What is the time difference, in hours, between your home and your destinations?");
        td = new Scanner(System.in);
        time_dif = td.nextLine();

        int tm_df = Integer.parseInt(time_dif);
        int noon = 12 + tm_df;
        /*int midnight=tm_df;*/

        System.out.println("It means that when it is midnight at home, it will be " + tm_df + ":00 in your travel destination and when it is noon at home, it will be " + noon + ":00 in your travel destination.");
    }

    private static void travelTimeAndBudget() {
        String days, budget, currency, conv_rate;
        Scanner d, b, c, cr;

        //Days
        System.out.print("How many days are you going to spend travelling?");
        d = new Scanner(System.in);
        days = d.nextLine();

        //Budget
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        b = new Scanner(System.in);
        budget = b.nextLine();

        //Currency Symbol
        System.out.print("What is the three letter currency symbol for your travel destination?");
        c = new Scanner(System.in);
        currency = c.nextLine();

        //Currency Rate
        System.out.print("How many " + currency + " are there in 1 USD?");
        cr = new Scanner(System.in);
        conv_rate = cr.nextLine();

        int hari = Integer.parseInt(days);
        int jam = hari * 24;
        int menit = jam * 60;
        System.out.println("\n\nIf you are traveling for " + days + " days that is the same as " + jam + " hours or " + menit + " minutes");

        int budg = Integer.parseInt(budget);
        int perday = budg / hari;
        System.out.println("If you are going to spend $" + budget + " USD that means, per day you can spend up to $" + perday + " USD");

        int conv = Integer.parseInt(conv_rate);
        int total_conv = conv * budg;
        int perday_connv = conv * perday;
        System.out.println("Your total budget in " + currency + " is " + total_conv + " " + currency + ", which perday is " + perday_connv + " " + currency);
    }

    private static void greeting() {
        System.out.println("Welcome to the Trip Planner!");
        System.out.print("What is your name?");
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.print("Nice to meet you, " + name + "! Where are you travelling to?");
        String destination;
        Scanner dest = new Scanner(System.in);
        destination = dest.nextLine();
        System.out.println("Great! " + destination + " sounds like a good idea!");
    }


}
