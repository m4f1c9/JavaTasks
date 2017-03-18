package task02;

public class Main {

    public static void main(String[] args) {
        String[] testArray
                = {"    xxx,    xx x   x", "xxxxxxx", "xxxxxxx.    ", "xxx,xxxx", "xxx,xxxx", "........", "... xxx...  "};
        WordCounter wordCounter = new WordCounter();
        for (String str : testArray) {
            wordCounter.countWords(str);
        }

    }

}
