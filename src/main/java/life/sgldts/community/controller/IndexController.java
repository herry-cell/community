package life.sgldts.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author herry
 * @create 2020-06-26-16:15
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
