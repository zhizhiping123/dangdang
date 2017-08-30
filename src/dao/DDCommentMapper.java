package dao;

import entity.DDComment;
import entity.DDCommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDCommentMapper {
    long countByExample(DDCommentCriteria example);

    int deleteByExample(DDCommentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDComment record);

    int insertSelective(DDComment record);

    List<DDComment> selectByExample(DDCommentCriteria example);

    DDComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDComment record, @Param("example") DDCommentCriteria example);

    int updateByExample(@Param("record") DDComment record, @Param("example") DDCommentCriteria example);

    int updateByPrimaryKeySelective(DDComment record);

    int updateByPrimaryKey(DDComment record);
}