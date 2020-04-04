package czs.service.impl;

import czs.common.entity.User;
import czs.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserServiceImpl implements UserService
{
    UserServiceImpl()
    {
        System.err.println("UserServiceImpl 开始提供服务");
    }

    @Override
    public User findUser()
    {
        System.err.println("findUser()-被调用了");
        User user = new User();
        user.setId(111);
        user.setUserName("springboot-dubbo");
        user.setPassword("springboot-dubbo");
        return user;
    }

    @Override
    public User findUser(Integer userId)
    {
        System.err.println("findUser(Integer userId)-被调用了");
        User user = new User();
        user.setId(userId);
        user.setUserName("springboot-dubbo");
        user.setPassword("springboot-dubbo");
        return user;
    }
}
