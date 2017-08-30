package dao;

import entity.DDCategory;
import entity.DDCategoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDCategoryMapper {
    long countByExample(DDCategoryCriteria example);

    int deleteByExample(DDCategoryCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDCategory record);

    int insertSelective(DDCategory record);

    List<DDCategory> selectByExample(DDCategoryCriteria example);

    DDCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDCategory record, @Param("example") DDCategoryCriteria example);

    int updateByExample(@Param("record") DDCategory record, @Param("example") DDCategoryCriteria example);

    int updateByPrimaryKeySelective(DDCategory record);

    int updateByPrimaryKey(DDCategory record);
}