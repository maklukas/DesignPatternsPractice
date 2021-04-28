package builder.checkers;

public class FigureFactory {
    public static String PAWN = "PAWN";
    public static String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureType, String color) {
        if (figureType.equals(PAWN)) {
            return new Pawn(color);
        } else if (figureType.equals(QUEEN)) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("Type of figure should be Pawn or Queen!");
        }
    }
}
