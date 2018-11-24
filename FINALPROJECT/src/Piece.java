/**
 * This class is about different kinds of animals in
 * the gameboard.
 */
public class Piece{
    /**
     * rank refers to the relation indicating whether an animal
     * can eat another animal
     */
    protected int rank;
    /**
     * true for in water, false for not in water(by defalut)
     */
    public boolean isInWater = false;


    /**
     * side refers to the user an animal belongs to
     * 0 for one user, 1 for another user
     */
    private final int side; // 0 or 1

    /**
     * the name of this piece
     */
    private final String name;

    protected boolean isInTrap = false;
    /**
     * Constructor
     * @param side this represents the user that the pieces belong to
     * @param name the name of pieces
     */
    Piece( int side, String name) {
        this.side = side;
        this.name = name;
    }


    /**
     * gets which user the piece belongs to
     * @return an integer indicating the user that piece belongs to
     */

    public int getSide(){
        return side;
    }

    /**
     *
     * @return the dynamic rank value (after instantiation )
     */
    public int getRank(){return  rank ;}

    /**
     * @return the name of this piece
     */
    public String getName(){return name;}



    /**
     * judges whether two pieces belongs to one user
     * @param other the other piece
     * @return boolean value(if two pieces from one user, true
     * vice versa )
     */
    public boolean isSameSide(Piece other) {
        return this.getSide() == other.getSide();
    }

    /**
     * general method to judge whether this piece can eat another
     * @param other another piece
     * @return true for being able to eat,vice versa
     */
    public boolean ableToCapture(Piece other){
        boolean ability = false;
        if(this.isSameSide(other)) ability = false;
        else if (this.getRank() >= other.getRank() || other.isInTrap) ability = true;
        return ability;

    }










}
