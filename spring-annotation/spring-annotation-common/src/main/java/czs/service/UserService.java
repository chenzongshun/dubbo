package czs.service;

import czs.common.entity.User;

public interface UserService
{
    public User findUser();

    public User findUser(Integer userId);
}
