package com.github.acme.tests.transaction;

/**
 * <ul>
 *     <li>Fetch user transactions.</li>
 *     <li>can do this manual (triggered by a human), or scheduled.</li>
 *     <li>in_process transactions need to be re-scheduled.</li>
 *     <li>ok transactions get sent to another system (but we don't really care at this point,
 *     just log them).</li>
 *     <li>nok transactions get sent to the same system (and we should be entitled to ask
 *     for additional details before sending them to the other system).</li>
 * </ul>
 *
 * User: alexandru.DOBJANSCHI
 * Date: 11/14/13
 * Time: 11:56 AM
 */
public class ServiceB {


    /* TODO */
}
