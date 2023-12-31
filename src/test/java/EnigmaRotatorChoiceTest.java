import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static EnigmaTwo.enigmaInputBridge.*;
import static EnigmaTwo.enigmaRotator.*;
import static EnigmaTwo.enigmaUsrInptAndErrChck.getErrorMessage;
import static EnigmaTwo.enigmaUsrInptAndErrChck.motorChoice;

public class EnigmaRotatorChoiceTest
{
    @Test
    void rotatorChoiceTest()
    {
        motorChoice(1,1);

        Assertions.assertEquals(getSpindleOne(), getRotatorOne(), "The Rotator Selected was not 1");

        EnigmaTest.clear();
    }

    @Test
    void rotatorChoiceTest2()
    {
        motorChoice(1,1);
        motorChoice(4,1);

        Assertions.assertEquals(getSpindleOne(), getRotatorOne(), "The Rotator Selected was not 1");
        Assertions.assertEquals(getSpindleFour(), getRotatorTwo(), "The Rotator Selected was not 4");

        EnigmaTest.clear();
    }

    @Test
    void rotatorChoiceTest3()
    {
        motorChoice(1,1);
        motorChoice(4,1);
        motorChoice(2,1);

        Assertions.assertEquals(getSpindleOne(), getRotatorOne(), "The Rotator Selected was not 1");
        Assertions.assertEquals(getSpindleFour(), getRotatorTwo(), "The Rotator Selected was not 4");
        Assertions.assertEquals(getSpindleTwo(), getRotatorThree(), "The Rotator Selected was not 2");

        EnigmaTest.clear();
    }

    @Test
    void rotatorChoiceErrorTest()
    {
        motorChoice(1,1);
        motorChoice(1,1);
        motorChoice(1,1);

        Assertions.assertEquals("Motor Choice was entered wrong too many times", getErrorMessage());

        EnigmaTest.clear();
    }
}
