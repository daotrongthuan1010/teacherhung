package hungteacher.week.demo.repository;

import hungteacher.week.demo.entity.HoaDon;
import hungteacher.week.demo.entity.HopDongTraGop;
import hungteacher.week.demo.entity.KhachHang;
import hungteacher.week.demo.service.implService.HopDongTraGopImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HopDongTraGopRepository extends JpaRepository<HopDongTraGop, Long> {
    @Query(value = "SELECT hd.id, kh.ten, dt.tencty " +
            "FROM teachhung.hop_dong_tra_gop hd " +
            "left join khach_hang kh on kh.id = hd.khach_hangid  " +
            "left join doi_tac dt on dt.id = hd.doitacid where hd.id = :maHoaDon;"
            , nativeQuery = true)
    Map<String, Object> findByHopDongTraGop(String maHoaDon);





}
