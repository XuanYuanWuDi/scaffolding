package com.lzx.scaffold.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lzx.scaffold.entity.ZtUser;
import com.lzx.scaffold.provider.mapper.ZtUserMapper;
import com.lzx.scaffold.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: lzx
 * @Date: 2019/3/6 17:36
 * @Description:
 */
@Service
@Component
public class UserServiceImpl implements UserService {


    @Autowired
    private ZtUserMapper ztUserMapper;

    @Override
    public ZtUser getUserById(Integer id) {
        return ztUserMapper.selectByPrimaryKey(id);
    }
}
