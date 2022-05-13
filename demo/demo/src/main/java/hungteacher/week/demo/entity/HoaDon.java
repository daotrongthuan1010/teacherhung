package hungteacher.week.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
@Entity
@Data
public class HoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @NotNull
    private Date ngayKy;

    @Past
    @NotNull
    private Date dsThoiDiemTTConLai;
    @NotNull
    private Long tongTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tblHopDongTraGopmaHD")
    private HopDongTraGop hopDongTraGop;
}
