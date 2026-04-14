package com.personal.webdemo.mapper;


import com.personal.webdemo.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {


    List<Users> selectAllUsers();

    Users selectUserById(int id);


}
