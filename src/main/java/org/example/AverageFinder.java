package org.example;

public class AverageFinder {
    public static void main(String []args){
        System.out.println("Upstream change verification");
        System.out.println("Hello Git");
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
        System.out.println("Congrats!!!! You are connected to github");
    }

    private static double findAverage(String[] input){
        double result = 0;
        for(String s : input){
            result += Integer.parseInt(s);
        }
        return result / input.length;
    }
}
