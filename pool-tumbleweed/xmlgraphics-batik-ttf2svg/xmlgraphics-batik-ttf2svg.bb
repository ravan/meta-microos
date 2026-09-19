SUMMARY = "Batik SVG font converter"
DESCRIPTION = "The SVG Font Converter lets developers convert character ranges from \
the True Type Font format to the SVG Font format to embed in SVG \
documents. This allows SVG document to be fully self-contained be \
rendered exactly the same on all systems."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-ttf2svg-1.18-1.7.noarch.rpm"
RPM_HASH = "07aa4bb20d7a0d1df3cf8b969412ef3adc87c4fe56aca2339365b5524de78c2a837bf51856bae1275cfec23c6607f0c7d3fbe047d7283ef9299aa63ec9116dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-ttf2svg \
mvn-org.apache.xmlgraphics-batik-ttf2svg \
mvn-org.apache.xmlgraphics-batik-ttf2svg-pom- \
osgi-org.apache.batik.ttf2svg \
xmlgraphics-batik-ttf2svg"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.apache.xmlgraphics-batik-shared-resources \
mvn-org.apache.xmlgraphics-batik-svggen \
rhino \
xml-commons-apis \
xmlgraphics-batik \
xmlgraphics-commons"

inherit rpm
