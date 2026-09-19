SUMMARY = "SLF4J JDK14 Binding"
DESCRIPTION = "SLF4J JDK14 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-jdk14-2.0.18-1.2.noarch.rpm"
RPM_HASH = "ebf2adb9f60f7d93f52d6d3d42a2af06ecfc7dce44b2cdef670561c1371da24f24b4447eee8443a4fdc6241c663d68337833df95ff4baca5da00d26412d74db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-jdk14 \
mvn-org.slf4j-slf4j-jdk14-pom- \
osgi-slf4j.jdk14 \
slf4j-jdk14"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
