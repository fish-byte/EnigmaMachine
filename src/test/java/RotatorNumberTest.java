import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static EnigmaTwo.enigmaInputBridge.getRotatorOneOption;
import static EnigmaTwo.enigmaUsrInptAndErrChck.getErrorMessage;
import static EnigmaTwo.enigmaUsrInptAndErrChck.rotatorOption;

public class RotatorNumberTest
{
    @Test
    void rotatorNumberOptionTest()
    {
        rotatorOption(6,1);

        Assertions.assertEquals(6, getRotatorOneOption(), "The rotator option doesn't match");
    }

    @Test
    void rotatorNumberOptionErrorTest()
    {
        rotatorOption(28,1);

        Assertions.assertEquals("Rotator Option was entered wrong too many times", getErrorMessage());
    }
}
