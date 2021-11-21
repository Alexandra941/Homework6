package kalashnikova;

public class Animal implements IAnimalActions {
    protected String name;

    Animal (String name) {
        this.name = name;
    }

    public String swim(int distance) {
        return String.format("%s плывет %d м.", name, distance);
    }

    public String run (int distance) {
        return String.format("%s бежит %d м.", name, distance);
    }
}
