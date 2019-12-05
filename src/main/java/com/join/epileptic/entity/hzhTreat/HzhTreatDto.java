package com.join.epileptic.entity.hzhTreat;

public class HzhTreatDto {
    private Integer id;

    private String firstdrug;

    private String firstdrugreason;

    private String anddrug;

    private String anddrugreason;

    private String othertreat;

    private String treatreason;

    private String firsttime;

    private String treatreturn;

    private String firstdate;

    private Integer childId;

    private String name;

    private String sicknum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstdrug() {
        return firstdrug;
    }

    public void setFirstdrug(String firstdrug) {
        this.firstdrug = firstdrug;
    }

    public String getFirstdrugreason() {
        return firstdrugreason;
    }

    public void setFirstdrugreason(String firstdrugreason) {
        this.firstdrugreason = firstdrugreason;
    }

    public String getAnddrug() {
        return anddrug;
    }

    public void setAnddrug(String anddrug) {
        this.anddrug = anddrug;
    }

    public String getAnddrugreason() {
        return anddrugreason;
    }

    public void setAnddrugreason(String anddrugreason) {
        this.anddrugreason = anddrugreason;
    }

    public String getOthertreat() {
        return othertreat;
    }

    public void setOthertreat(String othertreat) {
        this.othertreat = othertreat;
    }

    public String getTreatreason() {
        return treatreason;
    }

    public void setTreatreason(String treatreason) {
        this.treatreason = treatreason;
    }

    public String getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(String firsttime) {
        this.firsttime = firsttime;
    }

    public String getTreatreturn() {
        return treatreturn;
    }

    public void setTreatreturn(String treatreturn) {
        this.treatreturn = treatreturn;
    }

    public String getFirstdate() {
        return firstdate;
    }

    public void setFirstdate(String firstdate) {
        this.firstdate = firstdate;
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
        return "HzhTreatDto{" +
                "id=" + id +
                ", firstdrug='" + firstdrug + '\'' +
                ", firstdrugreason='" + firstdrugreason + '\'' +
                ", anddrug='" + anddrug + '\'' +
                ", anddrugreason='" + anddrugreason + '\'' +
                ", othertreat='" + othertreat + '\'' +
                ", treatreason='" + treatreason + '\'' +
                ", firsttime='" + firsttime + '\'' +
                ", treatreturn='" + treatreturn + '\'' +
                ", firstdate='" + firstdate + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", sicknum='" + sicknum + '\'' +
                '}';
    }
}
