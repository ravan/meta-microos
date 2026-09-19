SUMMARY = "Resolver subproject of xml-commons"
DESCRIPTION = "Resolver subproject of xml-commons."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "xml-commons-resolver-1.2-5.11.noarch.rpm"
RPM_HASH = "933d3a2a7bfbac6ab97357e1b11bb200fc5794f8249579d4ce52a4b1b312af9ce74d95942cb20da6198d59a602259043412231df046a7a6c2a18f172c125abb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xml-commons-resolver \
mvn-xml-resolver-xml-resolver \
mvn-xml-resolver-xml-resolver-pom- \
osgi-org.apache.xml.resolver \
xerces-j2-xml-resolver \
xml-commons \
xml-commons-resolver \
xml-commons-resolver10 \
xml-commons-resolver11 \
xml-commons-resolver12 \
xml-resolver"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
