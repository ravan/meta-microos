SUMMARY = "Utilities to assist with developing IO functionality"
DESCRIPTION = "Commons-IO contains utility classes, stream implementations, \
file filters, and endian classes. It is a library of utilities \
to assist with developing IO functionality."
LICENSE = "Apache-2.0"

PV = "2.22.0"

RPM_NAME = "apache-commons-io-2.22.0-1.3.noarch.rpm"
RPM_HASH = "9fb61fbbbf7292b9f8d0b7116eae7d992e7d057dbd37d8a0ee5b30af9e5f85a9e5288434694858751d53d0a3e54d4489ff9dbc00684e1c58a4bc1cfcfd6d4d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-io \
commons-io \
jakarta-commons-io \
mvn-commons-io-commons-io \
mvn-commons-io-commons-io-pom- \
mvn-org.apache.commons-commons-io \
mvn-org.apache.commons-commons-io-pom- \
osgi-org.apache.commons.commons-io"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
