import EnigmaThree.EnigmaRotation;
import EnigmaThree.EnigmaRotators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnigmaRotatorChoiceTest2
{
    EnigmaRotation inputBridge = new EnigmaRotation();
    EnigmaRotators rotator = new EnigmaRotators();

    @Test
    void rotatorChoiceTest()
    {
        inputBridge.motorChoice(1,1);

        Assertions.assertEquals(rotator.getSpindleOne(), inputBridge.getRotatorOne(), "The Rotator Selected was not 1");

    }

    @Test
    void rotatorChoiceTest2()
    {
        inputBridge.motorChoice(1,1);
        inputBridge.motorChoice(4,1);

        Assertions.assertEquals(rotator.getSpindleOne(), inputBridge.getRotatorOne(), "The Rotator Selected was not 1");
        Assertions.assertEquals(rotator.getSpindleFour(), inputBridge.getRotatorTwo(), "The Rotator Selected was not 4");
    }

    @Test
    void rotatorChoiceTest3()
    {
        inputBridge.motorChoice(1,1);
        inputBridge.motorChoice(4,1);
        inputBridge.motorChoice(2,1);

        Assertions.assertEquals(rotator.getSpindleOne(), inputBridge.getRotatorOne(), "The Rotator Selected was not 1");
        Assertions.assertEquals(rotator.getSpindleFour(), inputBridge.getRotatorTwo(), "The Rotator Selected was not 4");
        Assertions.assertEquals(rotator.getSpindleTwo(), inputBridge.getRotatorThree(), "The Rotator Selected was not 2");
    }

    @Test
    void rotatorChoiceErrorTest()
    {
        inputBridge.motorChoice(1,1);
        inputBridge.motorChoice(1,1);
        inputBridge.motorChoice(1,1);

        Assertions.assertEquals("Motor Choice was entered wrong too many times", inputBridge.getErrorMessage());
    }
}
