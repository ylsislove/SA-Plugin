package com.yain.plugin.api;

/**
 * 打印机插件接口
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/14 4:15
 */
public interface IPrinter {

    /**
     * 打印
     * @param msg 内容
     * @return 打印值
     */
    String print(String msg);

}
