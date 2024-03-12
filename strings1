public class ReplaceCharAtIndex {
    public static void main(String[] args) {
        String originalString = "Programming";
        int index = 4; 
        char newChar = 'A'; 

        String modifiedString = replaceCharAtIndex(originalString, index, newChar);
        
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char charToReplace) {
        if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index.");
            return str; 
        }
        String beforeIndex = str.substring(0, index);
        String afterIndex = str.substring(index + 1);
        return beforeIndex + charToReplace + afterIndex;
    }
}
