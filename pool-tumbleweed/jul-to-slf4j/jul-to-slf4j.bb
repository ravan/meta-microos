SUMMARY = "JUL to SLF4J bridge"
DESCRIPTION = "JUL to SLF4J bridge."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "jul-to-slf4j-2.0.18-1.2.noarch.rpm"
RPM_HASH = "3340a75df09ff398651bd1086c3c19f8994e1903463fb893066684acb1e12c9f29278a3e53e7da31ae6feda380cef63bf39f963e13f087c0cd5b2bae9b13f620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jul-to-slf4j \
mvn-org.slf4j-jul-to-slf4j \
mvn-org.slf4j-jul-to-slf4j-pom- \
osgi-jul.to.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
