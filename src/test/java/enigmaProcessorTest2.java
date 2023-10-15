import EnigmaThree.EnigmaPlugBox;
import EnigmaThree.EnigmaProcessor;
import EnigmaThree.EnigmaRotator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static EnigmaThree.EnigmaPlugBox.getPlugs;

public class enigmaProcessorTest2
{
    EnigmaProcessor processor = new EnigmaProcessor();
    EnigmaPlugBox plugBox = new EnigmaPlugBox();
    EnigmaRotator rotator = new EnigmaRotator();

    @Test
    void encryptionTest()
    {
        processor.motorChoice(2,1);
        processor.motorChoice(5,1);
        processor.motorChoice(1,1);

        processor.rotatorOption(12,1);
        processor.rotatorOption(4,1);
        processor.rotatorOption(9,1);

        getPlugs().clear();
        plugBox.plugAmt(2,1);

        plugBox.setPlugs(plugBox.plug1("A", 1), plugBox.plug2("B", 1));
        plugBox.setPlugs(plugBox.plug1("C", 1), plugBox.plug2("D", 1));

        processor.encryptDecrypt("test".toUpperCase());

        Assertions.assertEquals(rotator.getSpindleTwo(), processor.getRotatorOne(), "The Rotator Selected was not 2");
        Assertions.assertEquals(rotator.getSpindleFive(), processor.getRotatorTwo(), "The Rotator Selected was not 5");
        Assertions.assertEquals(rotator.getSpindleOne(), processor.getRotatorThree(), "The Rotator Selected was not 1");

        Assertions.assertEquals("{A=B, B=A, C=D, D=C}", getPlugs().toString(), "The plugs are not there");
        Assertions.assertEquals("OBAY", processor.getOutput());

    }

    @Test
    void decryptionTest()
    {
        processor.motorChoice(2,1);
        processor.motorChoice(5,1);
        processor.motorChoice(1,1);

        processor.rotatorOption(12,1);
        processor.rotatorOption(4,1);
        processor.rotatorOption(9,1);

        getPlugs().clear();
        plugBox.plugAmt(2,1);

        plugBox.setPlugs(plugBox.plug1("A", 1), plugBox.plug2("B", 1));
        plugBox.setPlugs(plugBox.plug1("C", 1), plugBox.plug2("D", 1));

        processor.encryptDecrypt("obay".toUpperCase());

        Assertions.assertEquals(rotator.getSpindleTwo(), processor.getRotatorOne(), "The Rotator Selected was not 2");
        Assertions.assertEquals(rotator.getSpindleFive(), processor.getRotatorTwo(), "The Rotator Selected was not 5");
        Assertions.assertEquals(rotator.getSpindleOne(), processor.getRotatorThree(), "The Rotator Selected was not 1");

        Assertions.assertEquals("{A=B, B=A, C=D, D=C}", getPlugs().toString(), "The plugs are not there");
        Assertions.assertEquals("TEST", processor.getOutput());
    }

    @Test
    void encryption_NoPlugs_Test()
    {
        processor.motorChoice(2,1);
        processor.motorChoice(5,1);
        processor.motorChoice(1,1);

        processor.rotatorOption(12,1);
        processor.rotatorOption(4,1);
        processor.rotatorOption(9,1);

        getPlugs().clear();
        plugBox.plugAmt(0,1);

        processor.encryptDecrypt("test".toUpperCase());

        Assertions.assertEquals(rotator.getSpindleTwo(), processor.getRotatorOne(), "The Rotator Selected was not 2");
        Assertions.assertEquals(rotator.getSpindleFive(), processor.getRotatorTwo(), "The Rotator Selected was not 5");
        Assertions.assertEquals(rotator.getSpindleOne(), processor.getRotatorThree(), "The Rotator Selected was not 1");

        Assertions.assertEquals("{}", getPlugs().toString(), "The plugs are not there");
        Assertions.assertEquals("OABY", processor.getOutput());

    }

    @Test
    void decryption_NoPlugs_Test()
    {
        processor.motorChoice(2,1);
        processor.motorChoice(5,1);
        processor.motorChoice(1,1);

        processor.rotatorOption(12,1);
        processor.rotatorOption(4,1);
        processor.rotatorOption(9,1);

        getPlugs().clear();
        plugBox.plugAmt(0,1);

        processor.encryptDecrypt("oaby".toUpperCase());

        Assertions.assertEquals(rotator.getSpindleTwo(), processor.getRotatorOne(), "The Rotator Selected was not 2");
        Assertions.assertEquals(rotator.getSpindleFive(), processor.getRotatorTwo(), "The Rotator Selected was not 5");
        Assertions.assertEquals(rotator.getSpindleOne(), processor.getRotatorThree(), "The Rotator Selected was not 1");

        Assertions.assertEquals("{}", getPlugs().toString(), "The plugs are not there");
        Assertions.assertEquals("TEST", processor.getOutput());
    }
}
