package dao;

import entity.DDUser;
import entity.DDUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDUserMapper {
    long countByExample(DDUserCriteria example);

    int deleteByExample(DDUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDUser record);

    int insertSelective(DDUser record);

    List<DDUser> selectByExample(DDUserCriteria example);

    DDUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDUser record, @Param("example") DDUserCriteria example);

    int updateByExample(@Param("record") DDUser record, @Param("example") DDUserCriteria example);

    int updateByPrimaryKeySelective(DDUser record);

    int updateByPrimaryKey(DDUser record);
}