SUMMARY = "Java Programming Assistant: bytecode manipulation"
DESCRIPTION = "Javassist (Java Programming Assistant) makes Java bytecode manipulation \
simple. It is a class library for editing bytecodes in Java; it enables \
Java programs to define a new class at runtime and to modify a class \
file when the JVM loads it. Unlike other similar bytecode editors, \
Javassist provides two levels of API: source level and bytecode level. \
If the users use the source-level API, they can edit a class file \
without knowledge of the specifications of the Java bytecode. The whole \
API is designed with only the vocabulary of the Java language. You can \
even specify inserted bytecode in the form of source text; Javassist \
compiles it on the fly. On the other hand, the bytecode-level API \
allows the users to directly edit a class file as other editors."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.30.2"

RPM_NAME = "javassist-3.30.2-1.8.noarch.rpm"
RPM_HASH = "96ccf3c90c8d02a9444ee0619c1965b4c367b4ec06c2ff858d49073a9b5b2ca50c6b7eacb95d30313e931469711e7e09f0b5f8fda1b108bcf680c2fe892c4921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist \
mvn-javassist-javassist \
mvn-javassist-javassist-pom- \
mvn-org.javassist-javassist \
mvn-org.javassist-javassist-pom- \
osgi-javassist"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
