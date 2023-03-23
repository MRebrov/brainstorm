package org.example;

public class SubWhen extends When {
    @Override
    boolean when() {
        System.out.println("subwhen");
        return true;
    }
}
