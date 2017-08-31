package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.DDBookMapper;
import dao.DDProductMapper;
import dao.DDUserMapper;
import entity.DDBook;
import entity.DDProduct;
import entity.DDProductCriteria;
import entity.vo.BookDetailVo;
import service.BookService;
import util.PageBean;
@Transactional
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private DDProductMapper ddProductMapper;
	@Autowired
	private DDBookMapper ddBookMapper;

	@Override
	public List<BookDetailVo> getBookListByPage(int pageNum) {
		List<BookDetailVo> bookDetailVos=new ArrayList<BookDetailVo>();
		List<DDProduct> ddProducts=ddProductMapper.select(new RowBounds((pageNum-1)*(PageBean.perPageNum), PageBean.perPageNum));
		for (DDProduct ddProduct : ddProducts) {
			Integer bookId=ddProduct.getBookId();
			DDBook ddBook=ddBookMapper.selectByPrimaryKey(bookId);
			if (ddBook!=null) {
				BookDetailVo bookDetailVo=new BookDetailVo();
				bookDetailVo.setDdProduct(ddProduct);
				bookDetailVo.setDdBook(ddBook);
				bookDetailVo.setSavePrice(ddProduct.getFixedPrice()-ddProduct.getDangPrice());
				bookDetailVos.add(bookDetailVo);
			}
		}
		System.out.println(bookDetailVos);
		return bookDetailVos;
	}

	@Override
	public Integer getTotalPage() {
		DDProductCriteria criteria=new DDProductCriteria();
		criteria.createCriteria().andBookIdIsNotNull();
		int size = ddProductMapper.selectByExample(criteria).size();
		return size/PageBean.perPageNum+1;
	}
}
