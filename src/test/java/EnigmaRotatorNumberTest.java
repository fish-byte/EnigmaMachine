import EnigmaTwo.enigmaProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static EnigmaTwo.enigmaInputBridge.*;
import static EnigmaTwo.enigmaUsrInptAndErrChck.getErrorMessage;
import static EnigmaTwo.enigmaUsrInptAndErrChck.rotatorOption;

public class EnigmaRotatorNumberTest extends enigmaProcessor
{
    @Test
    void rotatorNumberOptionErrorTest()
    {
        rotatorOption(28,1);

        Assertions.assertEquals("Rotator Option was entered wrong too many times", getErrorMessage());
    }

    @Test
    void rotatorNumberOneOptionTest()
    {
        rotatorOption(6,1);

        Assertions.assertEquals(6, getRotatorOneOption(), "The rotator option doesn't match");
    }

    @Test
    void rotatorNumberTwoOptionTest()
    {
        setRotatorOneOption(6);
        rotatorOption(15,1);

        Assertions.assertEquals(15, getRotatorTwoOption(), "The rotator option doesn't match");
    }

    @Test
    void rotatorNumberThreeOptionTest()
    {
        setRotatorOneOption(6);
        setRotatorTwoOption(15);
        rotatorOption(8,1);

        Assertions.assertEquals(8, getRotatorThreeOption(), "The rotator option doesn't match");
    }

    @Test
    void rotatorNumberHashmapTest()
    {
        String rotator = "{1=2, 2=3, 3=4, 4=5, 5=6, 6=7, 7=8, 8=9, 9=10, 10=11, 11=12, 12=13, 13=14, 14=15, 15=16, 16=17, 17=18, " +
                "18=19, 19=20, 20=21, 21=22, 22=23, 23=24, 24=25, 25=26, 26=1}";
        Assertions.assertEquals(rotator, getRotatorBuffer(2).toString(), "The rotator option doesn't match");
    }

    @Test
    void rotatorNumberHashmapTest2()
    {
        String rotator = "{1=16, 2=17, 3=18, 4=19, 5=20, 6=21, 7=22, 8=23, 9=24, 10=25, 11=26, 12=1, 13=2, 14=3, 15=4, 16=5, 17=6, " +
                "18=7, 19=8, 20=9, 21=10, 22=11, 23=12, 24=13, 25=14, 26=15}";
        Assertions.assertEquals(rotator, getRotatorBuffer(16).toString(), "The rotator option doesn't match");
    }
}
