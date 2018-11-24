/**
 * This class defines one unit of gameboard.
 * Contains: the location of unit, the piece on that unit(if not, null)
 * also contains the property of that cell
 */
public class dataCell {
    private final int x;
    private final int y;
    private Piece animal;
    private final Area area;
    /**
     * Constructor of one unit
     * @param x the x coordinate
     * @param y the y coordinate
     * @param animal the piece at that location
     * @param area the property of that unit
     * @see Area
     * @see Piece
     */
    public dataCell(int x, int y, Piece animal, Area area){
        this.x = x;
        this.y = y;
        this.animal = animal;
        this.area = area;
    }
    /**
     *
     * @return the x coordinate of that cell
     */
    public int getX(){
        return x;
    }
    /**
     *
     * @return the y coordinate of that cell
     */
    public int getY(){
        return y;
    }
    /**
     *
     * @return the piece at that location
     * @see Piece
     */
    public Piece getPiece(){
        return animal;
    }
    /**
     * assign another piece at the location
     * @param p
     * @see  Piece
     */
    public void setPiece(Piece p){
        this.animal = p;
    }
    /**
     *
     * @return the property of that cell
     * @see  Area
     */
    public Area getArea(){
        return area;
    }

}
