package com.demo.web.mapper;

import com.demo.web.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liYangYang on 2019/6/23.
 */
@Mapper
public interface UserMapper {

    //获取用户名单
    List<User> getUser();

    //根据id删除用户
    void deleteUser(Long id);

    //新增用户
    void addUser(User user);

    User getUserById(Long id);


}
