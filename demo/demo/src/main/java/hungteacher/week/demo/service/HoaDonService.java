package hungteacher.week.demo.service;

import hungteacher.week.demo.entity.HoaDon;

import java.util.List;

public interface HoaDonService {
    void create(HoaDon HoaDon);

    HoaDon update(HoaDon HoaDon) throws Exception;

    List<HoaDon> findByHoaDon(String maHoaDon);

    void deleteById(Long id);
}
