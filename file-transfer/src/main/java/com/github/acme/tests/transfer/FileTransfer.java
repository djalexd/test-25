package com.github.acme.tests.transfer;

import java.io.IOException;

/**
 * @author alex.dobjanschi
 * @since 9:36 AM 10/24/14
 */
public interface FileTransfer {

    void transferBetweenAAndB(FileSystem fileSystemA, FileSystem fileSystemB) throws IOException;

}
