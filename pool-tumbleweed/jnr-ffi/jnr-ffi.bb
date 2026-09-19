SUMMARY = "Java Abstracted Foreign Function Layer"
DESCRIPTION = "JNR-FFI is a Java library for loading native libraries without writing JNI code \
by hand, or using tools such as SWIG."
LICENSE = "Apache-2.0"

PV = "2.2.13"

RPM_NAME = "jnr-ffi-2.2.13-2.10.noarch.rpm"
RPM_HASH = "276ca6a83b7b58ac50b688a166f815cb71ea809dbc7a3498c42198f0df7623300862035bfca1cf45b7241cfb630cc00c715e2e158cec3041548b3d80e6da24d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-ffi \
mvn-com.github.jnr-jnr-ffi \
mvn-com.github.jnr-jnr-ffi-pom- \
osgi-com.github.jnr.ffi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jffi \
mvn-com.github.jnr-jffi--native- \
mvn-com.github.jnr-jnr-a64asm \
mvn-com.github.jnr-jnr-x86asm \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util"

inherit rpm
