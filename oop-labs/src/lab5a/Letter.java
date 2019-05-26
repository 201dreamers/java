package lab5a;

public class Letter {
    private char chr;

    public Letter(char chr) {
        this.chr = chr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letter) {
            return ((Letter)obj).chr == chr;
        }
        return false;
    }

    public char getLetter(){
        return chr;
    }
}
