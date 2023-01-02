package Classes.Abstracts;

public class RectangleTable extends Table{
    private double length;
    private double width;

    public RectangleTable() {
    }

    public RectangleTable(int id, String color, int nbLegs, double length, double width) {
        super(id, color, nbLegs);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString()+ "  RectangleTable [length=" + length + ", width=" + width + ", getId()=" + getId() + ", getColor()="
                + getColor() + ", getNbLegs()=" + getNbLegs() + "]";
    }

    @Override
    public double getArea() {
        return length * width;
    }



}
