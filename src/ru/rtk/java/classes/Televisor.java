package ru.rtk.java.classes;

public class Televisor {
    private static boolean state;

    private int channel;

    public Televisor() {
        this.state = false;
    }

    public Televisor(boolean state) {
        this.state = state;
    }

    public boolean isWorking() {
        return this.state;
    }

    public int getChannel() {
        return this.channel;
    }

    public void switchChannel(int channel) {
        this.channel = channel;
    }

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    public String toString() {
        return "Televisor{" +
                "state=" + state +
                ", channel=" + channel +
                '}';
    }
}

