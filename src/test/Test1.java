package test;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import config.RootConfig;
import dao.DDUserMapper;
import entity.DDItem;
import service.BookService;
import service.ShopCarService;

@ContextConfiguration(classes=RootConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test1 {
@Resource
private DataSource dataSource;
@Autowired
DDUserMapper ddUserMapper;
@Autowired
private BookService bookService;
@Autowired
private ShopCarService shopcar;
@Test
public void dbContect() throws SQLException{
	//System.out.println(dataSource.getConnection());
	//System.out.println(ddUserMapper);
	bookService.getBookListByPage(1);
//	Integer totalPage = bookService.getTotalPage();
//	System.out.println(totalPage);
//	List<DDItem> items = shopcar.getItemsByUid(3);
//	System.out.println(items);
	Boolean result = shopcar.changeItemNumById(4, 10);
	System.out.println(result);
}
	
}
