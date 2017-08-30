package dao;

import entity.DDOrder;
import entity.DDOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDOrderMapper {
    long countByExample(DDOrderCriteria example);

    int deleteByExample(DDOrderCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDOrder record);

    int insertSelective(DDOrder record);

    List<DDOrder> selectByExample(DDOrderCriteria example);

    DDOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDOrder record, @Param("example") DDOrderCriteria example);

    int updateByExample(@Param("record") DDOrder record, @Param("example") DDOrderCriteria example);

    int updateByPrimaryKeySelective(DDOrder record);

    int updateByPrimaryKey(DDOrder record);
}