package Classes;

public class Note {
    private double value;
    private double coefficient;
    public Note() {
    }

    public Note(double value, double coefficient) {
        this.value = value;
        this.coefficient = coefficient;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
}
