package actividad4;

public class Mesa {
    private String color;
    private int numeroPatas;

    public Mesa(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "El color de la mesa es : " + color + "tiene un total de " + numeroPatas
                + "numero de patas";
    }
}
