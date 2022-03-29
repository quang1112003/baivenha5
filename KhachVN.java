package session5.lab2;

public class KhachVN extends ThongtinKhachhang{
    String doituong;
    public void Nhap() {
        System.out.println("Nhập thông tin khách Việt Nam: ");
        super.nhapThongTinKhachHang();
        System.out.println("Nhập đối tượng: ");
        doituong = scanner.next();
    }
    public void In() {
        super.hienThiThongTinKhachHang();
        System.out.println("Đối tượng khách hàng:"+doituong);
    }


}

