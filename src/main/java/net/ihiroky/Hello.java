package net.ihiroky;

/**
 *
 */
public class Hello {

    public static void main(String[] args) {
        new Hello().printSystemProperties();
    }

    public void printSystemProperties() {
        java.util.Properties p = System.getProperties();
        for (String key : p.stringPropertyNames()) {
            System.out.println(key + " = " + p.getProperty(key));
        }
    }
}
