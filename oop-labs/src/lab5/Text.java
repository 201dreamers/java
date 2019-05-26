package lab5;

public class Text{

    private StringBuilder inputedText;
    private Splitter splitter;
    private StringBuilder[] buff;
    private Sentence[] sentences;

    public Text(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }

    public StringBuilder[] getText(){
        splitter = new Splitter(inputedText, 's');
        return splitter.getSplitedText();
    }

    public StringBuilder joiner(StringBuilder [] arr, int len){
        return splitter.joiner(arr, len);
    }
}
