
/**
 * This class is used to initialize the whole game board in terms of data.
 */
public class Board {
    private static final int WIDTH = 7;
    private static final int LENGTH = 9;
    /**
     * This is the gameboard of our game,
     * containg 7*9 cells.
     * @see dataCell
     */
    public dataCell[][] board;

    /**
     * Constructor1: this is the constructor for initializing from scratch
     */
    public Board() {
        for (int i = 0; i < WIDTH; i++) {
            for (int k = 0; k < LENGTH; k++) {
                if ((i == 2 && k == 0) || (i == 2 && k == 8) || (i == 3 && k == 1) || (i == 3 && k == 7) || (i == 4 && k == 0)
                        || (i == 4 && k == 8))
                    board[i][k] = new dataCell(i, k, null, Area.TRAP);
                else if ((i == 3 && (k == 0 || k == 8))) board[i][k] = new dataCell(i, k, null, Area.DEN);
                else if ((i >= 2 && i <= 3 && k >= 3 && k <= 5) || (i >= 4 && i <= 5 && k >= 3 && k <= 5))
                    board[i][k] = new dataCell(i, k, null, Area.RIVER);
                else if (i == 0 && k == 0) board[i][k] = new dataCell(i, k, new Tiger(0), Area.NORMAL);
                else if (i == 6 && k == 8) board[i][k] = new dataCell(i, k, new Tiger(1), Area.NORMAL);
                else if (i == 1 && k == 1) board[i][k] = new dataCell(i, k, new Cat(0), Area.NORMAL);
                else if (i == 5 && k == 7) board[i][k] = new dataCell(i, k, new Cat(1), Area.NORMAL);
                else if (i == 0 && k == 2) board[i][k] = new dataCell(i, k, new Elephant(0), Area.NORMAL);
                else if (i == 6 && k == 6) board[i][k] = new dataCell(i, k, new Elephant(1), Area.NORMAL);
                else if (i == 2 && k == 2) board[i][k] = new dataCell(i, k, new Wolf(0), Area.NORMAL);
                else if (i == 4 && k == 6) board[i][k] = new dataCell(i, k, new Wolf(1), Area.NORMAL);
                else if (i == 4 && k == 2) board[i][k] = new dataCell(i, k, new Leopard(0), Area.NORMAL);
                else if (i == 2 && k == 6) board[i][k] = new dataCell(i, k, new Leopard(1), Area.NORMAL);
                else if (i == 5 && k == 1) board[i][k] = new dataCell(i, k, new Dog(0), Area.NORMAL);
                else if (i == 1 && k == 7) board[i][k] = new dataCell(i, k, new Dog(1), Area.NORMAL);
                else if (i == 6 && k == 0) board[i][k] = new dataCell(i, k, new Lion(0), Area.NORMAL);
                else if (i == 0 && k == 8) board[i][k] = new dataCell(i, k, new Lion(1), Area.NORMAL);
                else if (i == 6 && k == 2) board[i][k] = new dataCell(i, k, new Rat(0), Area.NORMAL);
                else if (i == 0 && k == 6) board[i][k] = new dataCell(i, k, new Rat(1), Area.NORMAL);
            }

        }

    }

    /**
     * Constructor2, which is used to initialize a gameboard stored before. The data is stored in a 2D array.
     * @param save a 2D array used to represent the data stored.
     * @see #
     */
    public Board(int save[][]) {
        for (int i = 0; i < WIDTH; i++) {
            for (int k = 0; k < LENGTH; k++) {
                //side and rank uniquely defined an animal
                int side = save[i][k] % 2 == 0 ? 0 : 1;
                int rank = (save[i][k] - side) / 2;
                if ((i == 2 && k == 0) || (i == 2 && k == 8) || (i == 3 && k == 1) || (i == 3 && k == 7) || (i == 4 && k == 0) ||
                        (i == 4 && k == 8)) {
                    switch (rank) {
                        case 0:
                            board[i][k] = new dataCell(i, k, null, Area.TRAP);
                            break;
                        case 1:
                            board[i][k] = new dataCell(i, k, new Rat(side), Area.TRAP);
                            break;
                        case 2:
                            board[i][k] = new dataCell(i, k, new Cat(side), Area.TRAP);
                            break;
                        case 3:
                            board[i][k] = new dataCell(i, k, new Dog(side), Area.TRAP);
                            break;
                        case 4:
                            board[i][k] = new dataCell(i, k, new Wolf(side), Area.TRAP);
                            break;
                        case 5:
                            board[i][k] = new dataCell(i, k, new Leopard(side), Area.TRAP);
                            break;
                        case 6:
                            board[i][k] = new dataCell(i, k, new Tiger(side), Area.TRAP);
                            break;
                        case 7:
                            board[i][k] = new dataCell(i, k, new Lion(side), Area.TRAP);
                            break;
                        case 8:
                            board[i][k] = new dataCell(i, k, new Elephant(side), Area.TRAP);
                            break;
                    }
                } else if ((i == 3 && (k == 0 || k == 8))) {
                    switch (rank) {
                        case 0:
                            board[i][k] = new dataCell(i, k, null, Area.DEN);
                            break;
                        case 1:
                            board[i][k] = new dataCell(i, k, new Rat(side), Area.DEN);
                            break;
                        case 2:
                            board[i][k] = new dataCell(i, k, new Cat(side), Area.DEN);
                            break;
                        case 3:
                            board[i][k] = new dataCell(i, k, new Dog(side), Area.DEN);
                            break;
                        case 4:
                            board[i][k] = new dataCell(i, k, new Wolf(side), Area.DEN);
                            break;
                        case 5:
                            board[i][k] = new dataCell(i, k, new Leopard(side), Area.DEN);
                            break;
                        case 6:
                            board[i][k] = new dataCell(i, k, new Tiger(side), Area.DEN);
                            break;
                        case 7:
                            board[i][k] = new dataCell(i, k, new Lion(side), Area.DEN);
                            break;
                        case 8:
                            board[i][k] = new dataCell(i, k, new Elephant(side), Area.DEN);
                            break;
                    }
                } else if ((i >= 2 && i <= 3 && k >= 3 && k <= 5) || (i >= 4 && i <= 5 && k >= 3 && k <= 5)) {
                    switch (rank) {
                        case 0:
                            board[i][k] = new dataCell(i, k, null, Area.RIVER);
                            break;
                        case 1:
                            board[i][k] = new dataCell(i, k, new Rat(side), Area.RIVER);
                            break;
                    }
                } else {
                    switch (rank) {
                        case 0:
                            board[i][k] = new dataCell(i, k, null, Area.NORMAL);
                            break;
                        case 1:
                            board[i][k] = new dataCell(i, k, new Rat(side), Area.NORMAL);
                            break;
                        case 2:
                            board[i][k] = new dataCell(i, k, new Cat(side), Area.NORMAL);
                            break;
                        case 3:
                            board[i][k] = new dataCell(i, k, new Dog(side), Area.NORMAL);
                            break;
                        case 4:
                            board[i][k] = new dataCell(i, k, new Wolf(side), Area.NORMAL);
                            break;
                        case 5:
                            board[i][k] = new dataCell(i, k, new Leopard(side), Area.NORMAL);
                            break;
                        case 6:
                            board[i][k] = new dataCell(i, k, new Tiger(side), Area.NORMAL);
                            break;
                        case 7:
                            board[i][k] = new dataCell(i, k, new Lion(side), Area.NORMAL);
                            break;
                        case 8:
                            board[i][k] = new dataCell(i, k, new Elephant(side), Area.NORMAL);
                            break;
                    }
                }

            }
        }
    }
}
