package cn.surine.moment_demo.Entities;

public class MomentEntity {

    private int id;
    private String text;
    private int userId;
    private long loveNum;
    private long reviewNum;

    public MomentEntity() {
    }

    public MomentEntity(int id, String text, int userId, long loveNum, long reviewNum) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.loveNum = loveNum;
        this.reviewNum = reviewNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getLoveNum() {
        return loveNum;
    }

    public void setLoveNum(long loveNum) {
        this.loveNum = loveNum;
    }

    public long getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(long reviewNum) {
        this.reviewNum = reviewNum;
    }
}
