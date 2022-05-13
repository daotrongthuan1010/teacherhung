package hungteacher.week.demo.service;

import hungteacher.week.demo.entity.DSMatHang;
import hungteacher.week.demo.entity.DSMatHangDTO;

import java.util.List;

public interface DSMatHangService {
    void create(DSMatHang DSMatHang);

    DSMatHang update(DSMatHang DSMatHang) throws Exception;

    List<DSMatHangDTO> findByDanhSachMH(DSMatHang DSMatHang);

    void deleteById(Long id);
}
