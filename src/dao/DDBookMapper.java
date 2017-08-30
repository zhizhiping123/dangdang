package dao;

import entity.DDBook;
import entity.DDBookCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDBookMapper {
    long countByExample(DDBookCriteria example);

    int deleteByExample(DDBookCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDBook record);

    int insertSelective(DDBook record);

    List<DDBook> selectByExampleWithBLOBs(DDBookCriteria example);

    List<DDBook> selectByExample(DDBookCriteria example);

    DDBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDBook record, @Param("example") DDBookCriteria example);

    int updateByExampleWithBLOBs(@Param("record") DDBook record, @Param("example") DDBookCriteria example);

    int updateByExample(@Param("record") DDBook record, @Param("example") DDBookCriteria example);

    int updateByPrimaryKeySelective(DDBook record);

    int updateByPrimaryKeyWithBLOBs(DDBook record);

    int updateByPrimaryKey(DDBook record);
}