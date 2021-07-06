package notice.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import notice.dao.NoticeDao;
import notice.vo.Notice;

class NoticeDaoTest {

	NoticeDao dao;
	@BeforeEach
	void setUp() throws Exception {
		dao=new NoticeDao();
	}

	
	@Test
	public void testGetNoticeWhenInsert() throws Exception {
		Notice n=new Notice();
		n.setTitle("title1111");
		n.setContent("contenttttt");
		
		assertEquals(1, dao.insert(n));
	}
	@Test
	public void testDaoUpdate() throws Exception {
		//최인지
	//	TODOTODOTODOTODOTODO
	
		
		//assertEquals(/*TODO*/);
	}

	@Test
	public void testGetNoticeWhenSelect() throws Exception {
		
		assertEquals("cj", dao.getNotice("1").getWriter());
	}
	@Test
	public void testGetNoticeWhenDelete() throws Exception {
		String sql="delete from notices where seq=?";
		//db connect
		//드라이버로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//접속
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String pw="123456";
		Connection con=DriverManager.getConnection(url, user, pw);

		//실행
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, "6");
		
		//결과
		int af=pstmt.executeUpdate();
		System.out.println("af : "+af);
	
	}
	
	

}
