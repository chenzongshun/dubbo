package czs.consumer.controller;

import czs.common.entity.User;
import czs.service.UserService;

public class UserController
{

    private UserService userService;

    public void setUserService (UserService userService)
    {
        this.userService = userService;
    }

    public void findUser ()
    {
        User user = userService.findUser ();
        System.out.println (user);
    }
}
