SUMMARY = "Batik SVG browser"
DESCRIPTION = "The Squiggle SVG Browser lets you view SVG file, zoom, pan and rotate \
in the content and select text items in the image and much more."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-squiggle-1.18-1.7.noarch.rpm"
RPM_HASH = "47c30c7aeae359954870cb1039e6c73179ba3bef34e49534ea121b7f72e3293fda3f7694972aa4e6667387575a9305b3f4e17db05128c3f93532d8b23d0e90c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-squiggle \
mvn-org.apache.xmlgraphics-batik-squiggle \
mvn-org.apache.xmlgraphics-batik-squiggle-ext \
mvn-org.apache.xmlgraphics-batik-squiggle-ext-pom- \
mvn-org.apache.xmlgraphics-batik-squiggle-pom- \
osgi-org.apache.batik.squiggle \
osgi-org.apache.batik.squiggle-ext \
xmlgraphics-batik-squiggle"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.apache.xmlgraphics-batik-extension \
mvn-org.apache.xmlgraphics-batik-shared-resources \
mvn-org.apache.xmlgraphics-batik-svgbrowser \
rhino \
xml-commons-apis \
xmlgraphics-batik \
xmlgraphics-commons"

inherit rpm
