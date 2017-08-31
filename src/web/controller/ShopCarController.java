package web.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entity.DDItem;
import service.ShopCarService;
import util.Result;

@RestController
public class ShopCarController extends BaseController{
@Autowired
private ShopCarService shopCarService;
@RequestMapping("/add_book/{id}.do")
public  Result addBook(@PathVariable("id")Integer productId){
	//System.out.println(productId);
	if (getSession().getAttribute("uid")==null) {
		return new Result(0,null , "您还未登陆");
	}
	int id1=(Integer) getSession().getAttribute("uid");
	String uid=String.valueOf(id1);
	Boolean result=false;
	try {
		result=shopCarService.addItem(productId,uid);
	} catch (Exception e) {
		e.printStackTrace();
		return new Result(0, null, "数据库异常");
		
	}
	if (result) {
		return new Result(1,null , "成功添加商品到购物车");
	}
	 return new Result(0, null, "数据库异常");
}
@RequestMapping("/shop_car.do")
public Result getShopCarItems(){
if (getSession().getAttribute("uid")==null) {
	return new Result(2, null, "您还未登陆");
}
Integer uid=(Integer) getSession().getAttribute("uid");
List<DDItem> items=null;
try {
items=shopCarService.getItemsByUid(uid);
} catch (Exception e) {
	return new Result(0, null, "数据库异常");
}


 	if (items!=null) {
		return new Result(1, items, "获取购物车成功");
	}

	return new Result(0, null, "您的购物车空空如也，快去购物吧");
	
}
@RequestMapping("/delete/item/{item_id}.do")
public Result deleteItem(@PathVariable("item_id") Integer itemId){
	Boolean result=false;
	try {
		result=	shopCarService.deleteItemById(itemId);
	} catch (Exception e) {
		// TODO: handle exception
		return new Result(0, null, "数据库异常");
	}
	if (result) {
		return new Result(1, null, "删除成功");
		
	}
	
		return new Result(0, null, "操作异常");

}
@RequestMapping("/change/item.do")
public Result changeItemNum(Integer itemId,Integer num){
	Boolean result;
	try {
		result=shopCarService.changeItemNumById(itemId,num);
	} catch (Exception e) {
		return new Result(0, null, "数据库异常");
	}
	//shopCarService.changeItemNumById(itemId,num);
	if (result) {
		return new Result(1, null, "更新成功");
	}
	
	return new Result(0, null, "操作异常");
}
}
