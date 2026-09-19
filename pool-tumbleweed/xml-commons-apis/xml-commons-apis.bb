SUMMARY = "APIs for DOM, SAX, and JAXP"
DESCRIPTION = "xml-commons-apis is designed to organize and have common packaging for \
the various externally-defined standard interfaces for XML. This \
includes the DOM, SAX, and JAXP."
LICENSE = "Apache-2.0 & W3C & LicenseRef-SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-1.4.01-7.3.noarch.rpm"
RPM_HASH = "b6d81a1e6ae200e823ed10e2e48652daf0a62795a756f5039d49a06a9ad49b99a0a09a0b44f14d6d877d8492a54c3f0e93e704af0e93c4e003866cc155abe4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xerces-dom3-xml-apis \
mvn-xerces-dom3-xml-apis-pom- \
mvn-xml-apis-xml-apis \
mvn-xml-apis-xml-apis-ext \
mvn-xml-apis-xml-apis-ext-pom- \
mvn-xml-apis-xml-apis-pom- \
osgi-javax.xml \
osgi-org.w3c.dom.svg \
xerces-j2-xml-apis \
xml-apis \
xml-commons-apis \
xml-commons-jaxp-1.1-apis \
xml-commons-jaxp-1.2-apis \
xml-commons-jaxp-1.3-apis \
xml-commons-jaxp-1.4-apis"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
