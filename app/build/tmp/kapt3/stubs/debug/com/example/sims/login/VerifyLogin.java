package com.example.sims.login;

import java.lang.System;

/**
 * 验证登录信息
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/sims/login/VerifyLogin;", "", "()V", "Companion", "app_debug"})
public final class VerifyLogin {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.sims.login.VerifyLogin.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.example.sims.dao.UserDao userDao;
    @org.jetbrains.annotations.Nullable()
    private static com.example.sims.database.UserDatabase userDatabase;
    
    public VerifyLogin() {
        super();
    }
    
    /**
     * 校验此次登录是否合法
     * @username 传进来的用户名
     * @password 传进来的用户密码
     * @Int 如果验证成功，则返回该用户的权限等级. 如果返回0则证明账号密码不正确
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/sims/login/VerifyLogin$Companion;", "", "()V", "userDao", "Lcom/example/sims/dao/UserDao;", "getUserDao", "()Lcom/example/sims/dao/UserDao;", "setUserDao", "(Lcom/example/sims/dao/UserDao;)V", "userDatabase", "Lcom/example/sims/database/UserDatabase;", "getUserDatabase", "()Lcom/example/sims/database/UserDatabase;", "setUserDatabase", "(Lcom/example/sims/database/UserDatabase;)V", "verify", "", "username", "", "password", "t", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.sims.dao.UserDao getUserDao() {
            return null;
        }
        
        public final void setUserDao(@org.jetbrains.annotations.Nullable()
        com.example.sims.dao.UserDao p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.sims.database.UserDatabase getUserDatabase() {
            return null;
        }
        
        public final void setUserDatabase(@org.jetbrains.annotations.Nullable()
        com.example.sims.database.UserDatabase p0) {
        }
        
        public final int verify(@org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        java.lang.String password, @org.jetbrains.annotations.NotNull()
        android.content.Context t) {
            return 0;
        }
    }
}