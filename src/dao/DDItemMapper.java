package dao;

import entity.DDItem;
import entity.DDItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDItemMapper {
    long countByExample(DDItemCriteria example);

    int deleteByExample(DDItemCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDItem record);

    int insertSelective(DDItem record);

    List<DDItem> selectByExample(DDItemCriteria example);

    DDItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDItem record, @Param("example") DDItemCriteria example);

    int updateByExample(@Param("record") DDItem record, @Param("example") DDItemCriteria example);

    int updateByPrimaryKeySelective(DDItem record);

    int updateByPrimaryKey(DDItem record);

	Boolean updateProductNumById(@Param("itemId")Integer itemId,@Param("num") Integer num);
}