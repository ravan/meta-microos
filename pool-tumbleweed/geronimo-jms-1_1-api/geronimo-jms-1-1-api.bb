SUMMARY = "Geronimo JMS 1.1 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JMS Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jms-1_1-api-1.2-41.6.noarch.rpm"
RPM_HASH = "938b0edc18827af2a52edf4167ef524bbd3e73c1f88bf6d021219b7fd674800cfd5175517f7bd51bd30b2de09653c2c0b54fb32a56b92322c2026ed897a3a1ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jms-1-1-api \
mvn-javax.jms-jms \
mvn-javax.jms-jms-pom- \
mvn-org.apache.geronimo.specs-geronimo-jms-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jms-1.1-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
