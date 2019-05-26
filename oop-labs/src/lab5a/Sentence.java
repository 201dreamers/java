package lab5a;

public class Sentence {
    private SentenceMember[] sentenceMembers;

    public Sentence(StringBuilder str) {
        Splitter spl = new Splitter(str, 'm');
        StringBuilder[] split = spl.getSplitedText();
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(".") || split[i].equals(",") || split[i].equals("!") || split[i].equals("?")) {
                sentenceMembers[i] = new Punctuation(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sentence) {
            Sentence sentence = (Sentence) obj;
            if (sentence.sentenceMembers.length == sentenceMembers.length) {
                for (int i = 0; i < sentenceMembers.length; i++) {
                    if (!sentenceMembers[i].equals(sentence.sentenceMembers[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public SentenceMember[] getSentenceMembers(){
        return sentenceMembers;
    }

    public int getLength(){
        return sentenceMembers.length;
    }

    public String toStr(){
        String [] arr = new String[sentenceMembers.length];
        for (int i = 0; i < sentenceMembers.length; i++) {
            arr[i] = sentenceMembers[i].joinIt();
        }
        return arr.toString();
    }
}
