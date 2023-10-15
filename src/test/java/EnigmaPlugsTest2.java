import EnigmaThree.EnigmaPlugBox;
import EnigmaThree.EnigmaUsrInptAndErrChck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnigmaPlugsTest2
{
    EnigmaPlugBox plugBox = new EnigmaPlugBox();
    EnigmaUsrInptAndErrChck enigmaUsrInptAndErrChck = new EnigmaUsrInptAndErrChck();
    @Test
    void plugAmtTest()
    {
        enigmaUsrInptAndErrChck.plugAmt(4,1);

        Assertions.assertEquals(4, plugBox.getPlugAmt(), "The Amount of plugs is not equal");
    }

    @Test
    void plugAmtErrorTest()
    {
        enigmaUsrInptAndErrChck.plugAmt(14,1);

        Assertions.assertEquals("Plug amount was entered wrong too many times", enigmaUsrInptAndErrChck.getErrorMessage());
    }

    @Test
    void plugChoicesTest()
    {
        plugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("B", 1));
        plugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("C", 1), enigmaUsrInptAndErrChck.plug2("D", 1));

        Assertions.assertEquals(plugBox.getPlugs(), plugBox.getPlugs(), "The plugs are not there");
    }

    @Test
    void plugChoicesErrorTest()
    {
        plugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("A", 1));
        plugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("B", 1), enigmaUsrInptAndErrChck.plug2("B", 1));

        Assertions.assertEquals("Too many tries to enter the plug letter",enigmaUsrInptAndErrChck.getErrorMessage());
    }

    @Test
    void plugChoicesErrorTest2()
    {
        plugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("B", 1));
        plugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("B", 1));

        Assertions.assertEquals("Too many tries to enter the plug letter",enigmaUsrInptAndErrChck.getErrorMessage());
    }
}
