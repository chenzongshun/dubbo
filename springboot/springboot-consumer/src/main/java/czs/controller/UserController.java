package czs.controller;

import czs.common.entity.User;
import czs.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

    @Reference
    private UserService userService;

    @RequestMapping
    public User findUser()
    {
        return userService.findUser(222);
    }
}
