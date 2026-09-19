SUMMARY = "Batik SVG slideshow"
DESCRIPTION = "Batik SVG slideshow."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-slideshow-1.18-1.7.noarch.rpm"
RPM_HASH = "9645a2a315e6aed1860a8be0a462d9ed187c0942add50ee89d585501fe685f992d774347083d61f617c28b782b5f983bf2c22d4e4acd226a00794505da9b3ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-slideshow \
mvn-org.apache.xmlgraphics-batik-slideshow \
mvn-org.apache.xmlgraphics-batik-slideshow-pom- \
osgi-org.apache.batik.slideshow \
xmlgraphics-batik-slideshow"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.apache.xmlgraphics-batik-bridge \
mvn-org.apache.xmlgraphics-batik-gvt \
mvn-org.apache.xmlgraphics-batik-shared-resources \
mvn-xml-apis-xml-apis-ext \
rhino \
xml-commons-apis \
xmlgraphics-batik \
xmlgraphics-commons"

inherit rpm
