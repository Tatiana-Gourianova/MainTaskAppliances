package by.tc.task01.entity;

import java.util.Objects;

public abstract class Appliance {

    public enum ApplianceType {
        OVEN,
        LAPTOP,
        REFRIGERATOR,
        SPEAKERS,
        TABLET_PC,
        VACUUM_CLEANER
    }

    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Appliance() {
    }

    public Appliance(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return id == appliance.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}