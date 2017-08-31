package service;

import java.util.List;

import entity.DDBook;
import entity.vo.BookDetailVo;

public interface BookService {

	List<BookDetailVo> getBookListByPage(int pageNum);
	Integer getTotalPage();
	
	
}
