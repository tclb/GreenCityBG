package com.neuedu.lvcity.common;

import java.sql.Connection;

import org.junit.Test;

public class TextUtils {
    public static boolean isEmpty(CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }
    @Test
    public  void Test1()
    {
    	Connection conn  = DBUtils.getConnection();
    	System.out.println(conn);   
    	
    }
}
