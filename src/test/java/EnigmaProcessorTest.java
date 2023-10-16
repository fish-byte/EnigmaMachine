import EnigmaTwo.enigmaPlugBox;
import EnigmaTwo.enigmaUsrInptAndErrChck;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static EnigmaTwo.enigmaInputBridge.*;
import static EnigmaTwo.enigmaRotator.*;
import static EnigmaTwo.enigmaUsrInptAndErrChck.*;

public class EnigmaProcessorTest extends enigmaPlugBox
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void encryptionTest()
    {
        motorChoice(2,1);
        motorChoice(5,1);
        motorChoice(1,1);

        rotatorOption(12,1);
        rotatorOption(4,1);
        rotatorOption(9,1);

        plugMap.clear();
        plugAmt(2,1);

        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("B", 1));
        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("C", 1), enigmaUsrInptAndErrChck.plug2("D", 1));

        encryptDecrypt("test".toUpperCase());


        Assertions.assertEquals(getSpindleTwo(), getRotatorOne(), "The Rotator Selected was not 2");
        Assertions.assertEquals(getSpindleFive(), getRotatorTwo(), "The Rotator Selected was not 5");
        Assertions.assertEquals(getSpindleOne(), getRotatorThree(), "The Rotator Selected was not 1");

        Assertions.assertEquals("{A=B, B=A, C=D, D=C}", enigmaPlugBox.getPlugs().toString(), "The plugs are not there");
        Assertions.assertEquals("OBAY", outputStreamCaptor.toString().trim());

        EnigmaTest.clear();
    }

    @Test
    void decryptionTest()
    {
        motorChoice(2,1);
        motorChoice(5,1);
        motorChoice(1,1);

        rotatorOption(12,1);
        rotatorOption(4,1);
        rotatorOption(9,1);

        plugMap.clear();
        plugAmt(2,1);

        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("B", 1));
        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("C", 1), enigmaUsrInptAndErrChck.plug2("D", 1));

        encryptDecrypt("obay".toUpperCase());


        Assertions.assertEquals(getSpindleTwo(), getRotatorOne(), "The Rotator Selected was not 2");
        Assertions.assertEquals(getSpindleFive(), getRotatorTwo(), "The Rotator Selected was not 5");
        Assertions.assertEquals(getSpindleOne(), getRotatorThree(), "The Rotator Selected was not 1");

        Assertions.assertEquals("{A=B, B=A, C=D, D=C}", enigmaPlugBox.getPlugs().toString(), "The plugs are not there");
        Assertions.assertEquals("TEST", outputStreamCaptor.toString().trim());

        EnigmaTest.clear();
    }
}
