package hungteacher.week.demo.repository;

import hungteacher.week.demo.entity.DSMatHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DSMatHangRepository extends JpaRepository<DSMatHang , Long> {
    @Query(value = "SELECT mh.id, mh.ten, mh.don_vi_tinh, count(mh.id) as soluong " +
            "FROM teachhung.mat_hang mh join dsmat_hang ds on ds.tbl_mat_hangid = mh.id " +
            "where ds.tbl_hop_dong_tra_gopmahd = :id group by mh.id;", nativeQuery = true)
    Map<String, Object> findDanhSachMatHangById(Long id);
}
