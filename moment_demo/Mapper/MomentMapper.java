package cn.surine.moment_demo.Mapper;

import cn.surine.moment_demo.Entities.MomentEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MomentMapper {

    /**
     * 发送动态
     * @param momentEntity 动态实体
     * @return 操作状态
     * */
    @Insert("INSERT INTO moment(text,user_id) VALUES(#{text}, #{userId})")
    int insert(MomentEntity momentEntity);

    /**
     * 删除动态
     * @param momentEntity 动态实体
     * @return 操作状态
     * */
    @Delete("DELETE from moment where id = #{id} AND user_id = #{userId}")
    int delete(MomentEntity momentEntity);


    /**
     * 更新动态
     * @param momentEntity 动态实体
     * @return 操作状态
     * 更新id = ？and uid = ？的数据的text内容
     * */
    @Update("UPDATE moment SET text=#{text} where id = #{id} AND user_id = #{userId}")
    int update(MomentEntity momentEntity);


    /**
     * 查询动态
     * @param momentEntity 动态实体
     * @return momentEntity 动态实体
     * 查询id = ？ and uid = ？ 的所有动态
     * */
    @Select("SELECT * FROM moment where id = #{id} AND user_id = #{userId}")
    MomentEntity selectOne(MomentEntity momentEntity);


    /**
     * 查询所有动态
     * */
    @Select("SELECT * FROM moment")
    List<MomentEntity> selectAll();
}
