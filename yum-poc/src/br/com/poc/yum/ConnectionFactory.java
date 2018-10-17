package br.com.poc.yum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
public Connection getConnection() throws ClassNotFoundException {
		
	String connectionUrl =
            "jdbc:sqlserver://guilherme-faria.database.windows.net:1433;"
            + "database=yum_poc;"
            + "user=guigafaria@guilherme-faria;password=Abcd@123;"
            + "encrypt=true;trustServerCertificate=false;"
            + "hostNameInCertificate=*.database.windows.net;"
            + "loginTimeout=30;";
		try {
			return DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

