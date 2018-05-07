package com.lgd.testmvp.view;

import com.lgd.testmvp.bean.User;

/**
 * Created by Administrator on 2018/5/7.
 */


    public interface IUserLoginView
    {
        String getUserName();

        String getPassword();

        void clearUserName();

        void clearPassword();

        void showLoading();

        void hideLoading();

        void toMainActivity(User user);

        void showFailedError();


}
