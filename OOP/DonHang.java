import java.util.ArrayList;
import java.util.Date;

public class DonHang {
    private String ma_donhang;

    private Date ngay_dathang;

    private ArrayList<Sach> danhsach_sach;

    public DonHang() {
    }

    public DonHang(String ma_donhang, Date ngay_dathang) {
        this.ma_donhang = ma_donhang;
        this.ngay_dathang = ngay_dathang;
        this.danhsach_sach = new ArrayList<>();
    }

    public DonHang(String ma_donhang, Date ngay_dathang, ArrayList<Sach> danhsach_sach) {
        this.ma_donhang = ma_donhang;
        this.ngay_dathang = ngay_dathang;
        this.danhsach_sach = new ArrayList<>();
    }

    public String getMa_donhang() {
        return ma_donhang;
    }

    public void setMa_donhang(String ma_donhang) {
        this.ma_donhang = ma_donhang;
    }

    public Date getNgay_dathang() {
        return ngay_dathang;
    }

    public void setNgay_dathang(Date ngay_dathang) {
        this.ngay_dathang = ngay_dathang;
    }

    public ArrayList<Sach> getBookList() {
        return danhsach_sach;
    }

    public void setBookList(ArrayList<Sach> danhsach_sach) {
        this.danhsach_sach = danhsach_sach;
    }

    public void them_Sach(Sach sach){
        danhsach_sach.add(sach);
    }

    public double tongTien(){
        double tongTien = 0;
        for(Sach sach : danhsach_sach){
            tongTien = tongTien + sach.getGia_sach() ;
        }
        return tongTien;
    }

    public void printOrderInfo() {
        System.out.println("===== Thông tin đơn hàng =====");
        System.out.println("Mã đơn hàng: " + ma_donhang);
        System.out.println("Ngày đặt: " + ngay_dathang);
        System.out.println("Danh sách sách đã đặt:");
        for (Sach sach : danhsach_sach) {
            System.out.println("  - " + sach.toString());
        }
        System.out.printf("Tổng tiền: %.2f\n", tongTien());
    }
}

