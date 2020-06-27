package life.sgldts.community.controller;

import jdk.nashorn.internal.parser.Token;
import life.sgldts.community.mapper.UserMapper;
import life.sgldts.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author herry
 * @create 2020-06-26-16:15
 */

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;



    @GetMapping("/")
    public String index(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }

            }
        }
        return "index";
    }

}
