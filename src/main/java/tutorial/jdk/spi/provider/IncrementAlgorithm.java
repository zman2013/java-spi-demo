package tutorial.jdk.spi.provider;

import tutorial.jdk.spi.Encryption;

/**
 * 遍历所有字节，对所有字节+1。
 */
public class IncrementAlgorithm implements Encryption {

    /**
     * 对数组中所有字节+1，返回修改后的字节数组。
     */
    @Override
    public byte[] encrypt(byte[] data) {
        if (null == data || data.length == 0) {
            return data;
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (data[i] + 1);
        }

        return data;
    }

}
