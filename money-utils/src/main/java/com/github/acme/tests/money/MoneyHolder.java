package com.github.acme.tests.money;

/**
 * User: alexandru.DOBJANSCHI
 * Date: 11/14/13
 * Time: 11:44 AM
 */
public class MoneyHolder {

    private Double value;
    private Currency currency;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
