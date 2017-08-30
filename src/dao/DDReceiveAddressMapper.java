package dao;

import entity.DDReceiveAddress;
import entity.DDReceiveAddressCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDReceiveAddressMapper {
    long countByExample(DDReceiveAddressCriteria example);

    int deleteByExample(DDReceiveAddressCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDReceiveAddress record);

    int insertSelective(DDReceiveAddress record);

    List<DDReceiveAddress> selectByExample(DDReceiveAddressCriteria example);

    DDReceiveAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDReceiveAddress record, @Param("example") DDReceiveAddressCriteria example);

    int updateByExample(@Param("record") DDReceiveAddress record, @Param("example") DDReceiveAddressCriteria example);

    int updateByPrimaryKeySelective(DDReceiveAddress record);

    int updateByPrimaryKey(DDReceiveAddress record);
}