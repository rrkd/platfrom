package au.com.iglooit.rrkd.platform.service;

import au.com.iglooit.rrkd.platform.model.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 7/04/2014
 * Time: 10:38 PM
 */
public interface UserService {
    List<User> findUserByName();
}
