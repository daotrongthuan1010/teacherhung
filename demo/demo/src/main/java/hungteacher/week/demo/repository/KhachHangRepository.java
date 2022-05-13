package hungteacher.week.demo.repository;

import hungteacher.week.demo.entity.HopDongTraGop;
import hungteacher.week.demo.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Long> {
    @Query(value = "select * from KhachHang kh where "
            + "(:#{#khachHang.id} is null or kh.id = :#{#khachHang.id}) "
            + "and (:#{#khachHang.ten} is null or kh.ten like %:#{#khachHang.ten%})"
            + "and (:#{#khachHang.ngaySinh} is null or kh.ngaySinh = :#{#khachHang.ngaySinh})"
            + "and (:#{#khachHang.diaChi} is null or kh.diaChi like %:#{#khachHang.diaChi}%)"
            + "and (:#{#khachHang.sdt} is null or kh.sdt like %:#{#khachHang.sdt}%)"
            + "and (:#{#khachHang.email} is null or kh.email like %:#{#khachHang.email}%)"
            , nativeQuery = true)
    List<KhachHang> findByCondition(KhachHang khachHang);
}
