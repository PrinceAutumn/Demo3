package com.ckcj.tools;

import com.ckcj.dao.TblUserDao;
import com.ckcj.dao.TblUserDaoImpl;


public class TestTblUseDao<TblUserDao> {
    TblUserDao tblUserDao = (TblUserDao) new TblUserDaoImpl();

    //测试方法定义：  voie 方法名test前缀
    @Test
    public <TblUserDao> boolean main(String[] args) {
        TblUserDao tblUserDao = (TblUserDao) new TblUserDaoImpl();
        public void testDelTbluser() {
            TblUserDaoImpl tblUserDao;
            String uid;
            boolean f = tblUserDao.delTblUser(uid:"2");
            System.out.println(f);
            return false;
        }
    }
}
