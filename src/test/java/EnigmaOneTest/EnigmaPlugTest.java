package EnigmaOneTest;

import java.io.IOException;

import static EnigmaOne.enigmaPlugBox.plugChoice;
import static EnigmaOne.enigmaProcessor.processor;

public class EnigmaPlugTest
{
    public static void main (String[] args) throws IOException {
        System.out.println("Please enter the amount of cables:");
        plugChoice();

        System.out.println("Please Type a word: ");
        processor();
    }

}
