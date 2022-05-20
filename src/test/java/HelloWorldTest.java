import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void mySumTest() {
        assertEquals(3, helloWorld.mySum(1,2));
    }
}