
import EnigmaTwo.enigmaPlugBox;
import EnigmaTwo.enigmaUsrInptAndErrChck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class enigmaPlugsTest extends enigmaPlugBox
{
    @Test
    void plugAmtTest()
    {
        enigmaUsrInptAndErrChck.plugAmt(4);

        Assertions.assertEquals(4, enigmaPlugBox.getPlugAmt(), "The Amount of plugs is not equal");
    }

    @Test
    void plugChoicesTest()
    {
        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("B", 1));
        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("C", 1), enigmaUsrInptAndErrChck.plug2("D", 1));

        Assertions.assertEquals(enigmaPlugBox.plugMap, enigmaPlugBox.getPlugs(), "The plugs are not there");
    }

    @Test
    void plugChoicesTest2()
    {
        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("A", 1), enigmaUsrInptAndErrChck.plug2("A", 1));
        enigmaPlugBox.setPlugs(enigmaUsrInptAndErrChck.plug1("B", 1), enigmaUsrInptAndErrChck.plug2("B", 1));

        Assertions.assertTrue(enigmaPlugBox.plugMap.containsValue("Error"));
    }
}
