public class Rectangle implements Calculation{
    double sideOfA;
    double sideOfB;
    double sideFigure;
    double perimeterFigure;
    String color;
    String colorLine;

    public Rectangle (double sideOfA, double sideOfB) {
        this.sideOfA = sideOfA;
        this.sideOfB = sideOfB;
    }
    public void areaOfFigure() {
        sideFigure = (sideOfA*sideOfB);
        System.out.println("Площадь пряоугольника равна - " + sideFigure);
    }

    public void perimeterOfFigure() {
        perimeterFigure = ((2*sideOfA) + (2*sideOfB));
        System.out.println("Периметр прямоугольника равен - " + perimeterFigure);
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

    public void getColor() {
        System.out.println("Цвет фона прямоугольника - " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColorLine() {
        System.out.println("Цвет контура прямоугольника - " + colorLine);
    }

    public void setColorLine(String colorLine) {
        this.colorLine = colorLine;
    }
}
