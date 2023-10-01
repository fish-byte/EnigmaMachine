package EnigmaOneTest;

import java.io.IOException;

import static EnigmaOne.enigmaProcessor.getChoice;

public class RotatorSpinTest
{
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the number on the first spindle: ");
        System.out.println(getChoice(2));
    }
}
