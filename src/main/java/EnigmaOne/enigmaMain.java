package EnigmaOne;

import java.io.IOException;

import static EnigmaOne.enigmaProcessor.processor;

public class enigmaMain
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Please choose 3 spindles between 1 - 5");
        System.out.println("Please enter first spindle: ");
        enigmaUserInput.setRotatorOne();
        System.out.println("Please enter second spindle: ");
        enigmaUserInput.setRotatorTwo();
        System.out.println("Please enter third spindle: ");
        enigmaUserInput.setRotatorThree();

        System.out.println("Please enter the number on the first spindle: ");
        enigmaUserInput.setRotatorOneOption();

        System.out.println("Please enter the number on the second spindle: ");
        enigmaUserInput.setRotatorTwoOption();

        System.out.println("Please enter the number on the third spindle: ");
        enigmaUserInput.setRotatorThreeOption();

        System.out.println("Please enter the amount of cables:");
        enigmaPlugBox.plugChoice();

        System.out.println("Please Type a word: ");
        processor();
    }

}
