class Sach {
    private String id_sach;
    private String ten_sach;
    private double gia_sach;
    private String ten_tacgia;

    public Sach() {
    }

    public Sach(String id_sach, String ten_sach, double gia_sach, String ten_tacgia) {
        this.id_sach = id_sach;
        this.ten_sach = ten_sach;
        this.gia_sach = gia_sach;
        this.ten_tacgia = ten_tacgia;
    }

    public String getId_sach() {
        return id_sach;
    }

    public void setId_sach(String id_sach) {
        this.id_sach = id_sach;
    }

    public String getTen_sach() {
        return ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        this.ten_sach = ten_sach;
    }

    public double getGia_sach() {
        return gia_sach;
    }

    public void setGia_sach(double gia_sach) {
        this.gia_sach = gia_sach;
    }

    public String getTen_tacgia() {
        return ten_tacgia;
    }

    public void setTen_tacgia(String ten_tacgia) {
        this.ten_tacgia = ten_tacgia;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "id_sach='" + id_sach + '\'' +
                ", ten_sach='" + ten_sach + '\'' +
                ", gia_sach=" + gia_sach +
                ", ten_tacgia='" + ten_tacgia + '\'' +
                '}';
    }
}
/*
Phần 2. Lập trình hướng đối tượng (1 câu – 3 điểm)
Câu 2: Một cửa hàng bán sách cần xây dựng một hệ thống quản lý đơn giản. Yêu cầu:

Mỗi cuốn sách có các thông tin: mã sách, tên sách, giá bán, tác giả.

Khách hàng có thể mua nhiều sách trong một lần đặt hàng.

Hệ thống cần quản lý thông tin đơn hàng, gồm mã đơn hàng, ngày đặt, danh sách các sách được đặt và tổng tiền.

Yêu cầu:

Thiết kế các lớp tương ứng.

Áp dụng nguyên lý lập trình hướng đối tượng: đóng gói, kế thừa (nếu cần), và sử dụng hàm khởi tạo.

Viết chương trình chính minh hoạ việc tạo sách, tạo đơn hàng và in thông tin đơn hàng ra màn hình.*/
