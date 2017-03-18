package task02;

public class WordCounter {

    public void countWords(String in) {
        int letterCount = 0;
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < in.length(); i++) {
            if (isletter(in.charAt(i))) {
                letterCount++;
                isWord = true;
            } else if (isWord) {
                wordCount++;
                isWord = false;
            }

        }
        if (isWord) {
            wordCount++; // Проверка последнего слова
        }
        System.out.println("Строка :" + in);
        System.out.println("Букв :" + letterCount);
        System.out.println("Слов :" + wordCount);
        System.out.println();
    }

    private boolean isletter(char ch) {
        switch (ch) {
            case ' ':
            case '\t':
            case '\r':
            case '\n':
            case '.':
            case ',':
            case '-':
            case ':':
            case ';':
                return false;
            default:
                return true;

        }
    }

}
