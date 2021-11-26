package model;

import java.util.Objects;

public final class Pair {

    private final long unixTime;
    private final int voltage;

    public Pair(long unixTime, int voltage) {
        this.unixTime = unixTime;
        this.voltage = voltage;
    }

    public long getUnixTime() {
        return unixTime;
    }

    public int getVoltage() {
        return voltage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return unixTime == pair.unixTime && voltage == pair.voltage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unixTime, voltage);
    }

    @Override
    public String toString() {
        return "model.Pair{" +
                "unixTime=" + unixTime +
                ", voltage=" + voltage +
                '}';
    }
}