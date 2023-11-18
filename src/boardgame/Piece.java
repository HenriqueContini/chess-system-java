package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        // Ao criar uma peça, ela não irá receber nenhuma posição.
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
