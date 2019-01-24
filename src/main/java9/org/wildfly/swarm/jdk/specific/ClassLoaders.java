package org.wildfly.swarm.jdk.specific;

/**
 * Java 9+ variant of a JDK-specific class for working with {@code ClassLoader}s.
 */
public class ClassLoaders {
    /**
     * Returns the classloader that has access to all platform classes. On Java 8, that's {@code null}, the bootstrap
     * classloader. On Java 9+, that's {@code ClassLoader.getPlatformClassLoader()}, the platform classloader.
     * Useful as a parent classloader when creating a new {@code URLClassLoader}.
     */
    public static ClassLoader getPlatformClassLoader() {
        return ClassLoader.getPlatformClassLoader();
    }
}
