package jp.baseManagement.app.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 3111266 on 2016/09/07.
 * jp.baseManagement.app.demo
 */

@Controller
@RequestMapping("/testT")
@EnableAutoConfiguration
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("msg", "サンプルメッセージ！");
        return "test";
    }
}
