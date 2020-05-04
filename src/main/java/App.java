import models.PingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a number:");
        try {
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
            System.out.println(pingPongResult);
        } catch (IOException e){
            e.printStackTrace();
        }

        //for scrabble
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Welcome to Scrabble!");
        System.out.println("Enter a word to play:");
        try{
            String stringScrabbleInput = bufferedReader1.readLine();
            PingPong scrabble = new PingPong();
            ArrayList<Object> scrabbleResult = scrabble.runPing(stringScrabbleInput);
            System.out.println(scrabbleResult);
//            ArrayList<Object> set1Result = scrabble.runPing();


        } catch (IOException e){
            e.printStackTrace();
        }


        //using random
        Random myRandomGenerator = new Random();

        System.out.println(myRandomGenerator.nextInt());
        System.out.println(myRandomGenerator.nextInt(10));
        System.out.println(myRandomGenerator.nextBoolean());
    }
}
