package au.com.iglooit.rrkd.platform.controller.home;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 6/04/2014
 * Time: 9:14 PM
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(){
        return "home";
    }
}
