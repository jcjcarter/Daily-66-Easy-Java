package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(xSmallerThanY("M", "X"));
    }

    public static boolean xSmallerThanY(String x, String y){
        char[] romans = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        for(int j=0; j<7; j++){
            int scoreX = 0;
            int scoreY = 0;
            for(int i=0; i<x.length(); i++)
                if(x.charAt(i) == romans[j])
                    scoreX++;
            for(int i=0; i<y.length(); i++)
                if(y.charAt(i) == romans[j])
                    scoreY++;
            if(scoreX != scoreY)
                return scoreX < scoreY;
        }
        return false; // only reachable if x == y
    }
}
