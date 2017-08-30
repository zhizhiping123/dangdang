package service;

import java.util.List;

import entity.DDBook;

public interface BookService {

	List<DDBook> getBookListByPage(int pageNum);
	
	
}
