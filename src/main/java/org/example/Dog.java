package org.example;

public class Dog extends Animal {
    static int count;

    public Dog(String name, int maxSwimLength, int maxRunLength) {
        super(name, maxSwimLength, maxRunLength);
        count++;
    }

    @Override
    public void swim(int swimLength) {
        super.swim(swimLength);
    }

    @Override
    public void run(int runLength) {
        super.run(runLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
