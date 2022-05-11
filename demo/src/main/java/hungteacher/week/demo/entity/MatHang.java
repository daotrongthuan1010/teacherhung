package hungteacher.week.demo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class MatHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Length(max = 10)
    private int ChungLoai;
    @NotNull
    @Length(max = 10)
    private String ten;
    @NotNull
    @Length(max = 10)
    private String donViTinh;
    @NotNull
    private String giaNiemYet;
    @NotNull
    private String chietKhau;


}
