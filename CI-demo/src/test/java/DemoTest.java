import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    @Test
    void testAdd() {
        Demo demo = new Demo();

        assertEquals(5, demo.add(2,3));
    }
}