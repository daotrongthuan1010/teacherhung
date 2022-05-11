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
public class DoiTac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(max = 255)
    @NotNull
    private String tenCTy;
    @Length(max = 255)
    @NotNull
    private String diaChi;
    @Length(max = 255)
    @NotNull
    private String maSoThue;


}
