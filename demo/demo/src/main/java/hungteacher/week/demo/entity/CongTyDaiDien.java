package hungteacher.week.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class CongTyDaiDien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String ten;
    @NotNull
    private String diaChi;
    @OneToMany(mappedBy = "congTyDaiDien", cascade = CascadeType.ALL)
    private List<HopDongTraGop> hopDongTraGopList;
}
