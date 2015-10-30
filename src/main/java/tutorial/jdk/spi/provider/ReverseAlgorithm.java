package tutorial.jdk.spi.provider;

import tutorial.jdk.spi.Encryption;

/**
 * 翻转算法
 */
public class ReverseAlgorithm implements Encryption {

    /**
     * 将字节数组进行反转，返回翻转后的字节数组。
     */
    @Override
    public byte[] encrypt(byte[] data) {
        if (null == data || data.length == 0) {
            return data;
        }

        for (int i = 0, j = data.length - 1; i < j; i++, j--) {
            byte tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

        return data;
    }

}
