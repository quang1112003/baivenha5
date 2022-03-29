package session5.lab2;

public class main {
    public static void main(String args[]){
        KhachVN vn = new KhachVN();
        KhachNuocngoai nn = new KhachNuocngoai();

        nn.insert();
        nn.clientin4();
        nn.bill();

        vn.Nhap();
        vn.In();

    }
}
