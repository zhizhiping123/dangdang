package dao;

import entity.DDProduct;
import entity.DDProductCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DDProductMapper {
    long countByExample(DDProductCriteria example);

    int deleteByExample(DDProductCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDProduct record);

    int insertSelective(DDProduct record);

    List<DDProduct> selectByExample(DDProductCriteria example);

    DDProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDProduct record, @Param("example") DDProductCriteria example);

    int updateByExample(@Param("record") DDProduct record, @Param("example") DDProductCriteria example);

    int updateByPrimaryKeySelective(DDProduct record);

    int updateByPrimaryKey(DDProduct record);
    List<DDProduct> select(RowBounds bounds);
}