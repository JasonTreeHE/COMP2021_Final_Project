package model;
/**
 * This class is a subclass of piece, corresponding to a rat
 * in the gameboard.
 */
public class Rat extends Piece {
    private static final int _rank = 1;
    /**
     * Constructor.
     *
     * @param side indicates which user it belongs to
     */
    public Rat(int side) {
        super(side, "rat");
        rank = _rank;
    }
    /**
     * @return static rank value of a specific piece
     */
    public static int getrank() {
        return _rank;
    }
    /**
     * a rat can move into water. when it goes into water,
     * we set its property isinWater to true.
     */
    private void setInWater(){
        this.isInWater = true;
    }
    /**
     * override the method of superclass
     * By a series of comparison including rank, isinTrap,isinWater,
     * judges whether it can eat another piece from the other side
     * @param other another piece
     * @return true for being able to eat, vice versa.
     */
    @Override
    public boolean ableToCapture(Piece other) {
        boolean ability = false;
        if (this.isSameSide(other)) ability = false;
        else if (this.isInWater && other.isInWater) ability = true;
        else ability = (other.getRank() == this.rank || other.isInTrap || other.getRank() == 8);
        return ability;
    }
}
