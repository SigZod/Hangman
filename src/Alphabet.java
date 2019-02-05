public class Alphabet {

    int  [] ar = new int['z' - 'a' + 1];

    public boolean isUsed(char c) {
        int i = c - 'a';
        if (ar[c] ==0){
            return false;
        }
        return true;
    }

    public boolean doGuess(char c) {
        if (this.isUsed(c))
            return true;
            ar[charToLower(c) - 'a' ] = 1;
            return false;
    }

    private char charToLower(char c) {
        if ('a' <= 'c' && 'c' <= 'z') {
            return c;
        }
        if ('A' <= c && c <= 'Z') {
            return (char) (c - 'A' + 'a');
        }

        //Esto se pone cuando se ha llegado a un punto en el cual no se puede seguir
        throw new RuntimeException();
    }
}


interface AlphabetDisplay {
    void display(Alphabet a);
}

class TextAlphabetDisplay implements AlphabetDisplay {
    public void display(Alphabet a) {
    }
}