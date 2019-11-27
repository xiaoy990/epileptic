package com.join.epileptic.entity.hzhGeneral;

import java.io.Serializable;

/**
 * hzh_general
 * @author 
 */
public class HzhGeneral implements Serializable {
    private Integer id;

    private String name;

    private String birthday;

    private Integer age;

    private String province;

    private String city;

    private String town;

    private String nation;

    private String sfname;

    private String relation;

    private String address;

    private String mobile;

    /**
     * 患者编号
     */
    private String sicknum;

    /**
     * 负责医生
     */
    private String doctor;

    /**
     * 调查日期
     */
    private String surveyTime;

    /**
     * 住院号
     */
    private String livenum;

    /**
     * 性别
     */
    private String six;

    /**
     * 居住城市
     */
    private String citys;

    /**
     * 乡镇
     */
    private String xz;

    /**
     * 农村
     */
    private String nc;

    /**
     * 详细地址
     */
    private String ne;

    /**
     * 母孕龄
     */
    private Integer mather;

    /**
     * 父孕龄
     */
    private Integer father;

    /**
     * 胎
     */
    private Integer tais;

    /**
     * 产
     */
    private Integer chan;

    /**
     * 周
     */
    private Integer zhou;

    /**
     * 产子方式
     */
    private String ctype;

    /**
     * kg
     */
    private Integer kg;

    /**
     * 母孕期病史
     */
    private Integer myqbs;

    /**
     * 母孕期病史介绍
     */
    private String myqbses;

    /**
     * 生后病史
     */
    private String shbs;

    /**
     * 发育迟缓
     */
    private Integer fych;

    /**
     * 运动迟缓
     */
    private String action;

    /**
     * 运动迟缓介绍
     */
    private String actions;

    /**
     * 抬头
     */
    private Integer tai;

    /**
     * 翻身
     */
    private Integer fan;

    /**
     * 独坐
     */
    private Integer dz;

    /**
     * 爬行
     */
    private Integer pa;

    /**
     * 独走
     */
    private Integer zou;

    /**
     * 语言发育迟缓
     */
    private String lau;

    /**
     * 语言发育迟缓介绍
     */
    private String laus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSicknum() {
        return sicknum;
    }

