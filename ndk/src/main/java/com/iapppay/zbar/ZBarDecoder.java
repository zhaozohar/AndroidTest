package com.iapppay.zbar;

/**
 * @author xiaoniu
 * @date 2019/5/28.
 *
 * https://blog.csdn.net/zxl1173558248/article/details/81701967
 * https://blog.csdn.net/skillcollege/article/details/38855023
 */
public class ZBarDecoder {

//    static {
////        System.loadLibrary("ZBarDecoder");
////    }

    /**
     * 解码方法
     *
     * @param data
     * @param width
     * @param height
     * @return
     */
    public native String decodeRaw(byte[] data, int width, int height);

    /**
     * @param data
     * @param width
     * @param height
     * @param x
     * @param y
     * @param cwidth
     * @param cheight
     * @return
     */
    public native String decodeCrop(byte[] data, int width, int height, int x, int y, int cwidth, int cheight);

}
