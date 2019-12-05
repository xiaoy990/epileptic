package com.join.epileptic.entity.hzhFlup;

public class HzhFlupDto {
    private Integer id;

    private String pic;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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
        return "HzhFlupDto{" +
                "id=" + id +
                ", pic='" + pic + '\'' +
                ", content='" + content + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", sicknum=" + sicknum +
                '}';
    }
}