    public void setSicknum(String sicknum) {
        this.sicknum = sicknum;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSurveyTime() {
        return surveyTime;
    }

    public void setSurveyTime(String surveyTime) {
        this.surveyTime = surveyTime;
    }

    public String getLivenum() {
        return livenum;
    }

    public void setLivenum(String livenum) {
        this.livenum = livenum;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getCitys() {
        return citys;
    }

    public void setCitys(String citys) {
        this.citys = citys;
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getNe() {
        return ne;
    }

    public void setNe(String ne) {
        this.ne = ne;
    }

    public Integer getMather() {
        return mather;
    }

    public void setMather(Integer mather) {
        this.mather = mather;
    }

    public Integer getFather() {
        return father;
    }

    public void setFather(Integer father) {
        this.father = father;
    }

    public Integer getTais() {
        return tais;
    }

    public void setTais(Integer tais) {
        this.tais = tais;
    }

    public Integer getChan() {
        return chan;
    }

    public void setChan(Integer chan) {
        this.chan = chan;
    }

    public Integer getZhou() {
        return zhou;
    }

    public void setZhou(Integer zhou) {
        this.zhou = zhou;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public Integer getMyqbs() {
        return myqbs;
    }

    public void setMyqbs(Integer myqbs) {
        this.myqbs = myqbs;
    }

    public String getMyqbses() {
        return myqbses;
    }

    public void setMyqbses(String myqbses) {
        this.myqbses = myqbses;
    }

    public String getShbs() {
        return shbs;
    }

    public void setShbs(String shbs) {
        this.shbs = shbs;
    }

    public Integer getFych() {
        return fych;
    }

    public void setFych(Integer fych) {
        this.fych = fych;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public Integer getTai() {
        return tai;
    }

    public void setTai(Integer tai) {
        this.tai = tai;
    }

    public Integer getFan() {
        return fan;
    }

    public void setFan(Integer fan) {
        this.fan = fan;
    }

    public Integer getDz() {
        return dz;
    }

    public void setDz(Integer dz) {
        this.dz = dz;
    }

    public Integer getPa() {
        return pa;
    }

    public void setPa(Integer pa) {
        this.pa = pa;
    }

    public Integer getZou() {
        return zou;
    }

    public void setZou(Integer zou) {
        this.zou = zou;
    }

    public String getLau() {
        return lau;
    }

    public void setLau(String lau) {
        this.lau = lau;
    }

    public String getLaus() {
        return laus;
    }

    public void setLaus(String laus) {
        this.laus = laus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HzhGeneral other = (HzhGeneral) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getTown() == null ? other.getTown() == null : this.getTown().equals(other.getTown()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getSfname() == null ? other.getSfname() == null : this.getSfname().equals(other.getSfname()))
            && (this.getRelation() == null ? other.getRelation() == null : this.getRelation().equals(other.getRelation()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getSicknum() == null ? other.getSicknum() == null : this.getSicknum().equals(other.getSicknum()))
            && (this.getDoctor() == null ? other.getDoctor() == null : this.getDoctor().equals(other.getDoctor()))
            && (this.getSurveyTime() == null ? other.getSurveyTime() == null : this.getSurveyTime().equals(other.getSurveyTime()))
            && (this.getLivenum() == null ? other.getLivenum() == null : this.getLivenum().equals(other.getLivenum()))
            && (this.getSix() == null ? other.getSix() == null : this.getSix().equals(other.getSix()))
            && (this.getCitys() == null ? other.getCitys() == null : this.getCitys().equals(other.getCitys()))
            && (this.getXz() == null ? other.getXz() == null : this.getXz().equals(other.getXz()))
            && (this.getNc() == null ? other.getNc() == null : this.getNc().equals(other.getNc()))
            && (this.getNe() == null ? other.getNe() == null : this.getNe().equals(other.getNe()))
            && (this.getMather() == null ? other.getMather() == null : this.getMather().equals(other.getMather()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getTais() == null ? other.getTais() == null : this.getTais().equals(other.getTais()))
            && (this.getChan() == null ? other.getChan() == null : this.getChan().equals(other.getChan()))
            && (this.getZhou() == null ? other.getZhou() == null : this.getZhou().equals(other.getZhou()))
            && (this.getCtype() == null ? other.getCtype() == null : this.getCtype().equals(other.getCtype()))
            && (this.getKg() == null ? other.getKg() == null : this.getKg().equals(other.getKg()))
            && (this.getMyqbs() == null ? other.getMyqbs() == null : this.getMyqbs().equals(other.getMyqbs()))
            && (this.getMyqbses() == null ? other.getMyqbses() == null : this.getMyqbses().equals(other.getMyqbses()))
            && (this.getShbs() == null ? other.getShbs() == null : this.getShbs().equals(other.getShbs()))
            && (this.getFych() == null ? other.getFych() == null : this.getFych().equals(other.getFych()))
            && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction()))
            && (this.getActions() == null ? other.getActions() == null : this.getActions().equals(other.getActions()))
            && (this.getTai() == null ? other.getTai() == null : this.getTai().equals(other.getTai()))
            && (this.getFan() == null ? other.getFan() == null : this.getFan().equals(other.getFan()))
            && (this.getDz() == null ? other.getDz() == null : this.getDz().equals(other.getDz()))
            && (this.getPa() == null ? other.getPa() == null : this.getPa().equals(other.getPa()))
            && (this.getZou() == null ? other.getZou() == null : this.getZou().equals(other.getZou()))
            && (this.getLau() == null ? other.getLau() == null : this.getLau().equals(other.getLau()))
            && (this.getLaus() == null ? other.getLaus() == null : this.getLaus().equals(other.getLaus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getTown() == null) ? 0 : getTown().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getSfname() == null) ? 0 : getSfname().hashCode());
        result = prime * result + ((getRelation() == null) ? 0 : getRelation().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getSicknum() == null) ? 0 : getSicknum().hashCode());
        result = prime * result + ((getDoctor() == null) ? 0 : getDoctor().hashCode());
        result = prime * result + ((getSurveyTime() == null) ? 0 : getSurveyTime().hashCode());
        result = prime * result + ((getLivenum() == null) ? 0 : getLivenum().hashCode());
        result = prime * result + ((getSix() == null) ? 0 : getSix().hashCode());
        result = prime * result + ((getCitys() == null) ? 0 : getCitys().hashCode());
        result = prime * result + ((getXz() == null) ? 0 : getXz().hashCode());
        result = prime * result + ((getNc() == null) ? 0 : getNc().hashCode());
        result = prime * result + ((getNe() == null) ? 0 : getNe().hashCode());
        result = prime * result + ((getMather() == null) ? 0 : getMather().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getTais() == null) ? 0 : getTais().hashCode());
        result = prime * result + ((getChan() == null) ? 0 : getChan().hashCode());
        result = prime * result + ((getZhou() == null) ? 0 : getZhou().hashCode());
        result = prime * result + ((getCtype() == null) ? 0 : getCtype().hashCode());
        result = prime * result + ((getKg() == null) ? 0 : getKg().hashCode());
        result = prime * result + ((getMyqbs() == null) ? 0 : getMyqbs().hashCode());
        result = prime * result + ((getMyqbses() == null) ? 0 : getMyqbses().hashCode());
        result = prime * result + ((getShbs() == null) ? 0 : getShbs().hashCode());
        result = prime * result + ((getFych() == null) ? 0 : getFych().hashCode());
        result = prime * result + ((getAction() == null) ? 0 : getAction().hashCode());
        result = prime * result + ((getActions() == null) ? 0 : getActions().hashCode());
        result = prime * result + ((getTai() == null) ? 0 : getTai().hashCode());
        result = prime * result + ((getFan() == null) ? 0 : getFan().hashCode());
        result = prime * result + ((getDz() == null) ? 0 : getDz().hashCode());
        result = prime * result + ((getPa() == null) ? 0 : getPa().hashCode());
        result = prime * result + ((getZou() == null) ? 0 : getZou().hashCode());
        result = prime * result + ((getLau() == null) ? 0 : getLau().hashCode());
        result = prime * result + ((getLaus() == null) ? 0 : getLaus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", town=").append(town);
        sb.append(", nation=").append(nation);
        sb.append(", sfname=").append(sfname);
        sb.append(", relation=").append(relation);
        sb.append(", address=").append(address);
        sb.append(", mobile=").append(mobile);
        sb.append(", sicknum=").append(sicknum);
        sb.append(", doctor=").append(doctor);
        sb.append(", surveyTime=").append(surveyTime);
        sb.append(", livenum=").append(livenum);
        sb.append(", six=").append(six);
        sb.append(", citys=").append(citys);
        sb.append(", xz=").append(xz);
        sb.append(", nc=").append(nc);
        sb.append(", ne=").append(ne);
        sb.append(", mather=").append(mather);
        sb.append(", father=").append(father);
        sb.append(", tais=").append(tais);
        sb.append(", chan=").append(chan);
        sb.append(", zhou=").append(zhou);
        sb.append(", ctype=").append(ctype);
        sb.append(", kg=").append(kg);
        sb.append(", myqbs=").append(myqbs);
        sb.append(", myqbses=").append(myqbses);
        sb.append(", shbs=").append(shbs);
        sb.append(", fych=").append(fych);
        sb.append(", action=").append(action);
        sb.append(", actions=").append(actions);
        sb.append(", tai=").append(tai);
        sb.append(", fan=").append(fan);
        sb.append(", dz=").append(dz);
        sb.append(", pa=").append(pa);
        sb.append(", zou=").append(zou);
        sb.append(", lau=").append(lau);
        sb.append(", laus=").append(laus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}