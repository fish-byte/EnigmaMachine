import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static EnigmaTwo.enigmaInputBridge.*;
import static EnigmaTwo.enigmaRotator.*;
import static EnigmaTwo.enigmaUsrInptAndErrChck.motorChoice;

public class enigmaRotatorChoiceTest
{
    @Test
    void rotatorChoiceTest()
    {
        setRotatorNumberOne(null);
        setRotatorNumberTwo(null);
        setRotatorNumberThree(null);
        setRotatorOne(0);
        setRotatorTwo(0);
        setRotatorThree(0);

        motorChoice(1,1);

        motorChoice(2,1);

        motorChoice(3,1);

        Assertions.assertEquals(getSpindleOne(), getRotatorOne(), "The Rotator Selected was not 1: ");
        Assertions.assertEquals(getSpindleTwo(), getRotatorTwo(), "The Rotator Selected was not 2: ");
        Assertions.assertEquals(getSpindleThree(), getRotatorThree(), "The Rotator Selected was not 3: ");
    }

    @Test
    void rotatorChoiceTest2()
    {
        setRotatorNumberOne(null);
        setRotatorNumberTwo(null);
        setRotatorNumberThree(null);
        setRotatorOne(0);
        setRotatorTwo(0);
        setRotatorThree(0);

        motorChoice(2,1);

        motorChoice(4,1);

        motorChoice(5,1);

        Assertions.assertEquals(getSpindleTwo(), getRotatorOne(), "The Rotator Selected was not 2: ");
        Assertions.assertEquals(getSpindleFour(), getRotatorTwo(), "The Rotator Selected was not 4: ");
        Assertions.assertEquals(getSpindleFive(), getRotatorThree(), "The Rotator Selected was not 5: ");
    }
}
