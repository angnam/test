package pack.aop3;

import org.springframework.stereotype.Repository;

//@Company
@Repository //xompoen
public class ArticleDao implements ArticleInter {
	@Override
	public void selectAll() {
		System.out.println("sawon 자료 전체 읽기 수행");
	}
	
  
}
