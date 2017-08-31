package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.DDItemMapper;
import dao.DDProductMapper;
import entity.DDItem;
import entity.DDItemCriteria;
import entity.DDItemCriteria.Criteria;
import entity.DDProduct;
import service.ShopCarService;
@Service
@Transactional
public class ShopCarServiceImpl implements ShopCarService{
	@Autowired
	private DDItemMapper ddItemMapper;
	@Autowired
	private DDProductMapper ddProductMapper;
	@Override
	public Boolean addItem(Integer productId, String uid) {
		DDProduct product = ddProductMapper.selectByPrimaryKey(productId);
		//DDItem ddItem=new DDItem();
		DDItemCriteria criteria=new DDItemCriteria();
		criteria.createCriteria().andProductIdEqualTo(productId);
		//Long num=ddItemMapper.countByExample(criteria);
		
			DDItem ddItem =new DDItem();
			ddItem.setProductId(productId);
			ddItem.setProductNum(1);
			ddItem.setUserId(Integer.parseInt(uid));
			ddItem.setProductName(product.getProductName());
			ddItem.setFixedPrice(product.getFixedPrice());
			ddItem.setDangPrice(product.getDangPrice());
			double amount=ddItem.getDangPrice()*ddItem.getProductNum();
			ddItem.setAmount(amount);
			int num1=0;
			try {
				num1=ddItemMapper.insert(ddItem);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			if (num1==1) {
				
				return true;
			}
		return false;
		
	}
	@Override
	public List<DDItem> getItemsByUid(Integer uid) {
		DDItemCriteria criteria=new DDItemCriteria();
		criteria.createCriteria().andUserIdEqualTo(uid);
		List<DDItem> items = ddItemMapper.selectByExample(criteria);
		//System.out.println(items);
		return items;
	}
	@Override
	public Boolean deleteItemById(Integer itemId) {
		int num;
		try {
			num=ddItemMapper.deleteByPrimaryKey(itemId);
		} catch (Exception e) {
			return false;
		}
		if (num==1) {
			return true;
		}
		
		return false;
	}
	@Override
	public Boolean changeItemNumById(Integer itemId, Integer num) {
		Boolean result=false;
		try {
			result=ddItemMapper.updateProductNumById(itemId,num);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	//	ddItemMapper.updateProductNumById(itemId,num);
		
		return result;
	}

}
