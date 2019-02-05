

public class Word {
    String s;
    char[] ar;

    Word(String s) {
        this.s=s.toLowerCase();
        ar = new char[s.length()];
        for (int i =0; i<s.length();i++){
            ar[i]= '_';
        }
    }

    public String toString() {
        String r = "";
        for(int i =0;i<s.length();i++){
            r = r + this.ar[i] + " ";
        }
        return r;
    }

    boolean isGuessed() {
        for (int i=0;i<s.length();i++){
            if (this.ar[i] == '_') return false;
        }
        return true;

    }

    boolean doGuess(char c) {
        boolean b = false;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i) == c) {
                ar[i] = c;
                b = true;
            }

        }
        return b;
    }
}


