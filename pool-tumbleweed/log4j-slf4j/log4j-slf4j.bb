SUMMARY = "Binding between LOG4J 2 API and SLF4J"
DESCRIPTION = "Binding between LOG4J 2 API and SLF4J."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "log4j-slf4j-2.26.1-2.1.noarch.rpm"
RPM_HASH = "1522a48faff8923e46089dc8991afe1367e739ba379cd2c51bc2ac75fb72c139c478872c47390b37771457cc5039b62c7309074ba08a378f0f98dc71b19f4573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-slf4j \
mvn-org.apache.logging.log4j-log4j-slf4j-impl \
mvn-org.apache.logging.log4j-log4j-slf4j-impl-pom- \
mvn-org.apache.logging.log4j-log4j-slf4j2-impl \
mvn-org.apache.logging.log4j-log4j-slf4j2-impl-pom- \
mvn-org.apache.logging.log4j-log4j-to-slf4j \
mvn-org.apache.logging.log4j-log4j-to-slf4j-pom- \
osgi-org.apache.logging.log4j.slf4j2.impl \
osgi-org.apache.logging.log4j.to.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-api \
mvn-org.apache.logging.log4j-log4j-core \
mvn-org.slf4j-slf4j-api"

inherit rpm
