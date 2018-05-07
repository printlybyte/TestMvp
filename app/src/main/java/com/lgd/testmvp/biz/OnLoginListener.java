package com.lgd.testmvp.biz;

import com.lgd.testmvp.bean.User;

/**
 * Created by Administrator on 2018/5/7.
 */

public interface OnLoginListener {
    void loginSuccess(User user);

    void loginFailed();
}
