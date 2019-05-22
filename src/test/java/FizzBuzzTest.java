
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void of_0is0() {
        assertEquals(FizzBuzz.of(0), "0");
    }
    @Test
    public void of_1is1() {
        assertEquals(FizzBuzz.of(1), "1");
    }
    @Test
    public void of_3isFizz() {
        assertEquals(FizzBuzz.of(3), "Fizz");
    }
    @Test
    public void of_5isBuzz() {
        assertEquals(FizzBuzz.of(5), "Buzz");
    }
    @Test
    public void of_6isBuzz() {
        assertEquals(FizzBuzz.of(6), "Fizz");
    }
    @Test
    public void of_10isBuzz() {
        assertEquals(FizzBuzz.of(10), "Buzz");
    }
    @Test
    public void of_15isBuzz() {
        assertEquals(FizzBuzz.of(15), "FizzBuzz");
    }
}