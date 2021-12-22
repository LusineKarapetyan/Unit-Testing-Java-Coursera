/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    @DisplayName("Checking triangle with 3,4,5 sides")
    public void testIsTriangle1(){
        assertTrue(Demo.isTriangle(3,4,5));
    }

    @Test
    @DisplayName("Checking triangle with 5,12,12 sides")
    public void testIsTriangle2(){
        assertTrue(Demo.isTriangle(5,12,13));
    }

    @Test
    @DisplayName("Checking triangle with 13,12,5")
    public void testIsTriangle3(){
        assertTrue(Demo.isTriangle(13, 12, 5));
    }

    @Test
    @DisplayName("Checking triangle with 5,13,12")
    public void testIsTriangle4(){
        assertTrue(Demo.isTriangle(5,13,12));
    }

    @Test
    @DisplayName("Checking that Not triangle is with 5,7,13 sides")
    public void testIsNotTriangle1(){
        assertFalse(Demo.isTriangle(5,7,13));
    }

    @Test
    @DisplayName("Checking that Not triangle is with 5,13,7 sides")
    public void testIsNotTriangle2(){
        assertFalse(Demo.isTriangle(5,13,7));
    }

    @Test
    @DisplayName("Checking that Not triangle is with 7,13,5 sides")
    public void testIsNotTriangle3(){
        assertFalse(Demo.isTriangle(7,13,5));
    }

    @Test
    @DisplayName("Checking that Not triangle is with -2,7,8 sides")
    public void testIsNotTriangle4(){
        assertFalse(Demo.isTriangle(-2,7,8));
    }

    /*
    @Test
    public void testMainProgram(){
        ByteArrayInputStream in = new ByteArrayInputStream("Enter side 1: 5\nEnter side 2: 12\nEnter side 3: 13\n".getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";

        assertEquals(consoleOutput.trim().replace("\r","").replace("\n",""), out.toString().trim().replace("\r","").replace("\n",""));
    }*/
}
