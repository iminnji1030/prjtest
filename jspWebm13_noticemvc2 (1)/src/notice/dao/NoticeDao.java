package notice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import notice.db.DBCon;
import notice.vo.Notice;

public class NoticeDao {
	
	public int delete(String seq) throws Exception {
		String sql="delete from notices where seq=?";
		//db connect
		//드라이버로드
		Connection con=DBCon.getConnection();
		//실행
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, seq);
		int af=pstmt.executeUpdate();//return int
		
		return af;
	}
	
	public int insert(Notice not) throws Exception {
		//dbconnect
		String sql="insert into notices VALUES("
				+"(select max(to_number(seq))+1 from notices),"
				+"?,'cj',?,SYSTIMESTAMP,0)";
		Connection con=DBCon.getConnection();
		//실행
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, not.getTitle());
		pstmt.setString(2, not.getContent());

		//결과
		int af=pstmt.executeUpdate();//insert 실행

		return af;
	}
	
	
	
	public int update(Notice n) throws Exception {
		String sql="update notices set title=?,content=? where seq=?";
		
		Connection con=DBCon.getConnection();

		//실행
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, n.getTitle());
		pstmt.setString(2, n.getContent());
		pstmt.setString(3, n.getSeq());
		//결과
		int af=pstmt.executeUpdate();
		System.out.println("af : "+af);
		return af;
	}
	
	public List<Notice> getNotices() throws Exception {
		String sql="select * from notices order by to_number(seq) desc";
		//db connect
		Connection con=DBCon.getConnection();
		//실행
		Statement st=con.createStatement();
		//결과
		ResultSet rs=st.executeQuery(sql);
		
		//리스트에서 담기
		List<Notice> list=new ArrayList<Notice>();
		while (rs.next()) {
			Notice n=new Notice();
			n.setSeq(rs.getString("seq"));
			n.setTitle(rs.getString("title"));
			n.setWriter(rs.getString("writer"));
			n.setContent(rs.getString("content"));
			n.setRegdate(rs.getDate("regdate"));
			n.setHit(rs.getInt("hit"));
			
			list.add(n);
		}
		rs.close();
		st.close();
		con.close();
		
		return list;
	}
	
	public Notice getNotice(String seq) throws Exception {
		String sql="select * from notices where seq="+seq;
		
		Connection con=DBCon.getConnection();
		
		//실행
		Statement st=con.createStatement();

		//결과
		ResultSet rs=st.executeQuery(sql);//select 실행
		rs.next();
		
		//
		Notice n=new Notice();
		//NoticeDetail에서 필요한 정보를 Notice에 담아보기
		n.setSeq(rs.getString("seq"));
		n.setTitle(rs.getString("title"));
		n.setWriter(rs.getString("writer"));
		n.setContent(rs.getString("content"));
		n.setRegdate(rs.getDate("regdate"));
		n.setHit(rs.getInt("hit"));
		rs.close();
		st.close();
		con.close();
		
		return n;
		
	}
}
