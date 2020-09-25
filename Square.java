package ClassDiagram;

public class Square {
    public Line[] lines;
    public double area;

    public Square(Line[] lines) {
        this.lines = lines;
    }

    public double getArea() {
        double area = this.lines[0].getLength() * this.lines[0].getLength();
        return area;
    }

}
