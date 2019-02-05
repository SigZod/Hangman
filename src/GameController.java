import java.util.Scanner;

public class GameController {
    AlphabetDisplay ad;
    WordDisplay wd;
    Gallows g;


    GameController(AlphabetDisplay ad, WordDisplay wd, Gallows g) {
        this.ad=ad;
        this.wd=wd;
        this.g=g;

    }

    void playGame(Word w) {
        Alphabet a = new Alphabet();

        while (!this.g.isHung() && !w.isGuessed()){
            this.g.display();
            this.wd.display(w);
            this.ad.display(a);

            char c = getInput();
            if (w.doGuess(c)==false){
                g.addPart();
            }
        }

        g.display();
        System.out.println(w.toString());

        if (w.isGuessed()){
            System.out.println(w.toString());
            System.out.println("HAS GUANYAT !! YUPII");
        }else {
            System.out.println("GAME OVER");
        }
    }

    private char getInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Lletra");
        return s.next().toLowerCase().charAt(0);
    }
}
