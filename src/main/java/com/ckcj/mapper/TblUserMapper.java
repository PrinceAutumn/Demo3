package com.ckcj.mapper;

import com.ckcj.entity.Tbluser;

import java.awt.*;

public interface TblUserMapper {
          //1.增加用户
           public int addTblUser(Tbluser tbluser);
          //2.删除用户
           public int delTblUser(String uid);
           //3.重置密码
           //传参用注解param
          public int updateTblUser(String upwd,String userid);
           //4.查询所有用户列表 根据用户模糊\ 余额范围 查询，分页
           public List findTblUser(String uname, long miny, long maxy, int pageNo);
           //5.登录 根据用户和密码查询
           public Tbluser LoginUser(String uname,String upwd);

}
