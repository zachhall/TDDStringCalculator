package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    // Use this annotation( ) when you're expecting a RuntimeException, not any kind
    // of returned value
    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenAnExceptionIsThrown() {
        Calculator.add("1,2,3");
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        Calculator.add("1,X");
    }

}