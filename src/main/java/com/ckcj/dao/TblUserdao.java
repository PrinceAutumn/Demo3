package com.ckcj.dao;

import  com.ckcj.entity.Tbluser;

import java.awt.*;

public interface  TblUserdao {
    //1.增加用户
    public boolean  addTbluser(Tbluser tblUser);
    //2.删除用户
    public boolean  delTbluser(String uid);
    //3.重置用户密码  传参用上注解param
    public boolean  updateTblUser(String uid);
    //4.查询所有用户列表 根据用户模糊 余额范围 查询分页
    public List findTblUser(String uname, long miny, long maxy, int pageNo);
    //5.登录 根据用户密码查询
    public Tbluser loginUser(String uname ,String upwd);
    }
