package com.myredis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myredis.dto.LoginFormDTO;
import com.myredis.dto.Result;
import com.myredis.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
