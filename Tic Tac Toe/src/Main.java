// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        Player P1 = new HumanPlayer("P1", 'X');
        Player P2 = new AIplayer("P2", 'O');
        Player cp;
        cp = P1;
        while (true){
            System.out.println(cp.name + "'s turn:");
            cp.makeMove();
            TicTacToe.display();
            if(TicTacToe.colWin() || TicTacToe.rowWin() || TicTacToe.diagWin()){
                System.out.println(cp.name + " won the match");
                break;
            }else if(TicTacToe.checkDraw()) {
                System.out.println("Game is Draw");
                break;
            }else {
                if(cp == P1){
                    cp = P2;
                }else{
                    cp = P1;
                }
            }
        }
    }
}