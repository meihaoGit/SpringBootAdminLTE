package jp.baseManagement.model.logic.top;

/**
 * Created by 3111266 on 2016/09/01.
 * 
 */

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MenuLogic {

    @RequestMapping("/")
    @ResponseBody
    public String TopLogic() {
        return "Hello, Spring Boot Sample Application!";
    }

    @RequestMapping(value="/test" , method = RequestMethod.GET)
    public String testLogic(Model model) {
        model.addAttribute("msg", "サンプルメッセージ！");
        return "test/test";
    }
}
