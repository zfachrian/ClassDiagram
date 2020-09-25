package ClassDiagram;

public class Triangle {
    public Line[] lines;
    public double area;
    public double heigh;

    public Triangle(Line[] lines) {
        this.lines = lines;
    }

    public double getHeigh() {
        double sisi = this.lines[0].getLength();
        double sisiBawah = this.lines[0].getLength() / 2;
        double heigh = Math.sqrt(Math.pow(sisi, 2) - Math.pow(sisiBawah, 2));
        return heigh;
    }

    public double getArea() {
        double area = 0.5 * this.lines[0].getLength() * this.heigh.getHeigh();
        return area;
    }

}
