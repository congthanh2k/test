package cau2c;

public class SinhVien implements IPrintable {

    @Override
    public void print() {
        System.out.println("------STUDENT------");
    }

    @Override
    public void printName() {
        System.out.println("Name: Thanh");
    }

    @Override
    public void printID() {
        System.out.println("ID: A20152");
    }

}
