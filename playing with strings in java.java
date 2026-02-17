public class Main {
    public static void main(String args[]) {
        String text = "Adventure";
        // TODO: Check the length using length() and print the length
        // TODO: Get the character at position 3 and print the character        
        // TODO: Get a part of the String from position 1 to 4 and print the string
        int sinewlength = text.length();
        char characterPositionTres = text.charAt(3);
        String characterPositionUnobisquatro =  text.substring(1,4);
        String anotherText= "Adventure";
        System.out.println("String length: \"" + sinewlength + "\"");
        System.out.println("Character at position 3: \"" + characterPositionTres + "\"");
        System.out.println("String from position 1 to 4: \"" + characterPositionUnobisquatro + "\"");
        

        // TODO: Compare text with anotherText using equals() and print the output
        // TODO: Change to uppercase using toUpperCase() and print the converted string
        // TODO: Change to lowercase using toLowerCase() and print the converted string
        // TODO: Check if it contains "vent" using contains() and print the output
        // TODO: Replace 'e' with 'a' and print the output
        String theSecondText = "Whip";
        String textInUpperCase = text.toUpperCase();
        String textInLowerCase = text.toLowerCase();
        boolean hasVent = text.contains("vent");
        String textWithLetter_E_replacedWith_A = text.replace('e','a');
        
        boolean result1 = text.equals(theSecondText);

        

        System.out.println("Using equals() method \"" +  text + "\" is equal to \"" + theSecondText + "\": " + result1);
        System.out.println("Text in UpperCase is \"" +  textInUpperCase + "\" and in lower case is \"" + textInLowerCase);
        System.out.println("The text \"" + text + "\" contains the substring \"vent\": " + hasVent);
        System.out.println("The text \"" + text + "\" with character \"e\" replaced with character \"a\": " + textWithLetter_E_replacedWith_A);
    
    }
}