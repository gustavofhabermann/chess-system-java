package boardgame;

public class Piece {
    
    //Não é a posição do chess, mas sim uma posição de matriz
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }    

}
