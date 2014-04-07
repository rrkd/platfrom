package au.com.iglooit.rrkd.platform.service.webservice;

import au.com.iglooit.rrkd.platform.model.entity.User;
import au.com.iglooit.rrkd.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 7/04/2014
 * Time: 10:36 PM
 */
@Controller
public class UserServiceWS {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public @ResponseBody
    User findUser() {
        List<User> result = userService.findUserByName();
        return result.get(0);
    }
}
