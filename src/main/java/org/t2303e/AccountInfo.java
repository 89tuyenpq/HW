package org.t2303e;

import java.util.Date;

public class AccountInfo {
    private int transId;
    private String cardType;
    private String name;
    private String cardNo;
    private String idCard;
    private String msisdn;
    private String address;
    private Date dateOfBirth;

    public AccountInfo() {
        // Constructor mặc định không nhận tham số
    }

    public AccountInfo(int transId, String cardType, String name, String cardNo, String idCard, String msisdn, String address, Date dateOfBirth) {
        this.transId = transId;
        this.cardType = cardType;
        this.name = name;
        this.cardNo = cardNo;
        this.idCard = idCard;
        this.msisdn = msisdn;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
