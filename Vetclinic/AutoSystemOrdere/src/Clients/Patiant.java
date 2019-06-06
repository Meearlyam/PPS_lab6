package Clients;

import java.sql.Date;

public class Patiant {
    private int id;
    private String type;
    private String ownerName;
    private String nickname;
    private String sex;
    private Date birthday;
    private int medHistNum;
    static int lastId = 0;

    public Patiant() { }

    public Patiant(Date birthday, String sex, String email,
                   String ownerName, String type, String nickname, int medHistNum) {
        this.id = lastId + 1;
        lastId = lastId + 1;
        this.sex = sex;
        this.birthday = birthday;
        this.ownerName = ownerName;
        this.type = type;
        this.nickname = nickname;
        this.medHistNum = medHistNum;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMedHistNum() { return medHistNum; }

    public void setMedHistNum(int medHistNum) {
        this.medHistNum = medHistNum;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() { return sex; }

    @Override
    public String toString(){
        return (id + " " + type + " " + nickname + " " + ownerName + " " +
                sex + " " + birthday);
    }
}
