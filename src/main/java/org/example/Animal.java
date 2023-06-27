package org.example;

public class Animal {
    private final int maxSwimLength;
    private final int maxRunLength;
    static int count;
    String name;

    public Animal(String name, int maxSwimLength, int maxRunLength) {
        this.maxSwimLength = maxSwimLength;
        this.maxRunLength = maxRunLength;
        this.name = name;
        count++;
    }

    public void swim(int swimLength) {
        if (!(swimLength > maxSwimLength)) {
            System.out.println(name + " пробежал " + swimLength + " м");
        }
    }

    public void run(int runLength) {
        if (!(runLength > maxRunLength)) {
            System.out.println(name + " пробежал " + runLength + " м");
        }
    }

    @Override
    public String toString() {
        return name + "{" +
                "maxSwimLength=" + maxSwimLength +
                ", maxRunLength=" + maxRunLength +
                '}';
    }
}
