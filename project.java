import java.util.Scanner;

class Guesser {

    int Numguess;

    public int GuesserNum() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Guesser number");
        Numguess = s.nextInt();
        return Numguess;
    }

}

class Player {

    int guessPlayer;

    public int GuessPlayer() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter player Number ");

        guessPlayer = s.nextInt();
        return guessPlayer;

    }
}
   //Upmpire compare value from Guesser and Players
class Umpire {
    int NumFromGuesser;
    int NumFromPlayer1;
    int NumFromPlayer2;
    int NumFromPlayer3;

    public void CalllingFromGuesser() {
        Guesser g = new Guesser();
        NumFromGuesser = g.GuesserNum();
    }

    public void CallingFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        NumFromPlayer1 = p1.GuessPlayer();
        NumFromPlayer2 = p2.GuessPlayer();
        NumFromPlayer3 = p3.GuessPlayer();
    }

    public void compair() {

        if (NumFromGuesser == NumFromPlayer1) {
            System.out.println("Player 1 won the game");

        } else if (NumFromGuesser == NumFromPlayer2) {
            System.out.println("Player2 won the game");
        } else if (NumFromGuesser == NumFromPlayer3) {
            System.out.println("Player3 won the game");
        } else {
            System.out.println("Nobody won game");
        }

    }
}

class Launch {

    public static void main(String[] args) {

        Umpire u = new Umpire();
        u.CalllingFromGuesser();
        u.CallingFromPlayer();
        u.compair();

    }
}