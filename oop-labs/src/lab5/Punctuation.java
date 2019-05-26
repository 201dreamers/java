package lab5;

public class Punctuation extends SentenceMember{

    private StringBuilder punct;
    public Punctuation(StringBuilder punct){
    	this.punct = punct;
    }

    public StringBuilder getPunct() {
    	return punct;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Punctuation) {
            return ((Punctuation) obj).punct.equals(punct);
        }
        return false;
    }
}
