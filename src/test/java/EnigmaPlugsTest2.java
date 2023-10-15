import EnigmaThree.EnigmaPlugBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnigmaPlugsTest2
{
    EnigmaPlugBox plugBox = new EnigmaPlugBox();
    @Test
    void plugAmtTest()
    {
        plugBox.plugAmt(4,1);

        Assertions.assertEquals(4, plugBox.getPlugAmt(), "The Amount of plugs is not equal");
    }

    @Test
    void noPlugTest()
    {
        plugBox.plugAmt(0,1);

        Assertions.assertEquals(0, plugBox.getPlugAmt(), "The Amount of plugs is not equal");
    }

    @Test
    void plugAmtErrorTest()
    {
        plugBox.plugAmt(14,1);

        Assertions.assertEquals("You can only have 13 cables", plugBox.getErrorMessage());
    }

    @Test
    void plugChoicesTest()
    {
        plugBox.setPlugs(plugBox.plug1("A", 1), plugBox.plug2("B", 1));
        plugBox.setPlugs(plugBox.plug1("C", 1), plugBox.plug2("D", 1));

        Assertions.assertEquals(plugBox.getPlugs(), plugBox.getPlugs(), "The plugs are not there");
    }

    @Test
    void plugChoicesErrorTest()
    {
        plugBox.setPlugs(plugBox.plug1("A", 1), plugBox.plug2("A", 1));
        plugBox.setPlugs(plugBox.plug1("B", 1), plugBox.plug2("B", 1));

        Assertions.assertEquals("Too many tries to enter the plug letter",plugBox.getErrorMessage());
    }

    @Test
    void plugChoicesErrorTest2()
    {
        plugBox.setPlugs(plugBox.plug1("A", 1), plugBox.plug2("B", 1));
        plugBox.setPlugs(plugBox.plug1("A", 1), plugBox.plug2("B", 1));

        Assertions.assertEquals("Too many tries to enter the plug letter",plugBox.getErrorMessage());
    }
}
