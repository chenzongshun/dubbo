package czs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import czs.common.entity.User;
import czs.service.UserService;
import org.springframework.stereotype.Component;

// 方式1
// @Service
// @com.alibaba.dubbo.config.annotation.Service
// 方式2
@Component
@Service
public class UserServiceImpl implements UserService
{
    UserServiceImpl(){
        System.err.println ("------------实现类的构造方法------------");
    }

    @Override
    public User findUser ()
    {
        User user = new User ();
        user.setId (1);
        user.setUserName ("tom");
        user.setPassword ("123");
        System.out.println ("实现类方法findUser被调用");
        return user;
    }
}