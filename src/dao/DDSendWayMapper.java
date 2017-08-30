package dao;

import entity.DDSendWay;
import entity.DDSendWayCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDSendWayMapper {
    long countByExample(DDSendWayCriteria example);

    int deleteByExample(DDSendWayCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDSendWay record);

    int insertSelective(DDSendWay record);

    List<DDSendWay> selectByExample(DDSendWayCriteria example);

    DDSendWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDSendWay record, @Param("example") DDSendWayCriteria example);

    int updateByExample(@Param("record") DDSendWay record, @Param("example") DDSendWayCriteria example);

    int updateByPrimaryKeySelective(DDSendWay record);

    int updateByPrimaryKey(DDSendWay record);
}