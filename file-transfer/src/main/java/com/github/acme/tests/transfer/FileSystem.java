package com.github.acme.tests.transfer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;

/**
 * An simplified, abstract file system.
 *
 * @author alex.dobjanschi
 * @since 9:32 AM 10/24/14
 */
public interface FileSystem {

    /**
     * Called once for each file.
     * @param in
     * @throws IOException
     */
    void upload(FileFile in) throws IOException;

    /**
     * Called once.
     * @return
     * @throws IOException
     */
    Collection<FileFile> downloadFiles() throws IOException;



}
