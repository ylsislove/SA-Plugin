package com.yain.plugin.myimpl;

import com.yain.plugin.api.IPrinter;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/14 4:18
 */
public class OldPrinterImpl implements IPrinter {
    @Override
    public String print(String msg) {
        return "这是老式打印机打印出的内容：" + msg;
    }
}
