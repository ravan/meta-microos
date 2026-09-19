SUMMARY = "Java alternative to DOM and SAX"
DESCRIPTION = "JDOM is, quite simply, a Java representation of an XML document. JDOM \
provides a way to represent that document for easy and efficient \
reading, manipulation, and writing. It has a straightforward API, is a \
lightweight and fast, and is optimized for the Java programmer. It's an \
alternative to DOM and SAX, although it integrates well with both DOM \
and SAX."
LICENSE = "Saxpath"

PV = "1.1.3"

RPM_NAME = "jdom-1.1.3-42.9.noarch.rpm"
RPM_HASH = "c1091cf6bd98330fc30953d32b7fa984231b9bfe532927506155aa5203e720cb0a0ee38a105bf2c27a079b76455f5fa33aed1fb28418bbc6798d29511f476060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom \
mvn-jdom-jdom \
mvn-jdom-jdom-pom- \
mvn-org.jdom-jdom \
mvn-org.jdom-jdom-legacy \
mvn-org.jdom-jdom-legacy-pom- \
mvn-org.jdom-jdom-pom- \
osgi-org.jdom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
