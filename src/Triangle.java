import java.lang.Math;

public class Triangle implements Calculation {
    double sideOfA;
    double sideOfB;
    double sideOfC;
    double angleDegree;
    double sideFigure;
    double perimeterFigure;
    String color;
    String colorLine;

    public Triangle (double sideOfA, double sideOfB, double sideOfC, double angleDegree ) {
        if (angleDegree < 180) {
            this.sideOfA = sideOfA;
            this.sideOfB = sideOfB;
            this.angleDegree = angleDegree;
        } else {
            System.out.println("Нельзя создать такой треугольник");
        }
    }
    public void areaOfFigure() {
        sideFigure = (0.5*sideOfA*sideOfB*Math.sin(angleDegree));
        System.out.println("Площадь треугольника равна - " + sideFigure);
    }

    public void perimeterOfFigure(double sideOfA, double sideOfB, double sideOfC) {
        System.out.println("Периметр треугольника равен - " + (sideOfA+sideOfB+sideOfC));
    }

    public double getSideOfA() {
        return sideOfA;
    }

    public void setSideOfA(double sideOfA) {
        this.sideOfA = sideOfA;
    }

    public double getSideOfB() {
        return sideOfB;
    }

    public void setSideOfB(double sideOfB) {
        this.sideOfB = sideOfB;
    }

    public double getAngleDegree() {
        return angleDegree;
    }

    public void setAngleDegree(double angleDegree) {
        this.angleDegree = angleDegree;
    }

    public void getColor() {
        System.out.println("Цвет фона треугольника - " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColorLine() {
        System.out.println("Цвет контура треугольника - " + colorLine);
    }

    public void setColorLine(String colorLine) {
        this.colorLine = colorLine;
    }
}
