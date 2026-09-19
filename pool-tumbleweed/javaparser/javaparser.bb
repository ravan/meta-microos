SUMMARY = "Java Parser and Abstract Syntax Tree for Java"
DESCRIPTION = "A set of libraries implementing a Java 1.0 - Java 17 Parser with advanced \
analysis functionalities."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.28.2"

RPM_NAME = "javaparser-3.28.2-1.1.noarch.rpm"
RPM_HASH = "3cac46c4a2719a0b61ce3e7f1de3fe1c9018900ab80aa2220b7fb62364bad34e648918070deb5bf8138cacdc4a8326e169d830bef503fdb9c7024509461251a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser \
mvn-com.github.javaparser-javaparser-core \
mvn-com.github.javaparser-javaparser-core-pom- \
mvn-com.github.javaparser-javaparser-symbol-solver-core \
mvn-com.github.javaparser-javaparser-symbol-solver-core-pom- \
mvn-com.google.code.javaparser-javaparser \
mvn-com.google.code.javaparser-javaparser-pom- \
osgi-com.github.javaparser.javaparser-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-org.checkerframework-checker-qual \
mvn-org.javassist-javassist"

inherit rpm
