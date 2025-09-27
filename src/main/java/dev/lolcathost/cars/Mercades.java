package dev.lolcathost.cars;

import dev.lolcathost.featuers.License;

public class Mercades extends Car{
    private final String cclass;

    public Mercades(License license, String owner, String cclass) {
        super(license, owner);
        this.cclass = cclass;
    }

    /**
     * @return {@link Mercades#cclass}
     */
    public String getCarClass() {
        return cclass;
    }
}
