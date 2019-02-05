import java.util.Random;

public interface WordFactory {
    Word makeWord();
}

class DefaultWordFactory implements WordFactory {
    @Override
    public Word makeWord() {
        return new Word("TABLA");
    }
}


class DictWordFactory implements WordFactory {
    @Override
    public Word makeWord() {
        String[] words = new String[]{"ORDENADOR", "MESA", "MACBOOK", "HACKING", "JAVA"};
        Random r = new Random();
        return new Word(words[r.nextInt(words.length)]);
    }
}