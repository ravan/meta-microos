SUMMARY = "SLF4J Extensions Module"
DESCRIPTION = "Extensions to the SLF4J API."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-ext-2.0.18-1.2.noarch.rpm"
RPM_HASH = "002ffc13de82f8537bde82a9e0198d2e640a616abbded53926f7858d4c3c6a44104b9d63177d80366b836469a75bd85b57ccd0c3c1be653dcc0b7be89d6ff83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-ext \
mvn-org.slf4j-slf4j-ext-pom- \
osgi-slf4j.ext \
slf4j-ext"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
