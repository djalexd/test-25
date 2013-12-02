package com.github.acme.tests.optimizations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author alexandru.DOBJANSCHI
 * @since 9:54 AM 12/2/13
 */
public class FilePropertiesReader {

    private static final Logger LOG = Logger.getLogger(FilePropertiesReader.class.getName());

    /**
     * Read lines from a given file and adds them to the given map.
     * @param theFile
     * @param properties
     */
    public static void readLinesFromFile(File theFile, Map<String, String> properties) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(theFile));

            String str;
            while ( (str = reader.readLine()) != null) {
                // One line
                if (str.startsWith("#")) {
                    // Skip this line.
                    LOG.finer("Skipping line starting with # (comment) - " + str);

                } else {

                    int idx = str.indexOf('=');
                    properties.put(str.substring(0, idx), str.substring(idx + 1));

                }
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
            // Do nothing, file cannot be read.
        }

    }
}
