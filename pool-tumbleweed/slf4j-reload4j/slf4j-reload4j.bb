SUMMARY = "SLF4J LOG4J-12 Binding"
DESCRIPTION = "SLF4J LOG4J-12 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-reload4j-2.0.18-1.2.noarch.rpm"
RPM_HASH = "a6abc3b703a575a23629feefd27fc39ebde09beaf2f4e2ade013552abfd0fae5399d0e3e7d10706e23b6cf3460ca1b9161608c6d0bb8c75e9b6a0822d0b341d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-log4j12 \
mvn-org.slf4j-slf4j-log4j12-pom- \
mvn-org.slf4j-slf4j-reload4j \
mvn-org.slf4j-slf4j-reload4j-pom- \
osgi-slf4j.reload4j \
slf4j-reload4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.reload4j-reload4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
