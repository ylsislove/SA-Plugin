package com.plugin.otherimpl;


import com.yain.plugin.api.IPrinter;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/14 4:45
 */
public class ColorPrinterImpl implements IPrinter {
    @Override
    public String print(String msg) {
        return "这是彩色打印机打印出的内容：" + msg;
    }
}
