package hungteacher.week.demo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Length(max = 255)
    private String username;
    @NotNull
    @Length(max = 255)
    private String password;
    @NotNull
    @Length(max = 255)
    private String ten;
    @NotNull
    @Length(max = 255)
    private Date ngaySinh;
    @NotNull
    @Length(max = 255)
    private String diaChi;
    @NotNull
    @Length(max = 255)
    private String email;
    @Length(max = 255)
    private String viTri;

    @OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
    private List<HopDongTraGop> hopDongTraGopList;
}
