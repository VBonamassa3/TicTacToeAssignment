import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean replay = true;

        while(replay){
            TicTacToe game = new TicTacToe();
            game.playGame();

            System.out.println("Start a new game?: (yes/no)");
            String response = scanner.nextLine();

            if(response.equals("no")){
                replay = false;
            }
        }
        scanner.close();
    }
}