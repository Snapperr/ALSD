package Minggu3.AssignmentPyramid;

public class SquarePyramid {
    private double Length;
    private double height;

    public SquarePyramid(double Length, double height) {
        Length = Length;
        height = height;
    }

    public double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(Length / 2, 2) + Math.pow(height, 2));
        return Length * Length + 2 * Length * slantHeight;
    }

    public double calculateVolume() {
        return (1.0 / 3) * Length * Length * height;
    }
}