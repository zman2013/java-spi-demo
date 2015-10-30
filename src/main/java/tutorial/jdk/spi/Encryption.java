package tutorial.jdk.spi;

/**
 * 加密算法接口
 * 此接口为标注Java SPI，所有加密算法实现实现应当遵循此SPI。
 */
public interface Encryption {

    /**
     * 对data进行加密，然后返回加密数据。
     * 
     * @param data
     *            字节数组
     * @return 加密后的数据
     */
    byte[] encrypt(byte[] data);
}
