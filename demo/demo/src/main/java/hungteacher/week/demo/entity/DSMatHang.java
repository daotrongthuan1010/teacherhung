package hungteacher.week.demo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class DSMatHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @NotNull
    private int count;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tblHopDongTraGopmaHD", referencedColumnName = "id")
    private HopDongTraGop hopDongTraGop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tblMatHangid")
    private MatHang matHang;
}
