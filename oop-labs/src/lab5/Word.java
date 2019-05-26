package lab5;

public class Word extends SentenceMember {

    private StringBuilder inputedText;
    private Splitter splitter;
    private StringBuilder[] buff;
    private Letter[] letters;

    public Word(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }
    


    public StringBuilder[] getWords(){

        splitter = new Splitter(inputedText, 'l');
        return splitter.getSplitedText();
	}

    public StringBuilder joiner(StringBuilder [] arr, int len){
        return splitter.joiner(arr, len);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Word) {
            Word word = (Word) obj;
            if (letters.length == word.letters.length) {
                for (int i = 0; i < letters.length; i++) {
                    if (!letters[i].equals(word.letters[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
