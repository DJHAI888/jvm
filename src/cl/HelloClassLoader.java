package cl;

import java.util.Base64;

/**
 * @Description:
 * @Author: haijinqi
 * @CreateDate: 2021/6/23 上午10:57
 */
public class HelloClassLoader extends ClassLoader {


    public static void main(String[] args) throws Exception {
        new HelloClassLoader().findClass("Hello").newInstance();
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String helloBase64 = "yv66vgAAADQAHAoABgAOCQAPABAIABEKABIAEwcAFAcAFQEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVt" +
                "YmVyVGFibGUBAAg8Y2xpbml0PgEAClNvdXJjZUZpbGUBAApIZWxsby5qYXZhDAAHAAgHABYMABcAGAEAGEhlbGxvIGNsYXNzI" +
                "GluaXRpYWxpemVkIQcAGQwAGgAbAQAiY29tL2hhaS9sZXRjb2RlL2V4Y2VyY2lzZS9qay9IZWxsbwEAEGphdmEvbGFuZy9PYmp" +
                "lY3QBABBqYXZhL2xhbmcvU3lzdGVtAQADb3V0AQAVTGphdmEvaW8vUHJpbnRTdHJlYW07AQATamF2YS9pby9QcmludFN0cmVhb" +
                "QEAB3ByaW50bG4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYAIQAFAAYAAAAAAAIAAQAHAAgAAQAJAAAAHQABAAEAAAAFKrcAAb" +
                "EAAAABAAoAAAAGAAEAAAAIAAgACwAIAAEACQAAACUAAgAAAAAACbIAAhIDtgAEsQAAAAEACgAAAAoAAgAAAAsACAAMAAEADAAAAAIADQ==";
        byte[] bytes = decode(helloBase64);
        return defineClass(name, bytes, 0, bytes.length);

    }

    public byte[] decode(String base64) {
        return Base64.getDecoder().decode(base64);
    }

}
