package com.lcf.mall.service;

import com.lcf.mall.common.api.CommonResult;

/**
 * 会员管理service
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);

}
