package hungteacher.week.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class ThoiDiemThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date ngayThanhToan;
    @NotNull
    private String trangThai;
    @NotNull
    private Long soTienThanhToan;
    @NotNull
    private Long soTienNo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maHopDongTraGop")
    private HopDongTraGop hopDongTraGop;

}
