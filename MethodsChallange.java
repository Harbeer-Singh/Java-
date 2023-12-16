public class MethodsChallange {
    public static int score;
    public static int n;

    public static void main(String[] args) {
        calculateHighScorePosition(20000);
        displayHighScorePosition("Harbeer");
        

    }

    public static void calculateHighScorePosition(int score) {

        if (score < 100) {

            n = 4;
        } else if (score >= 100 && score < 500) {
            n = 3;

        } else if (score >= 500 && score < 1000) {
            n = 2;

        } else if (score >= 1000) {
            n = 1;

        } else
            System.out.println("wrong choice");

    }

    public static void displayHighScorePosition(String name) {
        System.out.println("\n\n" + name + " managed to get into position " + n+ " on the high score list\n\n ");

    }
}
