public abstract class Gallows {
    int pointsLeft = 5;

    void display() {
        System.out.printf("Gallows: Points left %d\n", pointsLeft);
    }

    void addPart() {
        pointsLeft--;
    }

    boolean isHung() {
        return pointsLeft <= 0;
    }
}


class TextGallows extends Gallows {
    void display() {
        switch (this.pointsLeft){
            case 5:
                System.out.println("|-------|");
                System.out.println("|       ");
                System.out.println("|       ");
                System.out.println("|      ");
                System.out.println("|       ");
                System.out.println("/\\    ");
                break;
            case 4:
                System.out.println("|-------|");
                System.out.println("|       |");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("/\\      ");
                break;
            case 3:
                System.out.println("|-------|");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("/\\      ");
                break;
            case 2:
                System.out.println("|-------|");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|        ");
                System.out.println("/\\      ");
                break;
            case 1:
                System.out.println("|-------|");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|       |");
                System.out.println("/\\      ");
                break;
            case 0:
                System.out.println("|-------|");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|       |");
                System.out.println("/\\    / \\");
                break;
        }
    }
}