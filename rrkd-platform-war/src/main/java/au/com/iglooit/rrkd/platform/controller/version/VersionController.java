package au.com.iglooit.rrkd.platform.controller.version;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 5/04/2014
 * Time: 11:23 PM
 */
@Controller
public class VersionController {
    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version(){
        return "version";
    }
}
