package au.com.iglooit.rrkd.platform.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 6/04/2014
 * Time: 6:47 AM
 */
@Controller
public class HelpController {
    @RequestMapping(value = "/help", method = RequestMethod.GET)
    public String help(){
        return "help";
    }
}
