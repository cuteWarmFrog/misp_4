import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestHello {
    @Test
    public void testHello() {
        assertEquals("Hello, I'm so kind program. My name's Bob.\n" +
                "I can't do a lot of things, but I can do some cool things!\n" +
                "Interested? Write 'help' and go!\n", Final.sayHello());
    }
}
