package cau1;

import cau2c.IPrintable;

public class IPrintableT implements IPrintable {

    String name = "Thanh";
    String ID = "A20152";

    public IPrintableT() {
    }

    public IPrintableT(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public void print() {
        System.out.println("----Interface Printable----");
    }

    @Override
    public void printName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void printID() {
        System.out.println("ID: " + ID);
    }

}
