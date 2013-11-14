package com.github.acme.tests.transaction;

/**
 * User: alexandru.DOBJANSCHI
 * Date: 11/14/13
 * Time: 11:55 AM
 */
public class Transaction {

    private Long userId;
    private Long timestamp;
    private Integer status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
