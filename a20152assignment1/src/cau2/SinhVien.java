package cau2;

import java.util.Scanner;

public class SinhVien extends ConNguoi {

    private int mssv;
    private String email;

    public SinhVien() {
        super();
    }

    public SinhVien(int mssv, String email) {
        this.mssv = mssv;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public void nhapThogtin() {
        Scanner sv = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien: ");
        mssv = sv.nextInt();
        sv.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        ten = sv.nextLine();
        System.out.print("Nhap nam sinh: ");
        namsinh = sv.nextInt();
        sv.nextLine();
        System.out.print("Nhap dia chi: ");
        diachi = sv.nextLine();
        System.out.print("Nhap dia chi Email: ");
        email = sv.nextLine();
        System.out.println("--------------------------------");

    }

    public void hienThi() {
        System.out.println("Ma so sinh vien: " + mssv);
        System.out.println("Ten: " + ten);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Dia chi Email: " + email);
        System.out.println("--------------------------------");
    }

}
