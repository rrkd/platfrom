package au.com.iglooit.rrkd.platform.service;

import au.com.iglooit.rrkd.platform.model.entity.User;
import au.com.iglooit.rrkd.platform.repository.BaseRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 7/04/2014
 * Time: 10:39 PM
 */
@Component
public class UserServiceImpl extends BaseRepository<User> implements UserService {

    public UserServiceImpl() {
        super(User.class);
    }

    @Override
    public List<User> findUserByName() {
        return findAll();
    }
}
