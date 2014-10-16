package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by zk on 14-10-16.
 */
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    @Test
    public void GuesssTest() {
        GuessNumber guessNumber= mock(GuessNumber.class);
        GuessNumber guess = new GuessNumber();
        when(guessNumber.answerGenerator()).thenReturn("1234");

        assertThat(guessNumber.answerGenerator()).isEqualTo("1234");
        assertThat(guess.CompareNumber(guessNumber.answerGenerator(),"1234")).isEqualTo("4A0B");
    }
}
