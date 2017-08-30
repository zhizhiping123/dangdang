package web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.DDBook;
import service.BookService;

@Controller
public class BookController {
@Autowired
private BookService bookService;
@RequestMapping("/list/book/page/{pageNum}.do")
public String getCategory(@PathVariable("pageNum") int pageNum){
	
	List<DDBook> books=bookService.getBookListByPage(pageNum);
	
	
	
	
	return null;
}
}
