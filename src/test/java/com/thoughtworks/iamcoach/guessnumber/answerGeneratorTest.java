package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by zk on 14-10-16.
 */

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class answerGeneratorTest {
    @Test
    public void answerGeneratorTest (){
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.answerGenerator().length()).isEqualTo(4);
        assertThat(isAllNumber(guessNumber.answerGenerator())).isEqualTo(true);
        assertThat(isAllNotRepeat(guessNumber.answerGenerator())).isEqualTo(true);

    }
    public boolean isAllNumber (String str){
        for (int i = 0;i<str.length();i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    };
    public boolean isAllNotRepeat (String str){
        for (int i=0;i<str.length()-1;i++){
            for (int j=0;j<i;j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    };
}
