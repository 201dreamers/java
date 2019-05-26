package lab5a;

public class Word extends SentenceMember{
    private Letter[] letters;
    private StringBuilder wordStr;

    public Word(StringBuilder s) {
        //s = s.toLowerCase();
        letters = new Letter[s.length()];
        wordStr = s;
        for (int i = 0; i < s.length(); i++) {
            letters[i] = new Letter(s.charAt(i));
        }
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

    @Override
    public String joinIt(){
        char [] arr = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            arr[i] = letters[i].getLetter();
        }
        return arr.toString();
    }

    //@Override
    //public StringBuilder toString() {
    //    return wordStr;
   // }
}