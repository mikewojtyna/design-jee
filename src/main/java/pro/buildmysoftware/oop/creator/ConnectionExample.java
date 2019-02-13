package pro.buildmysoftware.oop.creator;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	void establishConnection() throws SQLException {
		try (Connection connection = DriverManager
			.getConnection("jdbc:h2:mem:")) {

		}
		try (Connection connection = createDataSource()
			.getConnection()) {

		}
	}

	private static DataSource createDataSource() {
		return null;
	}
}
