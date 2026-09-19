SUMMARY = "Open Source XML framework for Java"
DESCRIPTION = "dom4j is an Open Source XML framework for Java. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM and SAX and is seamlessly integrated with full XPath support."
LICENSE = "Plexus"

PV = "2.1.5"

RPM_NAME = "dom4j-2.1.5-1.3.noarch.rpm"
RPM_HASH = "e69c0dabd1736cf0b708547097a0700ba321c4b7feb0e9af6bf1bb9c7c11e2d785b7a19c10476cbc13174518c0ab237780c58da259a7f791b4d0e5244324ee8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j \
mvn-dom4j-dom4j \
mvn-dom4j-dom4j-pom- \
mvn-org.dom4j-dom4j \
mvn-org.dom4j-dom4j-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
