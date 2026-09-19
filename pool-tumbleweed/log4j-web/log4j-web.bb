SUMMARY = "Apache Log4j Web"
DESCRIPTION = "Support for Log4j in a web servlet container."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "log4j-web-2.26.1-2.1.noarch.rpm"
RPM_HASH = "ee4b61448f32bc602197effcc611b50017db35ef8b50b4d68a69412e550040fa4db29df38c41a4baebbd7c3c8b97a6c4daeb846bf54977ec253eec3e81ce0877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-web \
mvn-org.apache.logging.log4j-log4j-web \
mvn-org.apache.logging.log4j-log4j-web-pom- \
osgi-org.apache.logging.log4j.web"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-api \
mvn-org.apache.logging.log4j-log4j-core"

inherit rpm
