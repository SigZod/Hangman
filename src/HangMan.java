import java.util.Scanner;

/**
 * Created by pnegre on 04/04/16.
 */
public class HangMan {
    WordFactory wf;

    HangMan(WordFactory wf) {
        this.wf = wf;
    }

    public void play() {
        GameController Gc = new GameController(

                new TextAlphabetDisplay(),
                new TextWordDisplay(),
                new TextGallows()
        );

        Gc.playGame(this.wf.makeWord());
    }

    public static void main(String[] args) {
        WordFactory w = new DictWordFactory();
        HangMan h = new HangMan(w);
        h.play();
    }
}






