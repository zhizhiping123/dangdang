package test;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import config.RootConfig;
import dao.DDUserMapper;

@ContextConfiguration(classes=RootConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test1 {
@Resource
private DataSource dataSource;
@Autowired
DDUserMapper ddUserMapper;
@Test
public void dbContect() throws SQLException{
	System.out.println(dataSource.getConnection());
	System.out.println(ddUserMapper);
}
	
}
