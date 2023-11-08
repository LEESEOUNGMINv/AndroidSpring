package spring.mvc.gsonEx.persistence;

import java.util.Map;

import spring.mvc.gsonEx.vo.CustomerDTO;
import spring.mvc.gsonEx.vo.Member;

public interface MainDAO {
	
	public String confirmIdPwd(Map<String, String> in);
	
	public CustomerDTO getMemberInfo(String id);

}
