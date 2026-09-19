SUMMARY = "Apache Log4j Tag Library"
DESCRIPTION = "Apache Log4j Tag Library for Web Applications."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "log4j-taglib-2.26.1-2.1.noarch.rpm"
RPM_HASH = "8d0dd254880891ac2520ff2300db2f7c66892b66aff498fa8aae25732db88f0a52be6f521676fcf60d6d5d31d17a136c10f05a585ade8157d47906a90ef9936a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-taglib \
mvn-org.apache.logging.log4j-log4j-taglib \
mvn-org.apache.logging.log4j-log4j-taglib-pom- \
osgi-org.apache.logging.log4j.taglib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-api"

inherit rpm
