package com.example.apihubcommon.service;

import com.example.apihubcommon.model.entity.User;


/**
 * 用户服务
 *
 * @author <a href="https://github.com/zanyuanyang">zanyuanyang</a>
 */
public interface InnerUserService{

    /**
     * database check accessKey, secretKey for this user exist or not
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);


}
