package org.example;

public class WhenTest {

    void when() {
        System.out.println("When");
    }

    void whenTest() {

        Object obj = new SubWhen();

        switch (obj) {
            case String s when new When().when() -> System.out.println("empty string");
            case When when1 when when1.when() -> when();
            case SubWhen subWhen when subWhen.when() -> System.out.println("String case");
            default -> {}
        }
    }

    public static void main(String[] args) {
        WhenTest whenTest = new WhenTest();
        whenTest.whenTest();
    }
}
