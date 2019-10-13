package com.yain.plugin;

import com.yain.plugin.api.IPrinter;
import com.yain.plugin.myimpl.OldPrinterImpl;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/14 4:17
 */
public class Client {

    public static void main(String[] args) {

        IPrinter printer = new OldPrinterImpl();
        String msg = printer.print("除非黄土白骨，我守你百岁无忧");
        System.out.println(msg);
        printer = getPrinter("com.plugin.otherimpl.ColorPrinterImpl");
        msg = printer.print("除非黄土白骨，我守你百岁无忧");
        System.out.println(msg);
    }

    /**
     * 获得插件中的实现
     * @param className Jar中的所需要加载的类的类名
     * @return 插件的实现类
     */
    public static IPrinter getPrinter(String className) {
        String class_path = className;
        //jar所在的文件的URL
        String jar_path = "C:\\Users\\Apple_Coco\\Desktop\\printer-plugin-impl.jar";
        try {
            //从Jar文件得到一个Class加载器
            ClassLoader cl = new URLClassLoader(new URL[]{new File(jar_path).toURI().toURL()});
            //从加载器中加载Class
            Class<?> c = cl.loadClass(class_path);
            //从Class中实例出一个对象
            IPrinter sif = (IPrinter) c.newInstance();
            return sif;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
