package com.barry.elk.vo.business;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomInfo implements Serializable {

    private static final long serialVersionUID = 4341599199390759185L;

    /** 系统公司编号 */
    private String groupId;

    /** 客户标识列 */
    private String cusId;

    /** 客户类型 */
    private String cheZhuSort;

    /** 车主名称 */
    private String cheZhuName;

    /** 车主电话 */
    private String cheZhuTel;

    /** 车主手机 */
    private String cheZhuMob;

    /** 车主地址 */
    private String cheZhuAdd;

    /** 车主性别 */
    private String cheZhuXingBie;

    /** 车主省份 */
    private String cheZhuAreaP;

    /** 车主市 */
    private String cheZhuAreaC;

    /** 车主区 */
    private String cheZhuAreaA;

    /** 车主驾照日期 */
    private Date cheZhuJiaZhaoDate;

    /** 车主生日 */
    private Date cheZhuBirthday;

    /** 车主证件类型 */
    private String cheZhuCardSort;

    /** 车主证件号码 */
    private String cheZhuCardNo;

    /** 联系人姓名 */
    private String lianXiRenName;

    /** 联系人电话 */
    private String lianXiRenTel;

    /** 联系人手机 */
    private String lianXiRenMob;

    /** 联系人地址 */
    private String lianXiRenAdd;

    /** 联系人性别 */
    private String lianXiRenXingBie;

    /** 联系人省份 */
    private String lianXiRenAreaP;

    /** 联系人市 */
    private String lianXiRenAreaC;

    /** 联系人区 */
    private String lianXiRenAreaA;

    /** 联系人驾照日期 */
    private Date lianXiRenJiaZhaoDate;

    /** 联系人生日 */
    private Date lianXiRenBirthday;

    /** 联系人证件类型 */
    private String lianXiRenCardSort;

    /** 联系人证件号码 */
    private String lianXiRenCardNo;

    /** 车主所属行业 */
    private String cheZhuSuoShuHangYe;

    /** 车主关系类型 */
    private String cheZhuGuanXiSort;

    /** 车主家庭类型 */
    private String cheZhuJiaTingSort;

    /** 车主职业类型 */
    private String cheZhuZhiYeSort;

    /** 车主收入 */
    private String cheZhuShouRu;

    /** 车主爱好 */
    private String cheZhuAiHao;

    /** 车主学历 */
    private String cheZhuXueLi;

    /** 车主Email */
    private String cheZhuEMail;

    /** 车主工作单位 */
    private String cheZhuGongZuoDanWei;

    /** 联系人第一次领驾照日期 */
    private Date lianXiRenFirstJiaZhaoDate;

    /** 联系人驾照区域 */
    private String lianXiRenJiaZhaoArea;

    /** 联系人Email */
    private String lianXiRenEMail;

    /** 联系人工作单位 */
    private String lianXiRenGongZuoDanWei;

    /** 车主称谓 */
    private String cheZhuChengWei;

    /** 车主婚姻状况 */
    private String cheZhuHunYin;

    /** 车主子女数量 */
    private Integer cheZhuZiNvQty;

    /** 车主企业类型 */
    private String cheZhuQiYeSort;

    /** 车主主联系方式类型 */
    private String cheZhuMainTelSort;

    /** 车主第二电话 */
    private String cheZhuTelSub;

    /** 车主其它电话 */
    private String cheZhuOtherTel;

    /** 车主传真 */
    private String cheZhuChuanZhen;

    /** 联系人称谓 */
    private String lianXiRenChengWei;

    /** 联系人身份 */
    private String lianXiRenShenFen;

    /** 联系人职务 */
    private String lianXiRenZhiWei;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCheZhuSort() {
        return cheZhuSort;
    }

    public void setCheZhuSort(String cheZhuSort) {
        this.cheZhuSort = cheZhuSort;
    }

    public String getCheZhuName() {
        return cheZhuName;
    }

    public void setCheZhuName(String cheZhuName) {
        this.cheZhuName = cheZhuName;
    }

    public String getCheZhuTel() {
        return cheZhuTel;
    }

    public void setCheZhuTel(String cheZhuTel) {
        this.cheZhuTel = cheZhuTel;
    }

    public String getCheZhuMob() {
        return cheZhuMob;
    }

    public void setCheZhuMob(String cheZhuMob) {
        this.cheZhuMob = cheZhuMob;
    }

    public String getCheZhuAdd() {
        return cheZhuAdd;
    }

    public void setCheZhuAdd(String cheZhuAdd) {
        this.cheZhuAdd = cheZhuAdd;
    }

    public String getCheZhuXingBie() {
        return cheZhuXingBie;
    }

    public void setCheZhuXingBie(String cheZhuXingBie) {
        this.cheZhuXingBie = cheZhuXingBie;
    }

    public String getCheZhuAreaP() {
        return cheZhuAreaP;
    }

    public void setCheZhuAreaP(String cheZhuAreaP) {
        this.cheZhuAreaP = cheZhuAreaP;
    }

    public String getCheZhuAreaC() {
        return cheZhuAreaC;
    }

    public void setCheZhuAreaC(String cheZhuAreaC) {
        this.cheZhuAreaC = cheZhuAreaC;
    }

    public String getCheZhuAreaA() {
        return cheZhuAreaA;
    }

    public void setCheZhuAreaA(String cheZhuAreaA) {
        this.cheZhuAreaA = cheZhuAreaA;
    }

    public Date getCheZhuJiaZhaoDate() {
        return cheZhuJiaZhaoDate;
    }

    public void setCheZhuJiaZhaoDate(Date cheZhuJiaZhaoDate) {
        this.cheZhuJiaZhaoDate = cheZhuJiaZhaoDate;
    }

    public Date getCheZhuBirthday() {
        return cheZhuBirthday;
    }

    public void setCheZhuBirthday(Date cheZhuBirthday) {
        this.cheZhuBirthday = cheZhuBirthday;
    }

    public String getCheZhuCardSort() {
        return cheZhuCardSort;
    }

    public void setCheZhuCardSort(String cheZhuCardSort) {
        this.cheZhuCardSort = cheZhuCardSort;
    }

    public String getCheZhuCardNo() {
        return cheZhuCardNo;
    }

    public void setCheZhuCardNo(String cheZhuCardNo) {
        this.cheZhuCardNo = cheZhuCardNo;
    }

    public String getLianXiRenName() {
        return lianXiRenName;
    }

    public void setLianXiRenName(String lianXiRenName) {
        this.lianXiRenName = lianXiRenName;
    }

    public String getLianXiRenTel() {
        return lianXiRenTel;
    }

    public void setLianXiRenTel(String lianXiRenTel) {
        this.lianXiRenTel = lianXiRenTel;
    }

    public String getLianXiRenMob() {
        return lianXiRenMob;
    }

    public void setLianXiRenMob(String lianXiRenMob) {
        this.lianXiRenMob = lianXiRenMob;
    }

    public String getLianXiRenAdd() {
        return lianXiRenAdd;
    }

    public void setLianXiRenAdd(String lianXiRenAdd) {
        this.lianXiRenAdd = lianXiRenAdd;
    }

    public String getLianXiRenXingBie() {
        return lianXiRenXingBie;
    }

    public void setLianXiRenXingBie(String lianXiRenXingBie) {
        this.lianXiRenXingBie = lianXiRenXingBie;
    }

    public String getLianXiRenAreaP() {
        return lianXiRenAreaP;
    }

    public void setLianXiRenAreaP(String lianXiRenAreaP) {
        this.lianXiRenAreaP = lianXiRenAreaP;
    }

    public String getLianXiRenAreaC() {
        return lianXiRenAreaC;
    }

    public void setLianXiRenAreaC(String lianXiRenAreaC) {
        this.lianXiRenAreaC = lianXiRenAreaC;
    }

    public String getLianXiRenAreaA() {
        return lianXiRenAreaA;
    }

    public void setLianXiRenAreaA(String lianXiRenAreaA) {
        this.lianXiRenAreaA = lianXiRenAreaA;
    }

    public Date getLianXiRenJiaZhaoDate() {
        return lianXiRenJiaZhaoDate;
    }

    public void setLianXiRenJiaZhaoDate(Date lianXiRenJiaZhaoDate) {
        this.lianXiRenJiaZhaoDate = lianXiRenJiaZhaoDate;
    }

    public Date getLianXiRenBirthday() {
        return lianXiRenBirthday;
    }

    public void setLianXiRenBirthday(Date lianXiRenBirthday) {
        this.lianXiRenBirthday = lianXiRenBirthday;
    }

    public String getLianXiRenCardSort() {
        return lianXiRenCardSort;
    }

    public void setLianXiRenCardSort(String lianXiRenCardSort) {
        this.lianXiRenCardSort = lianXiRenCardSort;
    }

    public String getLianXiRenCardNo() {
        return lianXiRenCardNo;
    }

    public void setLianXiRenCardNo(String lianXiRenCardNo) {
        this.lianXiRenCardNo = lianXiRenCardNo;
    }

    public String getCheZhuSuoShuHangYe() {
        return cheZhuSuoShuHangYe;
    }

    public void setCheZhuSuoShuHangYe(String cheZhuSuoShuHangYe) {
        this.cheZhuSuoShuHangYe = cheZhuSuoShuHangYe;
    }

    public String getCheZhuGuanXiSort() {
        return cheZhuGuanXiSort;
    }

    public void setCheZhuGuanXiSort(String cheZhuGuanXiSort) {
        this.cheZhuGuanXiSort = cheZhuGuanXiSort;
    }

    public String getCheZhuJiaTingSort() {
        return cheZhuJiaTingSort;
    }

    public void setCheZhuJiaTingSort(String cheZhuJiaTingSort) {
        this.cheZhuJiaTingSort = cheZhuJiaTingSort;
    }

    public String getCheZhuZhiYeSort() {
        return cheZhuZhiYeSort;
    }

    public void setCheZhuZhiYeSort(String cheZhuZhiYeSort) {
        this.cheZhuZhiYeSort = cheZhuZhiYeSort;
    }

    public String getCheZhuShouRu() {
        return cheZhuShouRu;
    }

    public void setCheZhuShouRu(String cheZhuShouRu) {
        this.cheZhuShouRu = cheZhuShouRu;
    }

    public String getCheZhuAiHao() {
        return cheZhuAiHao;
    }

    public void setCheZhuAiHao(String cheZhuAiHao) {
        this.cheZhuAiHao = cheZhuAiHao;
    }

    public String getCheZhuXueLi() {
        return cheZhuXueLi;
    }

    public void setCheZhuXueLi(String cheZhuXueLi) {
        this.cheZhuXueLi = cheZhuXueLi;
    }

    public String getCheZhuEMail() {
        return cheZhuEMail;
    }

    public void setCheZhuEMail(String cheZhuEMail) {
        this.cheZhuEMail = cheZhuEMail;
    }

    public String getCheZhuGongZuoDanWei() {
        return cheZhuGongZuoDanWei;
    }

    public void setCheZhuGongZuoDanWei(String cheZhuGongZuoDanWei) {
        this.cheZhuGongZuoDanWei = cheZhuGongZuoDanWei;
    }

    public Date getLianXiRenFirstJiaZhaoDate() {
        return lianXiRenFirstJiaZhaoDate;
    }

    public void setLianXiRenFirstJiaZhaoDate(Date lianXiRenFirstJiaZhaoDate) {
        this.lianXiRenFirstJiaZhaoDate = lianXiRenFirstJiaZhaoDate;
    }

    public String getLianXiRenJiaZhaoArea() {
        return lianXiRenJiaZhaoArea;
    }

    public void setLianXiRenJiaZhaoArea(String lianXiRenJiaZhaoArea) {
        this.lianXiRenJiaZhaoArea = lianXiRenJiaZhaoArea;
    }

    public String getLianXiRenEMail() {
        return lianXiRenEMail;
    }

    public void setLianXiRenEMail(String lianXiRenEMail) {
        this.lianXiRenEMail = lianXiRenEMail;
    }

    public String getLianXiRenGongZuoDanWei() {
        return lianXiRenGongZuoDanWei;
    }

    public void setLianXiRenGongZuoDanWei(String lianXiRenGongZuoDanWei) {
        this.lianXiRenGongZuoDanWei = lianXiRenGongZuoDanWei;
    }

    public String getCheZhuChengWei() {
        return cheZhuChengWei;
    }

    public void setCheZhuChengWei(String cheZhuChengWei) {
        this.cheZhuChengWei = cheZhuChengWei;
    }

    public String getCheZhuHunYin() {
        return cheZhuHunYin;
    }

    public void setCheZhuHunYin(String cheZhuHunYin) {
        this.cheZhuHunYin = cheZhuHunYin;
    }

    public Integer getCheZhuZiNvQty() {
        return cheZhuZiNvQty;
    }

    public void setCheZhuZiNvQty(Integer cheZhuZiNvQty) {
        this.cheZhuZiNvQty = cheZhuZiNvQty;
    }

    public String getCheZhuQiYeSort() {
        return cheZhuQiYeSort;
    }

    public void setCheZhuQiYeSort(String cheZhuQiYeSort) {
        this.cheZhuQiYeSort = cheZhuQiYeSort;
    }

    public String getCheZhuMainTelSort() {
        return cheZhuMainTelSort;
    }

    public void setCheZhuMainTelSort(String cheZhuMainTelSort) {
        this.cheZhuMainTelSort = cheZhuMainTelSort;
    }

    public String getCheZhuTelSub() {
        return cheZhuTelSub;
    }

    public void setCheZhuTelSub(String cheZhuTelSub) {
        this.cheZhuTelSub = cheZhuTelSub;
    }

    public String getCheZhuOtherTel() {
        return cheZhuOtherTel;
    }

    public void setCheZhuOtherTel(String cheZhuOtherTel) {
        this.cheZhuOtherTel = cheZhuOtherTel;
    }

    public String getCheZhuChuanZhen() {
        return cheZhuChuanZhen;
    }

    public void setCheZhuChuanZhen(String cheZhuChuanZhen) {
        this.cheZhuChuanZhen = cheZhuChuanZhen;
    }

    public String getLianXiRenChengWei() {
        return lianXiRenChengWei;
    }

    public void setLianXiRenChengWei(String lianXiRenChengWei) {
        this.lianXiRenChengWei = lianXiRenChengWei;
    }

    public String getLianXiRenShenFen() {
        return lianXiRenShenFen;
    }

    public void setLianXiRenShenFen(String lianXiRenShenFen) {
        this.lianXiRenShenFen = lianXiRenShenFen;
    }

    public String getLianXiRenZhiWei() {
        return lianXiRenZhiWei;
    }

    public void setLianXiRenZhiWei(String lianXiRenZhiWei) {
        this.lianXiRenZhiWei = lianXiRenZhiWei;
    }

}
