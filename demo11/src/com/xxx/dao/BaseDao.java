package com.xxx.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
//加载数据库驱动---->数据库连接--->执行sql语句---->返回结果记录
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
		try{
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/product?useUnicode=true&characterEncoding=UTF-8","root","");
			return con;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
