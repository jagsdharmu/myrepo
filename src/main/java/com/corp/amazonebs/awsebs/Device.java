package com.corp.amazonebs.awsebs;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Device implements Serializable{
    private String vendor;
    private String model;
    private String make;

    public Device(String vendor, String model, String make) {
        this.vendor = vendor;
        this.model = model;
        this.make = make;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
