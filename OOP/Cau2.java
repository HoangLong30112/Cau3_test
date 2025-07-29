import java.util.Date;

class Cau2{


    public static void main(String [] args){
        // Tạo sách
        Sach sach1 = new Sach("B001", "Lập trình Java", 100.0, "Nguyễn Văn A");
        Sach sach2 = new Sach("B002", "Cấu trúc dữ liệu", 120.0, "Trần Thị B");
        Sach sach3 = new Sach("B003", "Hệ điều hành", 150.0, "Lê Văn C");

        // Tạo đơn hàng
        DonHang donhang = new DonHang("DH001", new Date());
        donhang.them_Sach(sach1);
        donhang.them_Sach(sach2);
        donhang.them_Sach(sach3);

        // In thông tin đơn hàng
        donhang.printOrderInfo();
    }
}

