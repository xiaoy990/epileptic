package com.join.epileptic.entity.hzhDiagnose;

public class HzhDiagnoseDto {
    private Integer id;

    private String remake;

    private String content;

    private Integer childId;

    private String name;

    private String sicknum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSicknum() {
        return sicknum;
    }

    public void setSicknum(String sicknum) {
        this.sicknum = sicknum;
    }

    @Override
    public String toString() {
        return "HzhDiagnoseDto{" +
                "id=" + id +
                ", remake='" + remake + '\'' +
                ", content='" + content + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", sicknum='" + sicknum + '\'' +
                '}';
    }
}
