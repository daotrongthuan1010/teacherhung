package hungteacher.week.demo.repository;

import hungteacher.week.demo.entity.DSMatHang;
import hungteacher.week.demo.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon , Long> {
    @Query(value = "select * from HoaDon hd where hd.id = :maHoaDon", nativeQuery = true)
    List<HoaDon> findByCondition(String maHoaDon);
}
