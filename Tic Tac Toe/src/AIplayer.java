import java.util.Random;
import java.util.Scanner;

public class AIplayer extends Player{
    AIplayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }
    void makeMove(){
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        do{
            Random r = new Random();
            row = r.nextInt(3);
            col = r.nextInt(3);
        }while(!isValid(row, col));
        TicTacToe.placemark(row,col,mark);
    }
}
