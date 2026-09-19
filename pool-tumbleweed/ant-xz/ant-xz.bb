SUMMARY = "Opional xz tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional xz tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-xz-1.10.18-1.1.noarch.rpm"
RPM_HASH = "51ef64259291641277dc94bd00d1edcbec51cc1f6973ad05c3a68a0e6647984c7128f281a40afb17bd3e5d8bbaa4d74ce334ee2863728a272a80fbc736bbf8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-xz \
config-ant-xz \
mvn-org.apache.ant-ant-xz \
mvn-org.apache.ant-ant-xz-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.tukaani-xz \
xz-java"

inherit rpm
