package demo;

import java.util.Iterator;
import java.util.ServiceLoader;

import tutorial.jdk.spi.Encryption;

/**
 * 加密器主程序，负责调用加密算法的Provider。
 */
public class EncryptorApplication {

    public static void main(String[] args) {

        //准备加密数组
        byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        //加载所有加密算法
        ServiceLoader<Encryption> encryptions = ServiceLoader.load(Encryption.class);
        Iterator<Encryption> encryptionIter = encryptions.iterator();

        if (!encryptionIter.hasNext()) {
            System.out.println("there is no provider for encryption algorithm.");
        }
        //进行组合加密
        while (encryptionIter.hasNext()) {
            Encryption encryption = encryptionIter.next();
            data = encryption.encrypt(data);
        }
        //输出加密后数据
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
    }
}
