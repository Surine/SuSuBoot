package cn.surine.moment_demo.Controller;

import cn.surine.moment_demo.Entities.JsonUtil;
import cn.surine.moment_demo.Entities.MomentEntity;
import cn.surine.moment_demo.Service.MomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/moment")
public class MomentController {

    @Autowired
    private MomentService momentService;

     /**
     * 插入数据
     * @param text 文本内容
     * @param uid 发送者用户id
     * @return JsonUtil
     * */
    @RequestMapping(value = "/sendMoment",method = RequestMethod.POST)
    public JsonUtil sendMoment(
            @RequestParam(value = "text") String text,
            @RequestParam(value = "uid") int uid
    ){
       MomentEntity momentEntity = new MomentEntity();
       momentEntity.setText(text);
       momentEntity.setUserId(uid);
       return momentService.sendMoment(momentEntity);
    }


    /**
     * 删除动态
     * @param id 动态id
     * @param uid 发送者用户id
     * @return JsonUtil
     * */
    @RequestMapping(value = "/deleteMoment")
    public JsonUtil deleteMoment(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "uid") int uid
    ){
        MomentEntity momentEntity = new MomentEntity();
        momentEntity.setId(id);
        momentEntity.setUserId(uid);
        return momentService.deleteMoment(momentEntity);
    }

    /**
     * 更新动态
     * @param id 动态id
     * @param uid 发送者用户id
     * @param text 动态新内容
     * @return JsonUtil
     * */
    @RequestMapping(value = "/updateMoment",method = RequestMethod.POST)
    public JsonUtil updateMoment(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "uid") int uid,
            @RequestParam(value = "text") String text
    ){
        MomentEntity momentEntity = new MomentEntity();
        momentEntity.setId(id);
        momentEntity.setUserId(uid);
        momentEntity.setText(text);
        return momentService.updateMoment(momentEntity);
    }


    /**
     * 按照id获取动态
     * @param id 动态id
     * @param uid 发送者用户id
     * @return JsonUtil
     * */
    @RequestMapping(value = "/getOneMoment")
    public JsonUtil getOneMoment(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "uid") int uid
    ){
        MomentEntity momentEntity = new MomentEntity();
        momentEntity.setId(id);
        momentEntity.setUserId(uid);
        return momentService.getOneMoment(momentEntity);
    }


    /**
     * 获取动态列表
     * @return JsonUtil
     * */
    @RequestMapping(value = "/getMoments")
    public JsonUtil getMoments(){
        return momentService.getMoments();
    }
}
