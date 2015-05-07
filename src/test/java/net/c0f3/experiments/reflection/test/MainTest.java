package net.c0f3.experiments.reflection.test;

import net.c0fe.experiments.reflection.CryptByteCode;
import org.junit.Ignore;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * kostapc on 07.05.15.
 */
public class MainTest {

    @Test
    public void crypt() {
        String folder = "./data/";
        String file = "./data/Print5Digits.class";
        CryptByteCode.cryptNormalClass(folder,file);
    }

    @Test
    @Ignore
    public void decrypt() {
        String file = "./data/Print5Digits.claxx";
        CryptByteCode.runCryptedClass(file, new String[] {});
    }
}
