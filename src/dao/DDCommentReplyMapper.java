package dao;

import entity.DDCommentReply;
import entity.DDCommentReplyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDCommentReplyMapper {
    long countByExample(DDCommentReplyCriteria example);

    int deleteByExample(DDCommentReplyCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDCommentReply record);

    int insertSelective(DDCommentReply record);

    List<DDCommentReply> selectByExample(DDCommentReplyCriteria example);

    DDCommentReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDCommentReply record, @Param("example") DDCommentReplyCriteria example);

    int updateByExample(@Param("record") DDCommentReply record, @Param("example") DDCommentReplyCriteria example);

    int updateByPrimaryKeySelective(DDCommentReply record);

    int updateByPrimaryKey(DDCommentReply record);
}