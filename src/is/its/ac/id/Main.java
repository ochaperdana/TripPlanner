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
        hackerProblem();
    }

    private static void hackerProblem() {
        Scanner lat, lg, lat1, lg1;
        Double latitude, latitude1, longitude, longitude1, latDist, longDist, hav, res, result;
        int earth_rad = 6371;

        //Asking for user's lat and long
        System.out.print("Input your location's latitude :");
        lat = new Scanner(System.in);
        latitude = lat.nextDouble();

        System.out.print("Input your location's longitude :");
        lg = new Scanner(System.in);
        longitude = lg.nextDouble();

        System.out.print("Input your destination's latitude :");
        lat1 = new Scanner(System.in);
        latitude1 = lat1.nextDouble();

        System.out.print("Input your destination's longitude :");
        lg1 = new Scanner(System.in);
        longitude1 = lg1.nextDouble();

        //Converting user's lat-long to radian (teta)
        latDist = (latitude1 - latitude) * Math.PI / 180;
        longDist = (longitude1 - longitude) * Math.PI / 180;

        //Haversine Formula
        hav = (Math.sin(latDist / 2) * Math.sin(latDist / 2)) + (Math.cos(latitude1 * Math.PI / 180) * Math.cos(latitude * Math.PI / 180) * Math.sin(longDist / 2) * Math.sin(longDist / 2));
        res = 2 * Math.atan2(Math.sqrt(hav), Math.sqrt(1 - hav));
        result = earth_rad * res;

        //Output
        System.out.println("The distance between your location and your destination is : " + rounded(result) + " kilometers");
    }

    private static void round() {
        Double input;
        Scanner inp;

        //Asking for input
        System.out.print("Input number = ");
        inp = new Scanner(System.in);

        //Multiply input with 100
        input = inp.nextDouble() * 100;

        //Converting to integer then cast to double
        int ans = input.intValue();
        double answer = (double) ans;

        //Divided by 100
        double nilai = answer / 100;

        System.out.println(nilai);
    }

    private static void countryArea() {
        String area;
        Scanner ar;

        //Area
        System.out.print("What is the square area of your destination country in km2?");
        ar = new Scanner(System.in);
        area = ar.nextLine();

        double areas = Double.parseDouble(area) * 0.386;
        System.out.println("In miles2 that is " + rounded(areas));
    }

    private static void timeDifference() {
        String time_dif;
        Scanner td;
        int tm_df, noon;

        //Time Difference
        System.out.print("What is the time difference, in hours, between your home and your destinations?");
        td = new Scanner(System.in);
        time_dif = td.nextLine();

        tm_df = Integer.parseInt(time_dif);
        if (tm_df > 12) {
            noon = tm_df % 12;
        } else {
            noon = 12 + tm_df;
        }
        /*int midnight=tm_df;*/

        System.out.println("It means that when it is midnight at home, it will be " + tm_df + ":00 in your travel destination and when it is noon at home, it will be " + noon + ":00 in your travel destination.");
    }

    private static void travelTimeAndBudget() {
        int days, budget;
        String currency;
        double conv_rate;
        Scanner d, b, c, cr;

        //Days
        System.out.print("How many days are you going to spend travelling?");
        d = new Scanner(System.in);
        days = d.nextInt();

        //Budget
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        b = new Scanner(System.in);
        budget = b.nextInt();

        //Currency Symbol
        System.out.print("What is the three letter currency symbol for your travel destination?");
        c = new Scanner(System.in);
        currency = c.nextLine();

        //Currency Rate
        System.out.print("How many " + currency + " are there in 1 USD?");
        cr = new Scanner(System.in);
        conv_rate = cr.nextInt();

        int jam = days * 24;
        int menit = jam * 60;
        System.out.println("\n\nIf you are traveling for " + days + " days that is the same as " + jam + " hours or " + menit + " minutes");


        double perday = (double) budget / days;
        System.out.println("If you are going to spend $" + budget + " USD that means, per day you can spend up to $" + rounded(perday) + " USD");

        double total_conv = conv_rate * budget;
        double perday_connv = conv_rate * perday;
        System.out.println("Your total budget in " + currency + " is " + rounded(total_conv) + " " + currency + ", which perday is " + rounded(perday_connv) + " " + currency);
    }

    private static String rounded(double v) {
        //Multiply input with 100
        double input = v * 100;

        //Converting to integer then cast to double
        int ans = (int) input;
        double answer = (double) ans;

        //Divided by 100
        double nilai = answer / 100;

        return "" + nilai;
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
