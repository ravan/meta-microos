SUMMARY = "Apache Log4j Commons Logging Bridge"
DESCRIPTION = "Apache Log4j Commons Logging Bridge."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "log4j-jcl-2.26.1-2.1.noarch.rpm"
RPM_HASH = "b8883fa51fa2b3e1348de96e4aa111ae9bf42fa68577b6dd217f5a994c92de79d2157199457bbac915f342aa11bfd0406e2b7bd60a7d3f87d1855379ec816222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-jcl \
mvn-org.apache.logging.log4j-log4j-jcl \
mvn-org.apache.logging.log4j-log4j-jcl-pom- \
osgi-org.apache.logging.log4j.jcl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.apache.logging.log4j-log4j-api"

inherit rpm
