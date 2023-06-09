import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void testGetString() {
        myString.setString("Hello");

        //Assert
        assertEquals("Hello", myString.getString());
    }

    @Test
    public void testGetStringNull() {

        //Assert
        assertEquals(null, myString.getString());
    }
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("TACO");
       assertTrue(myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        fail("Not yet implemented");
    }

    @Test
    public void detectCapitalUseTest3() {
        fail("Not yet implemented");
    }


}
