package notice.db;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DBConnectUnitTest {
	
	@Test
	public void dbConnect() throws Exception {
		//db connect//드라이버로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//접속
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String pw="123456";
		Connection con=DriverManager.getConnection(url, user, pw);
	}

}
