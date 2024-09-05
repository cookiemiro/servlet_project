package com.ssg.springex.jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoDAO {
    String now = null;
    public String getTime(){
        try(Connection connection = ConnectionUtil.INSTANCE.getConnection();
            PreparedStatement psmt = connection.prepareStatement("select now()");
            ResultSet rs = psmt.executeQuery();
        ){
            rs.next();
            now = rs.getString(1);
        } catch (Exception e){
            e.printStackTrace();
        }
        return now;
    }
}
