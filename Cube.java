package ClassDiagram;

public class Cube {
    public Square[] squares;
    public Double volume;

    public Cube(Square[] squares) {
        this.squares = squares;
    }

    public double getVolume() {
        double volume = this.squares[0].getArea() * this.squares[0].lines[0].getLength();
        return volume;
    }

}
