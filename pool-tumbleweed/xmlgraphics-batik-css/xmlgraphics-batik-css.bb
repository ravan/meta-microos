SUMMARY = "Batik CSS engine"
DESCRIPTION = "CSS component of the Apache Batik SVG manipulation and rendering library."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-css-1.18-1.7.noarch.rpm"
RPM_HASH = "40f8a5b17f604f7ee18320dd001eca95494aace301179669aea253c9d4d1e43c3e9cbad52d23ad53b71462bcce9325fba19c06721bd8bbb1629585a088f5ea4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-css \
mvn-org.apache.xmlgraphics-batik-css \
mvn-org.apache.xmlgraphics-batik-css-pom- \
osgi-org.apache.batik.css \
xmlgraphics-batik-css"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.xmlgraphics-batik-shared-resources \
mvn-org.apache.xmlgraphics-batik-util \
mvn-xml-apis-xml-apis-ext \
xmlgraphics-batik"

inherit rpm
