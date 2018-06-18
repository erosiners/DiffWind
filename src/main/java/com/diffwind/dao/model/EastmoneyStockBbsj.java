package com.diffwind.dao.model;

import java.util.Date;

public class EastmoneyStockBbsj {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eastmoney_stock_bbsj.symbol
     *
     * @mbggenerated
     */
    private String symbol;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eastmoney_stock_bbsj.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eastmoney_stock_bbsj.yuyue_date
     *
     * @mbggenerated
     */
    private Date yuyueDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eastmoney_stock_bbsj.pilu_date
     *
     * @mbggenerated
     */
    private Date piluDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eastmoney_stock_bbsj.finance_date
     *
     * @mbggenerated
     */
    private Date financeDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eastmoney_stock_bbsj.symbol
     *
     * @return the value of eastmoney_stock_bbsj.symbol
     *
     * @mbggenerated
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eastmoney_stock_bbsj.symbol
     *
     * @param symbol the value for eastmoney_stock_bbsj.symbol
     *
     * @mbggenerated
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eastmoney_stock_bbsj.code
     *
     * @return the value of eastmoney_stock_bbsj.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eastmoney_stock_bbsj.code
     *
     * @param code the value for eastmoney_stock_bbsj.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eastmoney_stock_bbsj.yuyue_date
     *
     * @return the value of eastmoney_stock_bbsj.yuyue_date
     *
     * @mbggenerated
     */
    public Date getYuyueDate() {
        return yuyueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eastmoney_stock_bbsj.yuyue_date
     *
     * @param yuyueDate the value for eastmoney_stock_bbsj.yuyue_date
     *
     * @mbggenerated
     */
    public void setYuyueDate(Date yuyueDate) {
        this.yuyueDate = yuyueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eastmoney_stock_bbsj.pilu_date
     *
     * @return the value of eastmoney_stock_bbsj.pilu_date
     *
     * @mbggenerated
     */
    public Date getPiluDate() {
        return piluDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eastmoney_stock_bbsj.pilu_date
     *
     * @param piluDate the value for eastmoney_stock_bbsj.pilu_date
     *
     * @mbggenerated
     */
    public void setPiluDate(Date piluDate) {
        this.piluDate = piluDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eastmoney_stock_bbsj.finance_date
     *
     * @return the value of eastmoney_stock_bbsj.finance_date
     *
     * @mbggenerated
     */
    public Date getFinanceDate() {
        return financeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eastmoney_stock_bbsj.finance_date
     *
     * @param financeDate the value for eastmoney_stock_bbsj.finance_date
     *
     * @mbggenerated
     */
    public void setFinanceDate(Date financeDate) {
        this.financeDate = financeDate;
    }
}