package com.eduardo.crud.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.eduardo.crud.util.Messages.*;

public class DataSource {
	
	private String hostname; // servidor
	private int port;
	private String database;
	private String username;
	private String password;
	
	private Connection connection;
	
	public DataSource()
	{
		try
		{
			hostname = "localhost";
			port = 3306;
			database = "alunosdb";
			username = "alunosdb";
			password = "123";
			
			String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
			
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println(CONNECTION_SUCCESS);
		}
		catch(SQLException e)
		{
			System.err.println(ERROR_OPEN_CONNECTION + e.getMessage());
		}
		catch(Exception e)
		{
			System.err.println(ERROR + e.getMessage());
		}
	}
	
	public Connection getConnection()
	{
		return this.connection;
	}
	
	public void closeDataSource()
	{
		try {
			connection.close();
		} 
		catch (SQLException e) 
		{
			System.err.print(ERROR_CLOSE_CONNECTION + e.getMessage());
		}
		catch (Exception e) 
		{
			System.err.print(ERROR + e.getMessage());
		}
	}
}
