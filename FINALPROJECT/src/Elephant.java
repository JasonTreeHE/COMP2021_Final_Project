/**
 * This class is a subclass of piece, corresponding to an elephant
 *  in the gameboard.
 */
public class Elephant extends Piece {
    private static final int _rank = 8;
    /**
     * Constructor.
     * @param side indicates which user it belongs to
     */
    public Elephant( int side){

        super(side,"elephant");
        rank = _rank;
        index = 2*rank-1;

    }
    /**
     *
     * @return static rank value of a specific piece
     */
    public static int getrank(){
        return _rank;
    }
    /**
     * overrides the method of piece because elephant cannot eat rat
     * @param other another piece
     * @return true for being able to eat,vice versa
     */
    @Override
    public boolean ableToCapture(Piece other) {
        boolean ability = false;
        if(this.isSameSide(other)) ability = false;
        else if( (other.getRank() <= this.rank && other.getRank() != 1)||(other.isInTrap) )
            ability =  true;
        return ability;

    }
}
