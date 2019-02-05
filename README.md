# Thorntail JDK-specific bits

This Maven project produces a single artifact, whose coordinates
are `io.thorntail.jdk-specific:thorntail-jdk-specific`. The artifact
is a multi-release JAR (see [JEP 238](https://openjdk.java.net/jeps/238))
and contains several utility classes that are implemented
differently between Java 8 and Java 9+. This is required on a few
places in the Thorntail core, and we build it as a separate
project to make sure that the main Thorntail project can stay
on Java 8.

In addition to the utility classes, a few JBoss Modules classes are
overridden here. The main Thorntail codebase already carries a few
patches to JBoss Modules, so it's natural to ask why are these
overrides present here. The reason is same as above -- these changes
need to be built with Java 9+, and we want the main project to stay
on Java 8.

This project is only meant for use inside the Thorntail codebase
and can't be treated as public API.
