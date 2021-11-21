package kalashnikova;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public String swim(int distance) {
        return String.format("%s плавать не умеет.", super.name);
    }

    @Override
    public String run(int distance) {
        return distance > 200
                ? String.format("%s не может так далеко бежать", super.name)
                : super.run(distance);
    }
}
