package cn.surine.moment_demo.Entities;

public class JsonUtil {
    private int jCode;   //状态码
    private String jMsg;  //状态信息
    private Object jData;   //携带的数据

    public JsonUtil(int jCode, String jMsg, Object jData) {
        this.jCode = jCode;
        this.jMsg = jMsg;
        this.jData = jData;
    }

    public JsonUtil() {
    }

    public void setOk(Object data){
        this.jCode = 2000;
        this.jMsg = "操作成功";
        this.setjData(data);
    }

    public void setFail(Object data){
        this.jCode = 4000;
        this.jMsg = "操作失败";
        this.setjData(data);
    }

    public void setEmptyParam(Object data){
        this.jCode = 5000;
        this.jMsg = "参数为空";
        this.setjData(data);
    }


    public int getjCode() {
        return jCode;
    }

    public void setjCode(int jCode) {
        this.jCode = jCode;
    }

    public String getjMsg() {
        return jMsg;
    }

    public void setjMsg(String jMsg) {
        this.jMsg = jMsg;
    }

    public Object getjData() {
        return jData;
    }

    public void setjData(Object jData) {
        this.jData = jData;
    }
}
