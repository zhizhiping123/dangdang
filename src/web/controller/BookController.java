package web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.DDBook;
import entity.DDProduct;
import entity.vo.BookDetailVo;
import service.BookService;

@Controller
public class BookController extends BaseController{
@Autowired
private BookService bookService;
@RequestMapping("/list/book/page/{pageNum}.do")
public String getBookByPage(@PathVariable("pageNum") int pageNum){
	Integer totalPage=bookService.getTotalPage();
	getSession().setAttribute("totalPage", totalPage);
	getSession().setAttribute("currentPage", pageNum);
	List<BookDetailVo> books=bookService.getBookListByPage(pageNum);
	getSession().setAttribute("bookVo", books);
	return "redirect:/main/book_list.jsp";
}

}
