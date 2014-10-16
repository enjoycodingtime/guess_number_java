package com.thoughtworks.iamcoach.guessnumber;

import java.util.Random;

/**
 * Created by zk on 14-10-16.
 */
public class GuessNumber {

    public String CompareNumber (String inputNumber,String answer){

        int a = 0,b = 0;
        for (int i = 0;i<4;i++){
            String str = "" + inputNumber.charAt(i);
            if(answer.contains(str) && answer.charAt(i) != inputNumber.charAt(i)){
                b += 1;
            }
            if(answer.charAt(i) == inputNumber.charAt(i)){
                a += 1;
            }
        }
        return a+"A"+b+"B";
    };
    public String answerGenerator (){
        String number = "";
        String newItem;
        for (int i = 0; i < 4; i++) {
            newItem = "" + generateRandomNumber();
            while (number.contains(newItem)) {
                newItem = "" + generateRandomNumber();
            }
            number += newItem;
        }
        return number;
    };
    public int generateRandomNumber() {
        return new Random().nextInt(10);
    }


}
