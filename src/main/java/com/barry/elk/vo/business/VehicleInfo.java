package com.barry.elk.vo.business;

import java.io.Serializable;
import java.util.Date;

public class VehicleInfo implements Serializable {

    private static final long serialVersionUID = 1648319017135003624L;

    private String id;

    /** boss 系统公司编号 */
    private String groupId;

    /** 客户标识列 */
    private String cusId;

    /** 厂家品牌 */
    private String changPai;

    /** 车系 */
    private String cheXi;

    /** 车型代码 */
    private String cheXingDaiMa;

    /** 车架号码 */
    private String cheJiaHao;

    /** 发动机号码 */
    private String faDongJiHao;

    /** 车牌号码 */
    private String chePaiHao;

    /** 车身颜色 */
    private String chePaiYanSe;

    /** 变速箱号码 */
    private String bianSuXiangHao;

    /** 产地 */
    private String chanDi;

    /** 购车日期 */
    private Date gouCheDate;

    /** 保险日期 */
    private Date baoXianDate;

    /** 制造日期 */
    private Date zhiZaoDate;

    /** 内饰颜色 */
    private String neiShiYanSe;

    /** 商检单号 */
    private String shangJianDanHao;

    /** 合格证号码 */
    private String heGeZhengHao;

    /** 进口证书号码 */
    private String jinKouZhengHao;

    /** 车辆规格 */
    private String cheLiangGuiGe;

    /** 车辆类型 */
    private String cheLiangSort;

    /** 下次年审日期 */
    private Date nextExaDate;

    /** 是否自店销售 */
    private String isZiDianSale;

    /** 销售顾问 */
    private String saleName;

    /** 销售合同编号 */
    private String saleBillNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getChangPai() {
        return changPai;
    }

    public void setChangPai(String changPai) {
        this.changPai = changPai;
    }

    public String getCheXi() {
        return cheXi;
    }

    public void setCheXi(String cheXi) {
        this.cheXi = cheXi;
    }

    public String getCheXingDaiMa() {
        return cheXingDaiMa;
    }

    public void setCheXingDaiMa(String cheXingDaiMa) {
        this.cheXingDaiMa = cheXingDaiMa;
    }

    public String getCheJiaHao() {
        return cheJiaHao;
    }

    public void setCheJiaHao(String cheJiaHao) {
        this.cheJiaHao = cheJiaHao;
    }

    public String getFaDongJiHao() {
        return faDongJiHao;
    }

    public void setFaDongJiHao(String faDongJiHao) {
        this.faDongJiHao = faDongJiHao;
    }

    public String getChePaiHao() {
        return chePaiHao;
    }

    public void setChePaiHao(String chePaiHao) {
        this.chePaiHao = chePaiHao;
    }

    public String getChePaiYanSe() {
        return chePaiYanSe;
    }

    public void setChePaiYanSe(String chePaiYanSe) {
        this.chePaiYanSe = chePaiYanSe;
    }

    public String getBianSuXiangHao() {
        return bianSuXiangHao;
    }

    public void setBianSuXiangHao(String bianSuXiangHao) {
        this.bianSuXiangHao = bianSuXiangHao;
    }

    public String getChanDi() {
        return chanDi;
    }

    public void setChanDi(String chanDi) {
        this.chanDi = chanDi;
    }

    public Date getGouCheDate() {
        return gouCheDate;
    }

    public void setGouCheDate(Date gouCheDate) {
        this.gouCheDate = gouCheDate;
    }

    public Date getBaoXianDate() {
        return baoXianDate;
    }

    public void setBaoXianDate(Date baoXianDate) {
        this.baoXianDate = baoXianDate;
    }

    public Date getZhiZaoDate() {
        return zhiZaoDate;
    }

    public void setZhiZaoDate(Date zhiZaoDate) {
        this.zhiZaoDate = zhiZaoDate;
    }

    public String getNeiShiYanSe() {
        return neiShiYanSe;
    }

    public void setNeiShiYanSe(String neiShiYanSe) {
        this.neiShiYanSe = neiShiYanSe;
    }

    public String getShangJianDanHao() {
        return shangJianDanHao;
    }

    public void setShangJianDanHao(String shangJianDanHao) {
        this.shangJianDanHao = shangJianDanHao;
    }

    public String getHeGeZhengHao() {
        return heGeZhengHao;
    }

    public void setHeGeZhengHao(String heGeZhengHao) {
        this.heGeZhengHao = heGeZhengHao;
    }

    public String getJinKouZhengHao() {
        return jinKouZhengHao;
    }

    public void setJinKouZhengHao(String jinKouZhengHao) {
        this.jinKouZhengHao = jinKouZhengHao;
    }

    public String getCheLiangGuiGe() {
        return cheLiangGuiGe;
    }

    public void setCheLiangGuiGe(String cheLiangGuiGe) {
        this.cheLiangGuiGe = cheLiangGuiGe;
    }

    public String getCheLiangSort() {
        return cheLiangSort;
    }

    public void setCheLiangSort(String cheLiangSort) {
        this.cheLiangSort = cheLiangSort;
    }

    public Date getNextExaDate() {
        return nextExaDate;
    }

    public void setNextExaDate(Date nextExaDate) {
        this.nextExaDate = nextExaDate;
    }

    public String getIsZiDianSale() {
        return isZiDianSale;
    }

    public void setIsZiDianSale(String isZiDianSale) {
        this.isZiDianSale = isZiDianSale;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSaleBillNo() {
        return saleBillNo;
    }

    public void setSaleBillNo(String saleBillNo) {
        this.saleBillNo = saleBillNo;
    }

}
