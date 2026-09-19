SUMMARY = "Apache Commons Digester"
DESCRIPTION = "The Apache Commons Digester package lets you configure an XML to Java object \
mapping module which triggers certain actions called rules whenever a \
particular pattern of nested XML elements is recognized."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "apache-commons-digester3-3.2-3.3.noarch.rpm"
RPM_HASH = "44b95c2bb33de903bf34e768cae8a89eeb3c09494f5385abc3e5a8990c73b8a8bb450934ffcbd0553a7f807215ad55dade5ed44ace234709ad1471cfb4b2d733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester3 \
mvn-org.apache.commons-commons-digester3 \
mvn-org.apache.commons-commons-digester3-pom- \
osgi-org.apache.commons.commons-digester3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-cglib-cglib \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-logging-commons-logging"

inherit rpm
