package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInitialize {

	public static Statement statement;

	public void DBInitialize() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

		// Load the JDBC driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		System.out.println("Driver loaded");

		// Connect to the database using Windows Authentication
		String url = "jdbc:sqlserver://localhost:1433;databaseName=POS;encrypt=false;integratedSecurity=true;";

		Connection connection = DriverManager.getConnection(url);

		System.out.println("Database connected");

		// Create a statement
		statement = connection.createStatement();
	}
}
