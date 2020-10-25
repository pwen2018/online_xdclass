package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Insert("insert into user (name, pwd, head_img, phone, create_time) values (#{name}, #{pwd}, #{headImg}," +
            "#{phone},#{createTime})")
    int save(User user);

    /**
     * 根据手机号和密码找用户
     * @param phone
     * @param pwd
     * @return
     */
    @Select("select * from user where phone = #{phone} and pwd = #{pwd}")
    User findByPhoneAndPwd(@Param("phone") String phone, @Param("pwd") String pwd);

    @Select("select * from user where id = #{user_id}")
    User findByUserId(@Param("user_id") Integer userId);
}
