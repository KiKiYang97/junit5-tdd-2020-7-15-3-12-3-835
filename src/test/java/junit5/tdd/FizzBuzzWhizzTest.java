package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {
    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1(){
//        given
        int number = 1;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

//        when
        String actual = fizzBuzzWhizz.play(number);

//        then
        assertEquals("1",actual);
    }

    @Test
    void should_return_fizz_when_play_fizz_buzz_whizz_given_3(){
//        given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

//        when
        String actual = fizzBuzzWhizz.play(number);

//        then
        assertEquals("fizz",actual);
    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_whizz_given_5(){
//        given
        int number = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

//        when
        String actual = fizzBuzzWhizz.play(number);

//        then
        assertEquals("buzz",actual);
    }

    @Test
    void should_return_whizz_when_play_fizz_buzz_whizz_given_7(){
//        given
        int number = 7;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

//        when
        String actual = fizzBuzzWhizz.play(number);

//        then
        assertEquals("whizz",actual);
    }

    @Test
    void should_return_fizzbuzz_when_play_fizz_buzz_whizz_given_15(){
//        given
        int number = 15;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

//        when
        String actual = fizzBuzzWhizz.play(number);

//        then
        assertEquals("fizzbuzz",actual);
    }
    @Test
    void should_return_fizzwhizz_when_play_fizz_buzz_whizz_given_21(){
//        given
        int number = 21;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

//        when
        String actual = fizzBuzzWhizz.play(number);

//        then
        assertEquals("fizzwhizz",actual);
    }
}
