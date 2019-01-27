package cn.surine.moment_demo.Service;

import cn.surine.moment_demo.Entities.JsonUtil;
import cn.surine.moment_demo.Entities.MomentEntity;
import cn.surine.moment_demo.Mapper.MomentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MomentService {

    @Autowired
    private MomentMapper momentMapper;
    JsonUtil json = new JsonUtil();


    /**
     * 插入数据
     * @param momentEntity 动态实体
     * @return JsonUtil
     * */
    public JsonUtil sendMoment(MomentEntity momentEntity){
        //检测参数是否为空
        if(momentEntity == null || momentEntity.getText().isEmpty()){
            json.setEmptyParam(null);
            return json;
        }
        //正式插入
        int status = momentMapper.insert(momentEntity);
        //插入状态
        if(status >= 1){
            json.setOk(null);
        }else{
            json.setFail(null);
        }
        return json;
    }


    /**
     * 删除数据
     * @param momentEntity 动态实体
     * @return JsonUtil
     * */
    public JsonUtil deleteMoment(MomentEntity momentEntity){
        //检测参数是否为空
        if(momentEntity == null){
            json.setEmptyParam(null);
            return json;
        }
        //正式删除
        int status = momentMapper.delete(momentEntity);
        //状态
        if(status >= 1){
            json.setOk(null);
        }else{
            json.setFail(null);
        }
        return json;
    }


    /**
     * 更新数据
     * @param momentEntity 动态实体
     * @return JsonUtil
     * */
    public JsonUtil updateMoment(MomentEntity momentEntity){
        //检测参数是否为空
        if(momentEntity == null || momentEntity.getText().isEmpty()){
            json.setEmptyParam(null);
            return json;
        }
        //正式更新
        int status = momentMapper.update(momentEntity);
        //状态
        if(status >= 1){
            json.setOk(null);
        }else{
            json.setFail(null);
        }
        return json;
    }


    /**
     * 查询单条数据
     * @param momentEntity 动态实体
     * @return JsonUtil
     * */
    public JsonUtil getOneMoment(MomentEntity momentEntity){
        //检测参数是否为空
        if(momentEntity == null){
            json.setEmptyParam(null);
            return json;
        }
        MomentEntity seletMoment= momentMapper.selectOne(momentEntity);
        //状态
        if(seletMoment != null){
            json.setOk(seletMoment);
        }else{
            json.setFail(null);
        }
        return json;
    }


    /**
     * 查询所有数据
     * @return JsonUtil
     * */
    public JsonUtil getMoments(){
        List<MomentEntity> momentEntityList = momentMapper.selectAll();
        //状态
        if(momentEntityList != null){
            json.setOk(momentEntityList);
        }else{
            json.setFail(null);
        }
        return json;
    }
}
