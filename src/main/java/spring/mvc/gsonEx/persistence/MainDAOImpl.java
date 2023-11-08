package spring.mvc.gsonEx.persistence;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.gsonEx.vo.CustomerDTO;
import spring.mvc.gsonEx.vo.Member;

@Repository
public class MainDAOImpl implements MainDAO{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public String confirmIdPwd(Map<String, String> in) {
		MainDAO dao = sqlSession.getMapper(MainDAO.class);
		return dao.confirmIdPwd(in);
	}

	@Override
	public CustomerDTO getMemberInfo(String id) {
		MainDAO dao = sqlSession.getMapper(MainDAO.class);
		CustomerDTO m = dao.getMemberInfo(id);
		
		System.out.println("dao m : " + m);
		
		return m;
	}

}
