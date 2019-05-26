package lab5a;

class Punctuation extends SentenceMember{
    private StringBuilder symbols;

    public Punctuation(StringBuilder symbols) {
        this.symbols = symbols;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Punctuation) {
            return ((Punctuation) obj).symbols.equals(symbols);
        }
        return false;
    }

    @Override
    public String joinIt(){
        return symbols.toString();
    }
}
