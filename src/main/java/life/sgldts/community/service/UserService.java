package life.sgldts.community.service;

import life.sgldts.community.mapper.UserMapper;
import life.sgldts.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author herry
 * @create 2020-06-30-11:38
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
        User dbUser = userMapper.findByAccountId(user.getAccountId());
        if (dbUser == null) {
            dbUser.setGmtCreate(System.currentTimeMillis());
            dbUser.setGmtModified(user.getGmtCreate());
            userMapper.insert(dbUser);
        } else {
            dbUser.setGmtModified(System.currentTimeMillis());
            dbUser.setAvatarUrl(user.getAvatarUrl());
            dbUser.setName(user.getName());
            dbUser.setToken(user.getToken());
            userMapper.update(dbUser);
        }
    }
}
