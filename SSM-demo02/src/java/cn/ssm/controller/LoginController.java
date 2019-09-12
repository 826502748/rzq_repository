package cn.ssm.controller;

import cn.ssm.pojo.RainQuality;
import cn.ssm.service.RainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginController {

    @Resource
    private RainService rainService;

    @RequestMapping("/login")
    public String login(Model model){
        List<RainQuality> rainList = rainService.rainList();
        model.addAttribute("rainList",rainList);
        return "index";
    }
}
