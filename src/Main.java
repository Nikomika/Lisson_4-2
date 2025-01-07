public class Main {
    public static void main(String[] args) {
        Circle figure1 = new Circle(7);
        figure1.areaOfFigure();
        figure1.perimeterOfFigure();
        figure1.setColorLine("Красный");
        figure1.getColorLine();
        figure1.setColor("Желтый");
        figure1.getColor();
        Triangle figure2 = new Triangle(5,5,8,90);
        figure2.areaOfFigure();
        figure2.perimeterOfFigure();
        figure2.setColorLine("Синий");
        figure2.getColorLine();
        figure2.setColor("Голубой");
        figure2.getColor();
        Rectangle figure3 = new Rectangle(9, 5);
        figure3.areaOfFigure();
        figure3.perimeterOfFigure();
        figure3.setColorLine("Белый");
        figure3.getColorLine();
        figure3.setColor("Черный");
        figure3.getColor();

    }
}