package EnigmaOneTest;

import java.io.IOException;

import static EnigmaOne.enigmaPlugBox.getPlugs;
import static EnigmaOne.enigmaPlugBox.plugChoice;

public class PlugTest
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Please enter the amount of cables:");
        plugChoice();

        System.out.println(getPlugs());
    }
}
