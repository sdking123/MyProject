public class TicTacToe {
    static char[][] board;
    public TicTacToe(){
        board = new char[3][3];
        initboard();
    }
    void initboard(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j] = ' ';
            }
        }
    }
    static void display(){
        System.out.println("-------------");
        for(int i = 0; i<3; i++){
            System.out.print("| ");
            for(int j = 0; j<3; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }
    static void placemark(int row, int col, char mark){
        if(row>=0 && row<=2 && col >= 0 && col<= 2){
            board[row][col] = mark;
        }else{
            System.out.println("Invalid position");
        }
    }
    static boolean colWin(){
        for(int j = 0; j<3; j++){
            if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]){
                return true;
            }
        }
        return false;
    }
    static boolean rowWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }
    static boolean diagWin() {
            if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                    || (board[2][0] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])){
                return true;
            }
        return false;
    }
    static boolean checkDraw(){
        for(int i = 0; i<=2; i++){
            for(int j =0 ; j<=2; j++){
                if(board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}
