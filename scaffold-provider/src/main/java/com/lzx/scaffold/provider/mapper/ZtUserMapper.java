package com.lzx.scaffold.provider.mapper;

import com.lzx.scaffold.entity.ZtUser;
import org.springframework.stereotype.Repository;

@Repository
public interface ZtUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZtUser record);

    int insertSelective(ZtUser record);

    ZtUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZtUser record);

    int updateByPrimaryKey(ZtUser record);
}