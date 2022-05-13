package hungteacher.week.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class HopDongTraGop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Past
    @NotNull
    private Date thoiHanVay;
    @NotNull
    private Date dsThoiDiemTT;
    @NotNull
    private float laiXuat;
    @NotNull
    private long tongTien;

    @OneToMany(mappedBy = "hopDongTraGop", cascade = CascadeType.ALL)
    private List<HoaDon> hoaDonList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Nhanvienid")
    private NhanVien nhanVien;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TDThanhToanid")
    private ThoiDiemThanhToan thoiDiemThanhToan;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Doitacid")
    private DoiTac doiTac;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "congTyDaiDienid")
    private CongTyDaiDien congTyDaiDien;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KhachHangid")
    private KhachHang khachHang;

    @OneToOne(mappedBy = "hopDongTraGop")
    private DSMatHang dsMatHang;
    @OneToMany(mappedBy = "thoiDiemThanhToan", cascade = CascadeType.ALL)
    private List<ThoiDiemThanhToan> thoiDiemThanhToanList;

}
