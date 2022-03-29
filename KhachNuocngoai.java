package session5.lab2;

public class KhachNuocngoai extends ThongtinKhachhang{
    String quoctich;
    int Bill;
    public void insert(){
        System.out.println("Nhập thông tin khách nước ngoài:");
        super.nhapThongTinKhachHang();
        System.out.println("nhập quốc tịch: ");
        quoctich = scanner.nextLine();
    }
    public void clientin4() {
        super.hienThiThongTinKhachHang();
        System.out.println("quốc tịch là "+ quoctich);
    }

    public void bill() {
        if (soluong<50){
            Bill = soluong * 1000;
            System.out.println("đơn giá là: "+Bill);
        }
        else if(soluong >= 50 && soluong <100) {
            Bill = soluong * 1200;
            System.out.println("đơn giá là: "+Bill);
        }
        else if(soluong >= 100 & soluong <200) {
            Bill = soluong * 1500;
            System.out.println("đơn giá là: "+Bill);
        }
        else {
            Bill = soluong * 2000;
            System.out.println("đơn giá là:" +Bill);
        }
    }
}
