SUMMARY = "XML Graphics Commons"
DESCRIPTION = "Apache XML Graphics Commons is a library that consists of \
several reusable components used by Apache Batik and \
Apache FOP. Many of these components can easily be used \
separately outside the domains of SVG and XSL-FO. You will \
find components such as a PDF library, an RTF library, \
Graphics2D implementations that let you generate PDF & \
PostScript files, and much more."
LICENSE = "Apache-2.0"

PV = "2.11"

RPM_NAME = "xmlgraphics-commons-2.11-1.2.noarch.rpm"
RPM_HASH = "dd07d24d5ea2a47824fe2af93aac6f8e29e1bbc56c33b038f6a55b29eb164dfae88ebce0705b3ac166300235178006d9a3bf78b9c2e216deaa480f16b0cf973c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.xmlgraphics-xmlgraphics-commons \
mvn-org.apache.xmlgraphics-xmlgraphics-commons-pom- \
osgi-org.apache.xmlgraphics \
xmlgraphics-commons"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-commons-logging-commons-logging"

inherit rpm
