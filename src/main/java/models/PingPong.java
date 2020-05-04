package models;

import java.util.ArrayList;
import java.util.List;

public class PingPong {


    public ArrayList<Object> runPingPong(int countUpTo) {
        ArrayList<Object> result = new ArrayList<Object>();
        for (int i = 1; i <= countUpTo; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                result.add("pingpong");
//            } else if (i % 3 == 0){
//                result.add("ping");
//            } else if (i % 5 == 0){
//                result.add("pong");
//            } else if (i % 15 == 0){
//                result.add("ping-pong");
//            } else {
//                result.add(i);
//            }

            //we replace the above setup for pingpong on 3 and 5 to ping-pong on 15
            if (i % 15 == 0) {
                result.add("ping-pong");
            } else if (i % 3 == 0) {
                result.add("ping");
            } else if (i % 5 == 0) {
                result.add("pong");
            } else {
                result.add(i);      //here we add the numbers in the range that are not
                //divisible by this criteria
            }
        }


        System.out.println(result);
        return result;
    }

    public ArrayList<Object> runPing(String ping){
        ArrayList<Object> results = new ArrayList<Object>();
        String set1 = "AEIOULNRST";
        String set2 = "DG";
        String set3 = "BCMP";
        String set4 = "FHVWY";
        String set5 = "K";
        String set6 = "JX";
        String set7 = "QZ";
        //results.add(aToZ.toCharArray());
        //System.out.println(aToZ.toCharArray());

        char[] chScrabble = new char[ping.length()];
        for (int i = 0; i < ping.length(); i++){
            //chScrabble[i] = ping.charAt(i);
            results.add(chScrabble[i] = ping.charAt(i));
            System.out.println(results);
        }
        char[] chSet1 = new char[set1.length()];
        ArrayList<Object> set1Result = new ArrayList<Object>();
        for (int x=0;x<set1.length();x++){
            set1Result.add(chSet1[x] = set1.charAt(x));
            System.out.println(chSet1[x] = set1.charAt(x));
            //System.out.println(set1Result);


            for (char c : chScrabble){
                String stringChars = Character.toString(c);
                //System.out.println(c);
                Integer points = 0;
                if (results.contains('A') || results.contains('E') || results.contains('I') ){
                    points = points+1;
                    //System.out.println(points);
                }

        }

        }


        return results;
    }


    // Encrypts text using a shift od s
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    // Driver code
    public static void main(String[] args)
    {
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        int s = 4;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }

}

