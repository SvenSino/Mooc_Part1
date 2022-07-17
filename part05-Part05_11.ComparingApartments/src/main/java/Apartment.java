
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int diff = compared.princePerSquare * compared.squares - this.princePerSquare * this.squares;
        if (diff > 0) {
            return diff;
        }
        return diff * -1;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (compared.princePerSquare * compared.squares < this.princePerSquare * this.squares) {

            return true;
        }
        return false;
    }

}
