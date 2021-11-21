package kalashnikova;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public String swim(int distance) {
        return distance > 10
                ? String.format("%s не может так далеко плавать", super.name)
                : super.swim(distance);
    }

    @Override
    public String run(int distance) {
        return distance > 500
                ? String.format("%s не может так далеко бежать", super.name)
                : super.run(distance);
    }
}