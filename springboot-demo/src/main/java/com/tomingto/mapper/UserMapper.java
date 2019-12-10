package com.tomingto.mapper;

import com.tomingto.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

    //....注释
    @Select("select * from user where id = #{Id}")
    User SelectUserById(Integer Id);

}
