package hungteacher.week.demo.controller;

import hungteacher.week.demo.entity.HoaDon;
import hungteacher.week.demo.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @Autowired
    private HoaDonService hoaDonService;
    @GetMapping("/trangchu")
    public String trangChu(Model model){
    return "trangChu";
    }

    @RequestMapping(value = "/hoadon/timKiemHoaDon", method = RequestMethod.GET)
    public String timKiemHoaDon(Model model, @ModelAttribute("hoaDon") String maHoaDon, HttpServletRequest request) {
        return "hoaDon";
    }

    @RequestMapping(value = "/hoadon/timKiemHoaDon", method = RequestMethod.POST)
    public String getMaHoaDon(Model model, @ModelAttribute("hoaDon") String maHoaDon, HttpServletRequest request) {
        hoaDonService.findByHoaDon(maHoaDon);
        model.addAttribute("hoaDon",hoaDon);
        return "hoaDon";
    }

}
