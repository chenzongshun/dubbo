package czs.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import czs.common.entity.User;
import czs.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController
{

    @Reference
    private UserService userService;

    public void findUser ()
    {
        User user = userService.findUser ();
        System.out.println (user);
    }
}
