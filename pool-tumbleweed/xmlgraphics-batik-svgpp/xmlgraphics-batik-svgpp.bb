SUMMARY = "Batik SVG pretty printer"
DESCRIPTION = "The SVG Pretty Printer lets developers 'pretty-up' their SVG files and \
get their tabulations and other cosmetic parameters in order. It can \
also be used to modify the DOCTYPE declaration on SVG files."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-svgpp-1.18-1.7.noarch.rpm"
RPM_HASH = "d28e37abed025cb40e5667da1b671c50a4977deb6cad6636415d7f201917a9455e335f418f546baae2f9a6610b9a477ed665135ed2c6ce55c17cdd2d7e62121f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-svgpp \
mvn-org.apache.xmlgraphics-batik-svgpp \
mvn-org.apache.xmlgraphics-batik-svgpp-pom- \
osgi-org.apache.batik.svgpp \
xmlgraphics-batik-svgpp"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.apache.xmlgraphics-batik-shared-resources \
mvn-org.apache.xmlgraphics-batik-transcoder \
mvn-org.apache.xmlgraphics-batik-util \
rhino \
xml-commons-apis \
xmlgraphics-batik \
xmlgraphics-commons"

inherit rpm
