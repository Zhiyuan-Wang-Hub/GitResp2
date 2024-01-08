package com.msb.test13;

/**
 * @author wzy
 * @create 2024-01-03 23:00
 */
public class Book {
    private int bNo;
    private String bName;
    private String bAuthor;

    public int getBNo() {
        return bNo;
    }

    public void setBNo(int bNo) {
        this.bNo = bNo;
    }

    public java.lang.String getbName() {
        return bName;
    }

    public void setbName(java.lang.String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public Book(int bNo, String bName, String bAuthor) {
        this.bNo = bNo;
        this.bName = bName;
        this.bAuthor = bAuthor;
    }
    public Book(){

    }
}
