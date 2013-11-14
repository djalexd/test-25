package com.github.acme.tests.transaction;

import java.util.Collection;

/**
 * We can get this somehow.
 *
 * User: alexandru.DOBJANSCHI
 * Date: 11/14/13
 * Time: 11:55 AM
 */
public interface ServiceAClient {

    Collection<Transaction> getUserTransactions(Long userId, Long timestamp);
}
