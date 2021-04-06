package by.academy.factory;

public enum TypeStudent {
    ONE,
    TWO,
    THREE;


    public static TypeStudent getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}