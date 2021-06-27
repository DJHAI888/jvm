package cl;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Objects;

/**
 * @Description:
 * @Author: haijinqi
 * @CreateDate: 2021/6/23 上午10:34
 */
public class JvmClassLoaderPrintPath {

    public static void main(String[] args) {
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        System.out.println("启动类加载器");
        for (URL url : urls) {
            System.out.println(" ======> " + url.toExternalForm());
        }
        printClassloader("扩展类加载器", JvmClassLoaderPrintPath.class.getClassLoader().getParent());
        printClassloader("应用类加载器", JvmClassLoaderPrintPath.class.getClassLoader());

    }


    private static void printClassloader(String name, ClassLoader classLoader) {
        System.out.println(
        );

        if (Objects.nonNull(classLoader)) {
            System.out.println(name + "Classloader ->" + classLoader.toString());
            printURLForClassloader(classLoader);
        } else {
            System.out.println(name + "Classloader -> null" );
        }
    }

    private static void printURLForClassloader(ClassLoader classLoader) {
        Object ucp = insightField(classLoader, "ucp");
        Object path = insightField(ucp, "path");
        List paths = (List) path;
        for (Object p : paths) {
            System.out.println(" ===> " + p.toString());
        }
    }

    private static Object insightField(Object obj, String fName) {
        Field f = null;
            try {
                if (obj instanceof URLClassLoader) {
                    f = URLClassLoader.class.getDeclaredField(fName);
                } else {
                    f = obj.getClass().getDeclaredField(fName);
                }
                f.setAccessible(true);
                return f.get(obj);
            } catch (Exception e) {

            }
            return null;
    }


}
