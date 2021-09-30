package cau1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner tt = new Scanner(System.in);
        SinhVien sv = new SinhVien();

        System.out.print("Nhap ma so sinh vien: ");
        int mssv = tt.nextInt();
        sv.setMssv(mssv);
        tt.nextLine();

        System.out.print("Nhap ten: ");
        String ten = tt.nextLine();
        sv.setTen(ten);

        System.out.print("Nhap nam sinh: ");
        int nam = tt.nextInt();
        sv.setNam(nam);
        tt.nextLine();

        System.out.print("Nhap dia chi: ");
        String diachi = tt.nextLine();
        sv.setDiachi(diachi);

        System.out.println("--------TT SINH VIEN--------");
        System.out.println("Mssv: " + sv.getMssv());
        System.out.println("Ten: " + sv.getTen());
        System.out.println("Nam sinh: " + sv.getNam());
        System.out.println("Dia chi: " + sv.getDiachi());
   
    }
}
