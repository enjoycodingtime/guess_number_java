package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by zk on 14-10-16.
 */

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

 public class compareNumberTest {
     @Test
     public void compareNumberTest (){
         GuessNumber guessNumber = new GuessNumber();
         assertThat(guessNumber.CompareNumber("1234","4321")).isEqualTo("0A4B");
         assertThat(guessNumber.CompareNumber("1234","1234")).isEqualTo("4A0B");
         assertThat(guessNumber.CompareNumber("1234","5678")).isEqualTo("0A0B");
         assertThat(guessNumber.CompareNumber("1234","1324")).isEqualTo("2A2B");
     }
}
