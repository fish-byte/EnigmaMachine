package EnigmaOneTest;

import java.io.IOException;

import static EnigmaOne.enigmaPlugBox.plugChoice;
import static EnigmaOne.enigmaProcessor.processor;
import static EnigmaOne.enigmaUserInput.*;

public class CheckInputsTest
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Please choose 3 spindles between 1 - 5");
        System.out.println("Please enter first spindle: ");
        setRotatorOne();
        System.out.println("Please enter second spindle: ");
        setRotatorTwo();
        System.out.println("Please enter third spindle: ");
        setRotatorThree();

        System.out.println("Please enter the number on the first spindle: ");
        setRotatorOneOption();

        System.out.println("Please enter the number on the second spindle: ");
        setRotatorTwoOption();

        System.out.println("Please enter the number on the third spindle: ");
        setRotatorThreeOption();

        System.out.println("Please enter the amount of cables:");
        plugChoice();

        System.out.println("Please Type a word: ");
        processor();
    }
}
