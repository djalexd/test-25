package com.github.acme.tests.transfer;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * For future me: implement a correct hashCode over the byte array of input stream.
 *
 * @author alex.dobjanschi
 * @since 9:39 AM 10/24/14
 */
public interface FileFile {

    InputStream getInputStream();
    OutputStream getOutputStream();
}
