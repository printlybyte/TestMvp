package com.lgd.testmvp.biz;

/**
 * Created by Administrator on 2018/5/7.
 */
/**
 *@Params:
 *@Author: liuguodong
 *@Date: 2018/5/7 16:32
 *@return：
 * 实体类不用说，至于业务类，我们抽取了一个接口，一个实现类这也很常见~~login方法，
 * 一般肯定是连接服务器的，是个耗时操作，所以我们开辟了子线程，Thread.sleep(2000)模拟了耗时，
 * 由于是耗时操作，所以我们通过一个回调接口(OnLoginListener)来通知登录的状态。
 */
public interface IUserBiz {
    public void login(String username, String password, OnLoginListener loginListener);
}
