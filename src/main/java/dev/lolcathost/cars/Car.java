package dev.lolcathost.cars;

import dev.lolcathost.featuers.License;

public abstract class Car {
    private final License license;
    private final String owner;

    public Car(License license, String owner) {
        this.license = license;
        this.owner = owner;
    }

    public License getLicense() {
        return license;
    }
}
