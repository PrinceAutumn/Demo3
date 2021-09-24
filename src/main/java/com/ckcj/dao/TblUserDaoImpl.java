package com.ckcj.dao;

import com.ckcj.tools.MybatisDbHelper;
    import org.apache.ibatis.session.SqlSession;

public class TblUserDaoImpl implements TblUserDao {
    @Override
    public <Tbluser, Map> boolean addTblUser(Tbluser tbluser) {
         boolean flag = false;
         try {
            //1.得到链接
            SqlSession sqlSession = MybatisDbHelper.getSession();
            //2.SQL
             int num= sqlSession.delete("delTblUser", tbluser);
            //3.提交;
            sqlSession.commit();
            System.out.println(num);
            if (num>0) {
                flag = true;
            }
        }   catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delTblUser(String uid) {


        return false;
        Throwable e;
        e.printStackTrace();
    }

    private class SqlSession {
        public void commit() {
        }

        public <Tbluser> int delete(String delTblUser, Tbluser tbluser) {
        }
    }
}

