public class Circle implements Calculation {
    double radius;
    double pie = 3.14;
    double sideFigure;
    double perimeterFigure;
    String color;
    String colorLine;


    public Circle (double radius) {
        this.radius = radius;
    }
    public void areaOfFigure() {
        sideFigure = (radius*radius*pie);
        System.out.println("Площадь круга равна - " + sideFigure);
    }

    public void perimeterOfFigure() {
        perimeterFigure = (2*radius*pie);
        System.out.println("Длинна окружности равна - " + perimeterFigure);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSideFigure() {
        return sideFigure;
    }

    public void setSideFigure(double sideFigure) {
        this.sideFigure = sideFigure;
    }

    public double getPerimeterFigure() {
        return perimeterFigure;
    }

    public void setPerimeterFigure(double perimeterFigure) {
        this.perimeterFigure = perimeterFigure;
    }

    public void getColor() {
        System.out.println("Цвет фона круга - " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColorLine() {
        System.out.println("Цвет контура круга - " + colorLine);
    }

    public void setColorLine(String colorLine) {
        this.colorLine = colorLine;
    }
}
