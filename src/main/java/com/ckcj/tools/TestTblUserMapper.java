package com.ckcj.tools;

import com.ckcj.dao.TblUserDaoImpl;
import com.ckcj.entity.Tbluser;

public class TestTblUserMapper {

    public void addTbluser(Tbluser tbluser) {
        TblUserDaoImpl.SqlSession sqlsession=MybatisDbHelper.getSession();
    }
}
