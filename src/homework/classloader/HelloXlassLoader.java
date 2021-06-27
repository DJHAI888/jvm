package homework.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: haijinqi
 * @CreateDate: 2021/6/23 下午4:26
 */
public class HelloXlassLoader extends ClassLoader {

    private static final String HELLO_CLASS = "Hello";

    private static final String SUFFIX = ".xlass";

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new HelloXlassLoader();
        Class<?> clazz = classLoader.loadClass(HELLO_CLASS);
        String methodName = null;
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(clazz.getSimpleName() + "." + m.getName());
            methodName = m.getName();
        }
        if (methodName == null) {
            return;
        }
        // 创建对象
        Object instance = clazz.getDeclaredConstructor().newInstance();
        // 调用实例方法
        Method method = clazz.getMethod(methodName);
        method.invoke(instance);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try (InputStream inputStream =
                     this.getClass().getClassLoader().getResourceAsStream(name + SUFFIX)){
            int length = inputStream.available();
            byte[] byteArray = new byte[length];
            inputStream.read(byteArray);
            byte[] classBytes = decode(byteArray);
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(name, e);
        }
    }

    private static byte[] decode(byte[] byteArray) {
        byte[] targetArray = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            targetArray[i] = (byte) (255 - byteArray[i]);
        }
        return targetArray;
    }

}
