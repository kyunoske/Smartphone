package model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Smartphone implements Radio, getPosition {

    private String model;
    private String manufacturer;

    public Contact[] contacts;

    public Smartphone(String model, String manufacturer, Contact[] contacts) {
        super();
        this.model = model;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean startRadio() {
        return true;
    }

    @Override
    public boolean stopRadio() {
        return true;
    }

    @Override
    public String getPosition() {
        return "Koln";
    }

    public String radioStatusOn() {
        boolean radioOn = startRadio();
        String gps = getPosition();

        if (radioOn) {
            return "radio started and your location is in " + gps;
        } else {
            return "radio stopped and your location is in " + gps;
        }
    }

    public String radioStatusOff() {
        boolean radioOff = stopRadio();
        String gps = getPosition();

        if (radioOff) {
            return "radio stopped and your location is in " + gps;
        } else {
            return "radio started and your location is in " + gps;
        }
    }

    public String gpsLocation() {
        String gps = getPosition();
        return gps;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
