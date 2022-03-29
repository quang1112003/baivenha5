package session5.lab2;

import java.util.Scanner;

public class ThongtinKhachhang {
    String makhachhang;
    String hoten;
    String ngayhoadon;
    int soluong;

    Scanner scanner = new Scanner(System.in);
    public void nhapThongTinKhachHang() {
        System.out.print("Nhập tên khách hàng: ");
        hoten = scanner.nextLine();
        System.out.print("Nhập mã khách hàng khách hàng: ");
        makhachhang = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        soluong = scanner.nextInt();
        scanner.nextLine();
    }

    public void hienThiThongTinKhachHang() {
        System.out.println("Mã khách hàng: " +makhachhang);
        System.out.println("Tên chủ hộ: " + hoten);
        System.out.println("Số lượng: " +soluong);
    }
}



