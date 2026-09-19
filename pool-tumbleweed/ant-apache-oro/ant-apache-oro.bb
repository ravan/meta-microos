SUMMARY = "Optional apache oro tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache oro tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-apache-oro-1.10.18-1.1.noarch.rpm"
RPM_HASH = "c05bd7530a4291067c74cb1dc464b836ad3dbbff801bee09cf95027814345376562a524ce63bc6485e83f68df820b89067d8a04e32fb0db92670cb28a0bf0ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-oro \
ant-jakarta-oro \
config-ant-apache-oro \
mvn-org.apache.ant-ant-apache-oro \
mvn-org.apache.ant-ant-apache-oro-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-oro-oro \
oro"

inherit rpm
