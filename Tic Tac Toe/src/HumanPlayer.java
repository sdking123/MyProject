import java.util.Scanner;

public class HumanPlayer extends Player {
    String name;
    char mark;

    HumanPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }
    void makeMove(){
         Scanner sc = new Scanner(System.in);
         int row;
         int col;
         do{
             System.out.println("Enter the Row and Column : ");
             row = sc.nextInt();
             col = sc.nextInt();
         }while(!isValid(row, col));
         TicTacToe.placemark(row,col,mark);
    }

}
