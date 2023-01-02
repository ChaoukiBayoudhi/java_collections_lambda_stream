package Classes.Abstracts;

public class RondeTable extends Table {
    private double radius;

    public RondeTable() {
    }

    public RondeTable(int id, String color, int nbLegs, double radius) {
        super(id, color, nbLegs);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "  RondeTable [radius=" + radius + ", getId()=" + getId() + ", getColor()=" + getColor() + ", getNbLegs()="
                + getNbLegs() + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
