package lab5a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private Sentence[] sentences;
    int wordlen;

    public Text(int wordlen, StringBuilder str) {
        this.wordlen = wordlen;
        Splitter spl = new Splitter(str, 's');
        StringBuilder[] split = spl.getSplitedText();
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Text) {
            Text text = (Text) obj;
            if (text.sentences.length == this.sentences.length) {
                for (int i = 0; i < sentences.length; i++) {
                    if (!sentences[i].equals(text.sentences[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void delWords () {
        SentenceMember [] buffArr = new SentenceMember[1];

        for (Sentence sentence : sentences) {
            SentenceMember[] sent = sentence.getSentenceMembers();
            buffArr = sent;
            int len = 0;

            for (int i = 0; i < sentence.getLength(); i++){
                if (sent[i] instanceof Word &&  Pattern.matches("[a-zA-Z&&[^aeyuoiAEYUOI]].{" + (wordlen-1) + "}", sent[i].joinIt())){
                    for(int j = i; j < sentence.getLength()-1; j++){
                        buffArr[j] = buffArr[j + 1];
                    }
                    len++;
                    i = 0;
                }
            }

        }
        for (int i = 0; i < buffArr.length; i++) {
            StringBuilder txt = new StringBuilder(buffArr[i].joinIt());
            Pattern pat = Pattern.compile("[\\s]{2,}");
            Matcher mat = pat.matcher(txt);
            System.out.println(mat.replaceAll(" "));
        }
    }
}
