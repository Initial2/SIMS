package com.example.sims.login

/**
 * 验证登录信息
 */
class VerifyLogin  {


    /**
     * 校验此次登录是否合法
     * @username 传进来的用户名
     * @password 传进来的用户密码
     * @Int 如果验证成功，则返回该用户的权限等级. 如果返回0则证明账号密码不正确
     */
     companion object {
        fun verify(username: String, password: String):Int {

            //连接到数据库进行验证...
            return 1;
        }

    }



}