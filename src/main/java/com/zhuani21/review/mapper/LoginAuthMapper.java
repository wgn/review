package com.zhuani21.review.mapper;

import com.zhuani21.review.bean.LoginAuth;
import com.zhuani21.review.bean.LoginAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginAuthMapper {
    int countByExample(LoginAuthExample example);

    int deleteByExample(LoginAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginAuth record);

    int insertSelective(LoginAuth record);

    List<LoginAuth> selectByExample(LoginAuthExample example);

    LoginAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginAuth record, @Param("example") LoginAuthExample example);

    int updateByExample(@Param("record") LoginAuth record, @Param("example") LoginAuthExample example);

    int updateByPrimaryKeySelective(LoginAuth record);

    int updateByPrimaryKey(LoginAuth record);
}