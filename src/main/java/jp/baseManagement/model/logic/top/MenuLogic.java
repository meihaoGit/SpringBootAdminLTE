package jp.baseManagement.model.logic.top;

/**
 * Created by 3111266 on 2016/09/01.
 * jp.dogsManagement.model.logic.top
 */

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MenuLogic {

    @RequestMapping("/")
    @ResponseBody
    public String MenuLogic() {
        return "Hello, Spring Boot Sample Application!";
    }

}
