public interface Calculation {

    public void areaOfFigure();

    public default void perimeterOfFigure(double sideOfA,double sideOfB) {
    }
    public default void perimeterOfFigure(double sideOfA, double sideOfB, double sideOfC) {

    }
}
