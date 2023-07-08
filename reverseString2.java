public class reverseString2 {
    public static String reverseEachString(String str) {
        String answer = " ";
        for (int i = 0; i < str.length(); i++) {
            int currentWordStart = 0;
            if (str.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String reverseWord = " ";
                for (int j = currentWordStart; j < currentWordEnd; j++) {
                    reverseWord = str.charAt(j) + reverseWord;
                }
                currentWordStart = i + 1;
            }
        }
        return answer;
    }

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str);
        }
    }

    public static void main(String args[]) {
        String str1 = " abc def ghi ";
        String str2 = reverseEachString(str1);
        printString(str2);
    }

}
