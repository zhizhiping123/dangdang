package service;

import java.util.List;

import entity.DDItem;

public interface ShopCarService {

	Boolean addItem(Integer productId, String uid);

	List<DDItem> getItemsByUid(Integer uid);

	Boolean deleteItemById(Integer itemId);

	Boolean changeItemNumById(Integer itemId, Integer num);

}
