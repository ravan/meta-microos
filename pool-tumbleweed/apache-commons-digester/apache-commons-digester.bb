SUMMARY = "Jakarta Commons Digester Package"
DESCRIPTION = "The goal of the Jakarta Commons Digester project is to create and \
maintain an XML to Java object mapping package written in the Java \
language to be distributed under the ASF license."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "apache-commons-digester-2.1-5.8.noarch.rpm"
RPM_HASH = "8731a5b31618cca3acbbfcb7a9793b926f465ae6259f2cf5c042e865a77e396b5222bd6f2b18a406f3c19898c08d7bc26cd2de57b5b0934c0fddaa564deb1eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester \
commons-digester \
jakarta-commons-digester \
mvn-commons-digester-commons-digester \
mvn-commons-digester-commons-digester-pom- \
mvn-org.apache.commons-commons-digester \
mvn-org.apache.commons-commons-digester-pom- \
osgi-org.apache.commons.commons-digester"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-logging-commons-logging"

inherit rpm
