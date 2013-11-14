package com.github.acme.tests.money;

import java.util.Locale;

/**
 * User: alexandru.DOBJANSCHI
 * Date: 11/14/13
 * Time: 11:45 AM
 */
public class MoneyUtils {
    /**
     * Formats the money to Strings like this: "13.5 $".
     * @param money
     * @return
     */
    public static String formatMoney(MoneyHolder money) {
        return String.format(Locale.getDefault(),
                "%s %s", money.getValue(), money.getCurrency());
    }
}
