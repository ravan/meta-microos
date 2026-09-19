SUMMARY = "Multi-Schema Validator Generator"
DESCRIPTION = "Multi-Schema Validator Generator."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-xmlgen-2013.6.1-7.2.noarch.rpm"
RPM_HASH = "fc7d31710d4202448c37fd122a9c6a418f98117cd5612214d1d145ed57dc57db817395c463d40c0cb05845ff6ddd59947daeeb7ab18b210e22fbc628c3667b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-xmlgen \
mvn-net.java.dev.msv-msv-generator \
mvn-net.java.dev.msv-msv-generator-pom- \
osgi-net.java.dev.msv.generator"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-net.java.dev.msv-msv-core \
mvn-net.java.dev.msv-xsdlib \
mvn-xerces-xercesImpl \
mvn-xml-resolver-xml-resolver"

inherit rpm
