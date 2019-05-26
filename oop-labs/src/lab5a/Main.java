package lab5a;

public class Main {
    public static void main(String[] args){
        final int wordlen = 4;
        if (wordlen <= 0){
            System.out.println("<wordlen> is equal 0. Please change it and restart this program.\n Exiting...");
            System.exit(1);
        }

        Text text = new Text(wordlen, new StringBuilder("asasasassassasa Welcome to the classic town children literature! There are charming quiet town on Mississippi river, sunny and green valley, simple and touching people, the atmosphere of game and romance. Such are Sawyer’s adventures – a harmonious and happy book for the children. But is it really for children? The author Mark Twain assured readers that this book was created for adult and can be interesting only for them."));
        text.delWords();
    }
}
