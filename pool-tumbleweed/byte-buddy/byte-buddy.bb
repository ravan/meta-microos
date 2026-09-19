SUMMARY = "Runtime code generation for the Java virtual machine"
DESCRIPTION = "Byte Buddy is a code generation and manipulation library for creating and \
modifying Java classes during the runtime of a Java application and without the \
help of a compiler. Other than the code generation utilities that ship with the \
Java Class Library, Byte Buddy allows the creation of arbitrary classes and is \
not limited to implementing interfaces for the creation of runtime proxies. \
Furthermore, Byte Buddy offers a convenient API for changing classes either \
manually, using a Java agent or during a build."
LICENSE = "Apache-2.0"

PV = "1.18.8"

RPM_NAME = "byte-buddy-1.18.8-1.2.noarch.rpm"
RPM_HASH = "90967ac72594a5927577f172f46e51ae4653ecaf28532c37f9057f66530b5903161e51b1e14f283406c01522e90de68a57997e49e30efc45eda64332481216cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byte-buddy \
mvn-net.bytebuddy-byte-buddy \
mvn-net.bytebuddy-byte-buddy-dep \
mvn-net.bytebuddy-byte-buddy-dep-pom- \
mvn-net.bytebuddy-byte-buddy-pom- \
osgi-net.bytebuddy.byte-buddy"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons"

inherit rpm
