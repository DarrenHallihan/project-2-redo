import java.util.*;
public class Main {
    public static int numOfDigits(int num){
        int length = String.valueOf(num).length();  // the length method gives us the number of digits in num
        return length;

    }
    public static char[] toCharArray(int charCount, char strchar){
        char[] finalValue = new char[];
        if (charCount <= 0){
            finalValue = null;
        }
        else if (charCount == 1){
            char[] newCharArray = new char[strchar];
            finalValue = newCharArray;
        }
        else if (charCount >= 1){
            String numString = String.valueOf(charCount);   // returns the string representation of charCount
            String charString = String.valueOf(strchar);    // returns the string representation of strchar
            String finalString = numString.concat(charString);  // combines the two strings
            finalValue = finalString.toCharArray(); // converts the string to a character array

        }

        return finalValue;
    }
    public static int findEncodeLength(String inputString){
        int encodeLength = 0;
        if (inputString == null){
            encodeLength = 0;
        }
        else {
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) != inputString.charAt(i + 1)) {
                    encodeLength++;
                }

            }

        }
        return encodeLength;
    }


    public static int findDecodelength(String rleString){
        int decodeLength = 0;
        for (int i = 0; i < rleString.length(); i++){
            if (Character.isDigit(rleString.charAt(i)) && Character.isDigit(rleString.charAt(i + 1))) {
                String doubleDigit = String.valueOf(i).concat(String.valueOf(i + 1));
                decodeLength += Integer.parseInt(doubleDigit);
                i++;


            }
            else if (Character.isDigit(rleString.charAt(i)) && Character.isLetter(rleString.charAt(i + 1))){
                String singleDigit = String.valueOf(i);
                decodeLength += Integer.parseInt(singleDigit);
                i++;
            }
            else if (Character.isLetter(rleString.charAt(i + 1)) && Character.isLetter(rleString.charAt(i))){
                decodeLength += 1;
                i++;
            }
            else if (Character.isLetter(rleString.charAt(i)) && Character.isDigit(rleString.charAt(i + 1))){
                String letterFirst = String.valueOf(i + 1);
                decodeLength += Integer.parseInt(letterFirst);
                i++;
            }
            else if (Character.isDigit(rleString.charAt(i)) && Character.isDigit(rleString.charAt(i + 1))


        }

    }
    public static void main(String Args[]){
        Scanner userInput = new Scanner(System.in);
        int menuChoice = 0;
        while (menuChoice != 4) {
            System.out.println("What would you like to do?");
            System.out.println("1. Input string to be encoded");
            System.out.println("2. View encoded string");
            System.out.println("3. View decoded string");
            System.out.println("4. Exit program");
            System.out.print("Option:");
            menuChoice = userInput.nextInt();
            if (menuChoice < 1 || menuChoice > 4){
                System.out.println("Error! invalid input");
            }
        }
    }
}
