package hungteacher.week.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
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
}
